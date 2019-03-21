package ejercicio_a;
    


import java.util.Scanner;
/**
 *
 * @author munchi
 */
public class Pedir_Datos_a {
    Scanner Teclado = new Scanner(System.in);
    @Override
    public String toString(){
         System.out.println("--------------TOMA DE DATOS PARA 2D y 3D-----------");
         System.out.print("-->Introduce las tres coordenadas: ");
         Punto2D punto3D = new Punto3D(Teclado.nextDouble(),Teclado.nextDouble(),Teclado.nextDouble());
         //downcasting
         if(punto3D instanceof Punto3D){
            System.out.println("Las cordenadas X Y Z son: ["+punto3D.getX()+", "+punto3D.getY()+", "+((Punto3D)punto3D).getZ()+"]");
         }
         
         
         System.out.println("------------TOMAR DATOS PARA LINEA 2D--------------");
         System.out.print("-->Introduce las cuatro cordenadas (x1,y1)|(x2,y2): ");
         Punto2D linea = new Linea2D(new Punto2D(Teclado.nextDouble(),Teclado.nextDouble()),new Punto2D(Teclado.nextDouble(),Teclado.nextDouble()));
         if (linea instanceof Linea2D){
            System.out.println("Cordenadas de punto inicial y final de linea: ["+
                    ((Linea2D) linea).getX()+" "+((Linea2D) linea).getY()+" "+
                    ((Linea2D) linea).puntofinal.getX()+""+((Linea2D) linea).puntofinal.getY()+"]");
         }
         
         
        System.out.println("-------PUNTO 2D----------");
        System.out.println("Las cordenadas son: "+((Punto3D)punto3D).mostrarXY());
        System.out.println("La X es: "+punto3D.getX());
        System.out.println("La Y es: "+punto3D.getY());
        
        
        System.out.println("-------PUNTO 3D---------");
        if (punto3D instanceof Punto3D ){
            System.out.println("Las cordenadas son: "+((Punto3D)punto3D).toString());
            System.out.println("La X es: "+punto3D.getX());
            System.out.println("La Y es: "+punto3D.getY());
            System.out.println("La Z es: "+((Punto3D) punto3D).getZ());           
        }
         
        
        System.out.println("-------LINEA 2D---------");
         if (linea instanceof Linea2D){
            System.out.println("Las coordenadas son Punto Inicial:"+
                    ((Linea2D) linea).getInicio()+" y Punto Final:"+((Linea2D) linea).getFinal());
            
             System.out.println("Coordenada del Punto Inicial:");
             System.out.println("La X es: "+linea.getX());
             System.out.println("La Y es: "+linea.getY());
             
             System.out.println("Coordenadas del Punto Final:");
             System.out.println("La X es: "+((Linea2D) linea).puntofinal.getX());
             System.out.println("La Y es: "+((Linea2D) linea).puntofinal.getY());
         }
        return "- Fina del muestreo de datos -";
    }
    
    
}
