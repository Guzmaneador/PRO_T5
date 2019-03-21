package ejercicio_a;

/**
 *
 * @author munchi
 */
public class Punto3D 
                extends Punto2D{
    private double z;
    
    public Punto3D(){
        super();
        this.z =0.0;
    }
    public Punto3D(double x, double y, double z ){
        super(x,y);
        this.z = z;
        
    }
    
    //Metodos SET y GET
    
    public double getZ(){ return this.z;}
    
    public void setZ(double z){ this.z=z;}
    
    //ToString
    public String mostrarXY(){return super.toString();}
    @Override
    public String toString(){return "(" + super.getX() + "," + super.getY() + "," +this.z + ")";}
}
