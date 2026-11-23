package Merge;

import java.util.Arrays;

public class MinRoomRequired {
    class Solution {
        public int minMeetingRooms(int[] start, int[] end) {
            Arrays.sort(start);
            Arrays.sort(end);
            int n = start.length;
            int room = 0;
            int res = 0;

            int i = 0,  j = 0;
            while(i < n){
                if( start[i] < end[j]){
                    room++;
                    i++;
                    res = Math.max(res, room);
                }
                else{
                    room--;
                    j++;

                }


            }
            return res;
        }
    }

}
