package ejercicio_c;

/**
 *
 * @author munchi
 */
public class Preguntas {
    private String texto;
    private String correcta;
    
    public Preguntas(){
        texto="";
        correcta="";
    }
    
    public void setEnunciado(String textoEnunciado){texto=textoEnunciado;}
    
    public void setRepuesta(String respuestaCorrecta){correcta=respuestaCorrecta;}
    
    /**Comprueba un respuesta dada para la correcion.
       @param respuesta la respuesta al chequeo
       @return true si la respuesta fue correcta, false en caso contrario
    */
    public boolean miraRespuesta(String respuesta){return respuesta.equals(correcta);}
    //mostrar la cuestion
    public void mostrar() {System.out.println(texto);}
    
}
