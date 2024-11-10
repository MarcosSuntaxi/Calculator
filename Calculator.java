public class Calculator {

    public static void main(String[] args) {
        System.out.println("Calculadora básica con operaciones predefinidas");

        // Datos quemados en el código
        double num1 = 10.5;   // Primer número
        double num2 = 5.2;    // Segundo número
        
        // Realizar y mostrar las operaciones
        System.out.println("Números: " + num1 + " y " + num2);

        // Suma
        double suma = num1 + num2;
        System.out.println("Suma: " + suma);

        // Resta
        double resta = num1 - num2;
        System.out.println("Resta: " + resta);

        // Multiplicación
        double multiplicacion = num1 * num2;
        System.out.println("Multiplicación: " + multiplicacion);

        // División
        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("División: " + division);
        } else {
            System.out.println("Error: División por cero no permitida.");
        }
    }
}