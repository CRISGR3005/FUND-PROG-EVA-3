/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_paso_por_refrencia;

/**
 *
 * @author Criatian Ulises
 */
public class EVA3_7_PASO_POR_REFRENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arreglo = new int [10];
        System.out.println("El valor en el arreglo main" + arreglo);
        for (int i = 0; i < arreglo.length; i++) {
          System.out.println("[" + arreglo[1] + "]");
          
        }
    }
    public static void llamararreglo(int[] valores){
        System.out.println("El valor del arrelgo en llamar arreglo es " + valores);
          for (int i = 0; i < valores.length; i++) {
             valores [i] = (int)(Math.random() * 100);
  }
 }
}
