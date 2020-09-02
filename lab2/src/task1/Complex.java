package task1;

public class Complex {
    private int real;
    private int imaginary;
    Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    Complex(){
        this(0,0);
    }
    Complex(Complex obiect){
        this.real= obiect.real;
        this.imaginary = obiect.real;
    }
    int GetReal(){
        return this.real;
    }
    int GetImaginary(){
        return this.imaginary;
    }
    void SetReal(int real){
        this.real = real;
    }
    void GetImaginary(int imaginary){
        this.imaginary = imaginary;
    }
    void AddWithComplex(Complex obiect){
        this.real = this.real + obiect.real;
        this.imaginary =  this.imaginary + obiect.imaginary;
    }
    void ShowNumber(){
        System.out.println(real+"+"+imaginary+"*i");
    }

}
