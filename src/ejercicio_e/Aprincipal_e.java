package ejercicio_e;




import java.util.Scanner;
import ejercicio_e.EstudiaIntentos;
/**
 *
 * @author munchi
 */
public class Aprincipal_e {
    public static void main (String[] args){
        
        Scanner entradas = new Scanner(System.in);
        EstudiaIntentos objeto = new EstudiaIntentos();
        String statusJuego = "y";
        while (statusJuego.equals("y")){
            
            String palabra = objeto.obtenerPalabra();
            String palabraOculta = objeto.obtenerPalabraOculta(palabra);
            int contador = 0;
            while (!palabra.equals(palabraOculta)) {
                
                System.out.print("(¡Intental!) Introduce una letra en la palabra "+ palabraOculta +" ->");
                char ch = entradas.next().charAt(0);
                
                if(!objeto.yaEstaEnPalabra(palabraOculta, ch)){
                    palabraOculta = objeto.obtenerIntento(palabra,palabraOculta,ch);
                    if (!objeto.esCorrecta) {
                        System.out.println(ch+" Lo siento, no esta la palabra.");
                        contador++;
                    }
                }else{System.out.println(ch + " esta ya en la palabra.");}
            }
            System.out.println("La palabra era "+palabra+" y el balance de fallos es de "+contador);
            System.out.println("¿Desea Intentarlo otra vez? Responder si pulsando <y> No pulsando <n> ->");
            statusJuego = entradas.next();
        }
        
        
    }
    
}
