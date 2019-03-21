package ejercicio_c;


import java.util.*;
/**
 *
 * @author munchi
 */
public class Simples
                extends Preguntas{
    public String respuesta,enunciado;
    
    
    public Simples(String enunciado, String respuesta){
        this.enunciado=enunciado;
        super.setEnunciado(enunciado);
        this.respuesta=respuesta;
        super.setRepuesta(this.respuesta);          
    }
    
   
    public void mostrarEnunciadoRespuesta(){
        System.out.println(this.enunciado+"_"+this.respuesta+"_");
        
    }
    @Override
    public void mostrar(){
        System.out.print(this.enunciado);
        for(int $i=0;$i<respuesta.length();$i++){
            System.out.print("_ ");
        }
        System.out.println();
        
    }
    
    
}
