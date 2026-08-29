package OOPS;
class Fraction{
    private double num;
    private double den;

    Fraction(double num, double den){
        if (den == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.num = num;
        this.den = den;
        simplify();
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }

    void print(){
        System.out.println(num + "/" + den);
    }

    void add(Fraction f){
        num = num * f.den + den * f.num;
        den = den * f.den;
        simplify();
    }

    void multiply(Fraction f){
        num = num * f.num;
        den = den * f.den;
        simplify();
    }
    void divide(Fraction f){
        num = num * f.den;
        den = den * f.num;
        simplify();
    }

    private void simplify(){
        boolean isNegative = num*den < 0;
        num = Math.abs(num);
        den = Math.abs(den);
        double gcd = hcf(num, den);
        num = num/gcd;
        den = den/gcd;
        if(isNegative) num = - num;
    }

    private double hcf(double a, double b){
        if(a == 0) return b;
        return hcf(b%a, a);
    }

}
public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(5, 3);
        f1.print();
        Fraction f2 = new Fraction(8, 6);
        f1.add(f2);
        f1.print();
        f1.multiply(f2);
        f1.print();
        f2.divide(f1);
        f2.print();

        Fraction f3 = new Fraction(18, 12);
        f3.print();

    }
}
