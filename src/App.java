
import java.util.Scanner;


public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        System.out.println(" Hola Java !!");
        String codigo;
        System.out.print("Ingrese el código:");
        codigo = lector.nextLine();
        Alumno jose = new Alumno(codigo, "Jose Carlos");
        System.out.println(jose.getNombre());
        System.out.println(jose.getCodigo());
        
        
        
        
    }
    
}
