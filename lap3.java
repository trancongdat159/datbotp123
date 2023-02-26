package bai1;
public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(){
        this.numerator=0;
        this.denominator=1;
    }
    public Fraction(int num, int den){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public int getNumerator() {
        return this.numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenominator() {
        return this.denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public Fraction (Fraction f){
        this.numerator= f.numerator;
        this.denominator= f.denominator;
    }
    public Fraction add(Fraction f){
        int newnum = this.numerator* f.denominator + this.denominator * f.numerator;
        int newden = this.denominator * f.denominator;
        return new Fraction(newnum, newden);
    } 
    public Fraction sub (Fraction f){
        int newnum = this.numerator* f.denominator - this.denominator * f.numerator;
        int newden = this.denominator * f.denominator;
        return new Fraction(newnum, newden);
    }
    public Fraction mul(Fraction f){
        int newnum = this.numerator * f.numerator;
        int newden = this.denominator * f.denominator;
        return new Fraction(newnum, newden);
    }
    public Fraction div(Fraction f){
        int newnum = this.numerator * f.denominator;
        int newden = this.denominator * f.numerator;
        return new Fraction(newnum, newden);
    }
    public int ucln (int numerator, int denominator){
        while (numerator!=denominator)
        {
            if(numerator>denominator)
                numerator=numerator-denominator;
            else 
                denominator=denominator-numerator;
        }
        return numerator;
    }
    public void reducer(){
        int i = ucln(this.numerator,this.denominator);
        this.numerator/=i;
        this.denominator/=i;
    }
    @Override
    public String toString() {
        return "{" +
            " numerator='" + getNumerator() + "'" +
            ", denominator='" + getDenominator() + "'" +
            "}";
    }
}
    
