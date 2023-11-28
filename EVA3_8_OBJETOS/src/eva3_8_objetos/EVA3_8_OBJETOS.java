/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_objetos;

/**
 *
 * @author Criatian Ulises
 */
public class EVA3_8_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona(); 
        //Scanner input = new Scanner(System.in)
        // int[]arreglo = new int[]
        perso1.nombre = "Juan";
        perso1.apellido = "Pèrez";
        perso1.edad = 50;
        System.out.println(perso1);
        imprimirPersona(perso1);
        
        Persona perso2 = new Persona();
        perso1.nombre = "Pedro";
        perso1.apellido = "Paramo";
        perso1.edad = 70;
        System.out.println(perso2);
        imprimirPersona(perso2);
        
        
    }
    public static void imprimirPersona(Persona perso){
        System.out.println("Direccion" + perso);
         System.out.println("Nomre completo: " + perso.nombre+ "" + perso.apellido);
         System.out.println("Edad :" + perso.edad);
    }
}

//SON PLANTILLAS
//SON TIPOS DE DATOS
class Persona {
    String nombre;
    String apellido;
    int edad;
    
}