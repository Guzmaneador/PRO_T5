package ejercicio_d;



import java.io.*;
import java.util.*;
/**
 *
 * @author munchi
 */
public class Aprincipal_d {
    public static void main (String[] args) {
        try{
            Scanner Teclado= new Scanner(System.in);
            Cuerpo Datos= new Cuerpo();
            Datos.pedirFichero();
                FileWriter fichero = new FileWriter(Datos.fichero);
            Datos.rellenarFichero(fichero);
            Datos.pedirFichero2();
                FileReader ficheroLectura = new FileReader(Datos.fichero);
            Datos.pedirFicheroCopia();
                FileWriter ficheroCopia = new FileWriter(Datos.ficheroCopia);
                //----------------COPIAR DATOS------------------------//
                int valor=ficheroLectura.read();
                while (valor != -1){
                    
                    ficheroCopia.write((char)valor);
                    valor =ficheroLectura.read();
                }
            ficheroCopia.close();
            ficheroLectura.close();
            
            
            
            
        }catch(IOException e){
            System.out.println("====Identificacion del erro: "+e+" =====");
            System.out.println("-- Vuelve a intentarlo--");
            main(null);
        }
    }
    
    
    
    
}
