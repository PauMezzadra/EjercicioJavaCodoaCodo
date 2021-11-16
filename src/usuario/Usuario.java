/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usuario;
import java.util.Scanner;
/**
 *
 * @author paume
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    String nombre;
    String apellido;
    int edad;
    String hobbie;
    String editor;
    String sistema;
    
    public Usuario(String elNombre, String elApellido, int laEdad, String elHobbie, String elEditor, String elSistema){
        nombre = elNombre;
        apellido = elApellido;
        edad =laEdad;
        hobbie = elHobbie;
        editor = elEditor;
        sistema = elSistema;
    }
    
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String elNombre;
        String elApellido;
        int laEdad;
        String elHobbie;
        String elEditor;
        String elSistema;
    
        System.out.println("Ingrese su nombre");
        elNombre = teclado.nextLine();
        System.out.println("Ingrese su apellido");
        elApellido = teclado.nextLine();
        System.out.println("Ingrese su hobbie");
        elHobbie = teclado.nextLine();
        System.out.println("Ingrese su editor");
        elEditor = teclado.nextLine();
        System.out.println("Ingrese su SO");
        elSistema = teclado.nextLine();    
        System.out.println("Ingrese su edad");
        laEdad = teclado.nextInt();
        
        Usuario user = new Usuario(elNombre, elApellido, laEdad, elHobbie, elEditor, elSistema);
        
        System.out.println("El usuario es: " + user.nombre + " " + user.apellido);
        System.out.println("Su edad es: " + user.edad);
        System.out.println("Su hobbie es: " + user.hobbie);    
        System.out.println("Su editor preferido es: " + user.editor); 
        System.out.println("Su SO es: " + user.sistema); 
        
    }
    

    

}
