package ejercicio_d;




import java.io.*;
import java.util.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author munchi
 */
public class Cuerpo {
    Scanner Teclado = new Scanner(System.in);
    Random Aleatorio = new Random();
    String fichero,ficheroCopia;
    public static final String[][] rango= new String[3][2]; 
    
    public Cuerpo(){
        fichero="";
        ficheroCopia="";
        rango[0][0]="Tecnico";
        rango[0][1]="35000";//Sera el numero por el que empiece a genera aleatorio 
                   
        rango[1][0]="Administrativo";
        rango[1][1]="22000";
       
        rango[2][0]="Directivo";
        rango[2][1]="55000";
        
    }
    
    
    public void pedirFichero(){
        System.out.println("-->Indica la ruta del archivo que se va ha escribir"
                    + " o como alternativa pulsa 1 para crear /home/munchi/Documentos/infoEmpresa.txt:");
        String aux=Teclado.nextLine();
        if(aux.equals("1")){
                fichero ="/home/munchi/Documentos/infoEmpresa.txt";
            }else{
                fichero =aux;
            }
           
        
    }//FIN pedirFichero()
    public void pedirFichero2(){
        System.out.println("-->Indica la ruta completa del archivo para leer"
                    + " o como alternativa pulsa 1 para crear /home/munchi/Documentos/infoEmpresa.txt:");
        String aux=Teclado.nextLine();
        if(aux.equals("1")){
                fichero ="/home/munchi/Documentos/infoEmpresa.txt";
            }else{
                fichero =aux;
            }
       
        //return new FileReader(fichero);
        
        
    }//Fin PedirFichero2()
 

    
    
    
    public void rellenarFichero(FileWriter fichero){
        int aleatorio=0;// Aleatorio.nextInt(3);
        int salario=0;//Aleatorio.nextInt()* Integer.parseInt(rango[aleatorio][2])+ Integer.parseInt(rango[aleatorio][1]);
        try {
            
        for(int $i=0;$i<100;$i++){
             aleatorio= Aleatorio.nextInt(3);
             /*crea un numero aleatorio del 1 al 10000 ya que 10000 es el rango 
                de salario de todos puestos y luego se suma el minimo de cada puesto*/
             salario=(Aleatorio.nextInt(10000)+1)+ Integer.parseInt(rango[aleatorio][1]);
            
                fichero.write("Nombre_"+($i+1)+"  Apellido_"+($i+1)+"    "+rango[aleatorio][0]+"   "+salario+" €\n\n");     
        }//Fin del for
        
        fichero.close();
            System.out.println("--Archivo Generado--");
        } catch (IOException ex) {
                System.out.println("====Identificacion del erro: "+ex+" =====");
            System.out.println("-- Vuelve a intentarlo--");
            Aprincipal_d.main(null);
            }
    }//FIn rellenarFicheros()
    
    
    
    
    public void pedirFicheroCopia(){
        System.out.println("-->Indica la ruta completa para la salida"
                    + " o como alternativa pulsa 1 para crear /home/munchi/Documentos/infoEmpresa2.txt:");
        String aux=Teclado.nextLine();
        if(aux.equals("1")){
                ficheroCopia ="/home/munchi/Documentos/infoEmpresa2.txt";
            }else{
                ficheroCopia =aux;
            }
        
    }
    
    
    
}
