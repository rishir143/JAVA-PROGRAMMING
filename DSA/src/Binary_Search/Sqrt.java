package Binary_Search;

public class Sqrt {
    public int mySqrt(int x) {
        int indx = 0;
        for (int i = 1; i <= x; i++) {
            if ((long) i * i > x) break;
            indx = i;
        }
        return indx;
    }
}
