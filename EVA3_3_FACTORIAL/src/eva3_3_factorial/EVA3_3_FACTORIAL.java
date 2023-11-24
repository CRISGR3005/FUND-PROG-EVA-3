/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_factorial;

/**
 *
 * @author Criatian Ulises
 */
public class EVA3_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El factorial de 5 = " +  calcularFactorial (5));
        System.out.println("2 elevado a la 3 = " + calcularPotencia (2, 3));
    }
    public static int calcularFactorial (int num){
    //Factorial de 5: 1 x 2 x 3 x 4 x 5 = 120
    //Usar ciclos
    //Regresar el valor calculado 
    int resu = 1; 
    for( int i = 1;  i <= num;  i ++) {
    resu *= i; //resu =  resu * i;
    }
    return resu;   
  }
    public static int calcularPotencia (int base, int exp){
    int resu = 1;
    for (int i = 0; i < exp; i++){
    resu *= base; // resu = resu * base
   }
   return resu;
  }
}
