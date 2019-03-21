package ejercicio_b;



import java.util.Scanner;
/**
 *
 * @author munchi
 */
public class Pedir_Datos_b {
    protected static Butaca [][] listaButacas = new Butaca [9][10];
    Scanner Teclado = new Scanner(System.in);
    public String toString(){
        
        PilaObjetos pila = new PilaObjetos();
            
        System.out.println("-----------------FILAS Y PRECIOS DE LAS BUTACAS-------------------");
        System.out.println("-->Introduce los datos por filas de las 18 butacas:");
        for(int $i=0; $i<9; $i++){
            //listaButacas.ponerObjetos(new Butaca(Teclado.nextInt()));
            pila.ponerObjetos(Teclado.nextLine());
        }
        
        System.out.println("\n--Realacion de precio con butacas para aforo de 90 personas---\n");
        
        /*Este bucle anidado recooreria el array doble a la vez que muestra la pila
        e introduce los datos de esta separados en un array a la vez q los borra de esta 
        */
        String temporal="";
        for(int $i=0, $z=8; $i<9; $i++,$z--){
            System.out.println(pila.peek());        
            temporal=(String)pila.pop();//Transformamos el contenido de tipo objeto a String
            String[] preciosFila=temporal.split(" ");
            /*Este segundo bucle se encaga de reccore el array con los precios 
            de cada butaca y meterlos en forma de objeto butaca en el array listaButacas
            a la vez q los transforma en int*/
            //for(int $z=8;$z>=0;$z--){
                for(int $y=0;$y<9;$y++){
                    listaButacas[$z][$y]=new Butaca(Integer.parseInt(preciosFila[$y]));
                }
           // }
        }
        System.out.println("");
         menu();
        
        
      return "";  
        
    }
    
    
  public void menu(){
      System.out.println("======GESTION DE VENTAS======");
        System.out.println("|    Opciones a elegir:     |");
        System.out.println("|  1.Reservar butaca.       |");
        System.out.println("|  2.Cierre de ventanilla   |");
        System.out.print("-->");
        switch (Teclado.nextInt()){
            case 1:
                reservarButacas();
                break;
                
            case 2:
                System.out.println("Gracias.");
                System.exit(0);
        }
      
  }  //FIN menu
    int reservas=0;
    
    public void reservarButacas(){
        System.out.print("-->Indica el numero de reservas:");
        reservas=Teclado.nextInt();
        for(int $i=1;$i<=reservas;$i++){
            System.out.print("-->Porfavor Indica asiento con una \"A\" o precio con una \"P\": ");
            String basura=Teclado.nextLine();
            System.out.println(asientoPrecio(Teclado.nextLine()));
            
            
        }//final del for
        menu();
        
    }//FIN reservarButacas
    
    public String asientoPrecio(String letra){
        switch(letra){
                case "A":
                    if(asientoReservado()){
                        reservas++;
                        return "-->Este asiento no esta vacio y debes escoger otro.";
                        
                    }else{   
                        return"-->Enorabuena,Este asiento esta libre para ti.";
                    }

                case "P":
                    String costo =precio();
                    return costo;  
                    
                default:
                    menu();
                    return "Parametro no reconocido.";
                    
                 
            }
    }//fin asientoPrecio()
    
    
    public boolean asientoReservado(){
        System.out.print("-->Porfavor elige la fila: ");
        int fila =Teclado.nextInt()-1;
        System.out.print("-->Porfavor elige la columna: ");
        int columna=Teclado.nextInt()-1;
        if(listaButacas[fila][columna].reservada==false){
            listaButacas[fila][columna].reservada=true;
            return false;  
        }else{
            return true;
        }
            
    }//FIN asientos()
    
    public String precio(){
        System.out.print("-->Porfavo elige el precio(10,20,30,40): ");
        int precio=Teclado.nextInt();

        for(int $i=0;$i<9;$i++){
            for(int $z=0;$z<10;$z++){
                if(listaButacas[$i][$z].precio == precio){
                    listaButacas[$i][$z].reservada=true;
                    return "-->Esta butaca["+($i+1) +", "+($z+1)+"] esta vacia y la puedes coger.";                  
                    
                }             
            }
        }
       reservas++;
       return "Ninguna disponible";
    }//FIN precio()
    
    

    
    
  
    
}
