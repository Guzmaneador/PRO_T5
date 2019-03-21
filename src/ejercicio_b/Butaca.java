package ejercicio_b;

/**
 *
 * @author munchi
 */
public class Butaca {
    public int precio;
    public boolean reservada;
    
    public Butaca(){
        precio=0;
        reservada=false;
    }
    
    public Butaca(int precio){
        this.precio=precio;
        this.reservada=false;
        
    }
    
    
    public int getPrecio(){return this.precio;}
}
