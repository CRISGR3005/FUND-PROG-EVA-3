/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_6_paso_por_valor;

/**
 *
 * @author Criatian Ulises
 */
public class EVA3_6_PASO_POR_VALOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        System.out.println("el valor de x en el main es: " + x);
        sumarValor(x);
        System.out.println("el valor de x despues de llamar a sumarValor es: " + x);
    }
    public static void sumarValor (int valor){
        System.out.println("El valor recibido en sumaValor es: " + valor);
        valor++;
        System.out.println("el valor modificado es: " + valor);
 }
}
