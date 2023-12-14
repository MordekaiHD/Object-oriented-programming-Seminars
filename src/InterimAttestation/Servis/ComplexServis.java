package InterimAttestation.Servis;

import InterimAttestation.Data.ComplexNumber;

public class ComplexServis extends ComplexNumber {
    public ComplexServis(double real, double imaginary) {
        super(real, imaginary);
    }

    public ComplexServis add(ComplexServis other) {
        double real = getReal() + other.getReal();
        double imaginary = getImaginary() + other.getImaginary();
        return new ComplexServis(real, imaginary);
    }
    public ComplexServis multiply(ComplexServis other) {
        double newReal = getReal() * other.getReal() - getImaginary() * other.getImaginary();
        double newImaginary = getReal() * other.getImaginary() + getImaginary() * other.getReal();
        return new ComplexServis(newReal, newImaginary);
    }
    public ComplexServis divide(ComplexServis other) {
        double denominator = other.getReal() * other.getReal() + other.getImaginary() * other.getImaginary();
        double newReal = (getReal() * other.getReal() + getImaginary() * other.getImaginary()) / denominator;
        double newImaginary = (getImaginary() * other.getReal() - getReal() * other.getImaginary()) / denominator;
        return new ComplexServis(newReal, newImaginary);
    }

}
