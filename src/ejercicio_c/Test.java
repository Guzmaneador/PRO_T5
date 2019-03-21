package ejercicio_c;

/**
 *
 * @author munchi
 */
public class Test 
               extends Preguntas{
    public String[] respuestas=new String[3];
    
    public Test(String enunciado,String correcta,String falsa1,String falsa2){
        
        super.setEnunciado(enunciado);  
        this.respuestas[0]=correcta;
        super.setRepuesta(this.respuestas[0]);
        this.respuestas[1]=falsa1;
        this.respuestas[2]=falsa2;
    }
    
}
