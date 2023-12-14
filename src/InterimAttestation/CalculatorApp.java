package InterimAttestation;

import InterimAttestation.Controller.CalculatorController;
import InterimAttestation.Servis.ComplexServis;
import InterimAttestation.View.CalculatorView;

public class CalculatorApp {
    public static void main(String[] args) {
        ComplexServis complex1 = new ComplexServis(132, 99);
        ComplexServis complex2 = new ComplexServis(123, 54);
        CalculatorController controller = new CalculatorController(complex1);
        CalculatorView view = new CalculatorView();

        view.printOperationResult(controller, view, complex2, "add");
        view.printOperationResult(controller, view, complex2, "multiply");
        view.printOperationResult(controller, view, complex2, "divide");
    }
}
