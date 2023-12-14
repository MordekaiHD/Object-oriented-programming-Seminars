package InterimAttestation.Controller;

import InterimAttestation.Servis.ComplexServis;

public class CalculatorController {
    private ComplexServis model;

    public CalculatorController(ComplexServis model) {
        this.model = model;
    }
    public ComplexServis add(ComplexServis other) {
        return model.add(other);
    }
    public ComplexServis multiply(ComplexServis other) {
        return model.multiply(other);
    }
    public ComplexServis divide(ComplexServis other) {
        return model.divide(other);
    }
}