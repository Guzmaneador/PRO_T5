package ejercicio_e;



import java.util.*;
import java.io.*;
import java.lang.*;
/**
 *
 * @author munchi
 */
public class ficheroPalabras {
    Scanner Teclado = new Scanner(System.in);
    String fichero="";
    boolean existe = true;
    
    public String[] pedirFichero(){
        String[] lista;
        System.out.println("-->Indica un fichero: ");
        fichero = Teclado.nextLine();
        File Ficherito = new File(fichero);
        
        
        if (Ficherito.isFile() && Ficherito.canRead()){
            Scanner leerFichero = new Scanner(fichero);
            while (leerFichero.hasNext()){
                lista=(leerFichero.next()).split(" ");
            }
            
           
        }else{
            System.out.println("--El fichero no existe o no se puede leer--");
           pedirFichero();
        }
        
        
        //Excepcion de salida
            
    }

    

    
    
    
    
}
