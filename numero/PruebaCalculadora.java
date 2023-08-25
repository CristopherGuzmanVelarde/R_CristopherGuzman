package numero;

import javax.swing.JOptionPane;

public class PruebaCalculadora {
    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora();

        // ingresar los valores
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));

        //operaciones
        double resultadoSuma = miCalculadora.sumar(num1, num2);
        double resultadoResta = miCalculadora.restar(num1, num2);
        double resultadoMultiplicacion = miCalculadora.multiplicar(num1, num2);
        double resultadoDivision = miCalculadora.dividir(num1, num2);

        //mensaje
        String mensaje = "La suma es: " + resultadoSuma + "\n"
                + "La resta es: " + resultadoResta + "\n"
                + "La multiplicación es: " + resultadoMultiplicacion + "\n"
                + "La división es: " + resultadoDivision;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
