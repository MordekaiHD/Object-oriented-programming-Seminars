package InterimAttestation.View;

import InterimAttestation.Controller.CalculatorController;
import InterimAttestation.Servis.ComplexServis;

public class CalculatorView {
    public void printAdd(ComplexServis result) {
        System.out.println("Результат сложения: " + result.getReal() + " + " + result.getImaginary() + "i");
    }
    public void printMul(ComplexServis result) {
        System.out.println("Результат умножения: " + result.getReal() + " + " + result.getImaginary() + "i");
    }
    public void printDiv(ComplexServis result) {
        System.out.println("Результат деления: " + result.getReal() + " + " + result.getImaginary() + "i");
    }
    public void printOperationResult(CalculatorController controller, CalculatorView view, ComplexServis complex, String operation) {
        ComplexServis result = null;
        switch (operation) {
            case "add":
                result = controller.add(complex);
                view.printAdd(result);
                break;
            case "multiply":
                result = controller.multiply(complex);
                view.printMul(result);
                break;
            case "divide":
                result = controller.divide(complex);
                view.printDiv(result);
                break;
        }
    }
}
