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
    String[] lista;
    
    public String[] pedirFichero(){
        
        System.out.print("-->Indica un fichero: ");
        fichero = Teclado.nextLine();
        
        try{
            verificarFichero();
        }catch(IOException ex){
            System.out.println("--El fichero no existe o no se puede leer--");
           pedirFichero();
        }
        
        
        
        
        //Excepcion de salida
         return lista;   
    }//final metod pedir fichero 
    
    public void verificarFichero() throws IOException{
        File Ficherito = new File(fichero);
        if (Ficherito.isFile() && Ficherito.canRead()){
            Scanner leerFichero = new Scanner(fichero);
            while (leerFichero.hasNext()){
                lista=(leerFichero.next()).split(" ");
            }
            
           
        }else{
            throw new IOException();
            
        }
        
    } 

    

    
    
    
    
}
