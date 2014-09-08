package calculadora.interfaz;

/**
 * Ejercicio: Calculadora sencilla - Implementar la Interfaz de usuario -
 * Implementar los mtodos siguientes a través de los listeners adecuados: -
 * Sumar - Restar - Multiplicar - Dividir
 * 
 * @author: $Author: Omaruiz $
 */

public class CalculadoraInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaCalculadora calculadora = new VentanaCalculadora();
        calculadora.setVisible(true);
    }
    
}