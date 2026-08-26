package OOPS;

class Students{
    String name;
    private int rollno;
    double cgpa;

    void print(){
//        System.out.println( "name : "+ name + " \nrollno :  " + rollno + "\ncgpa: "  + cgpa);
        System.out.println("""
                name : %s
                rollno : %d
                cgpa : %.2f
                """.formatted(name, rollno, cgpa));
    }

    public int getter(){
        return rollno;
    }
    public void setter(int x){
        rollno = x;
    }
}


public class PrivateKeyword {
    public static void main(String[] args) {
    Students s1 = new Students();
    s1.name = "raj";
    s1.cgpa = 7.9;

    s1.setter(96);
    s1.print();
    }
}
