package ejercicio_b;


//LA PILA SE TRANFORMA EN UN SUPEr PILAR que extiende a una clase ARRAYLIST
//    extender arraylistobject; aplicado array de supero objetos
import java.util.ArrayList;
/**
 *
 * @author munchi
 */
public class PilaObjetos 
                       extends ArrayList<Object>  {
   // private ArrayList<Object> lista = new ArrayList<>();
    
    
    protected Object pop() {
        Object o = get(darTalla()-1);
        remove(darTalla()-1);
        return o;
    }
    
    protected Object peek() { 
        return get(darTalla() - 1);
    }
    
    protected int darTalla() { return size(); }
    
    protected boolean estaVacia() { return isEmpty(); }

    protected void ponerObjetos(Object o) { add(o);}
    
    @Override
    public String toString() { return "pila de objetos: " + toString();}
    
    
    
}
