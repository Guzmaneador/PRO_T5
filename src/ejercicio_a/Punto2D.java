package ejercicio_a;

/**
 *
 * @author munchi
 */
public class Punto2D {
    private double x, y;
    
    public Punto2D(){
        this.x=0.0;
        this.y=0.0;
    }
    
    public Punto2D(double x,double y){
        this.x = x;
        this.y = y;
    }
    
    public double getX(){return this.x; }
    
    public void setX(double x) {this.x = x;}
    
    public double getY() {return this.y;}
    
    public void setY(double y) {this.y = y;}
    
    public String toString(){return "(" + this.x + "," + this.y + ")";}
    
}
