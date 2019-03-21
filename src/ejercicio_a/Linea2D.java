package ejercicio_a;

/**
 *
 * @author munchi
 */
public class Linea2D 
                extends Punto2D{
    
    Punto2D puntofinal;
    
    /*public linea2D(double x1, double y1,double x2,double y2){
        super(x1,y1);
        this.puntofinal=new Punto2D(x2,y2);
    }*/
    public Linea2D(Punto2D puntoInicial, Punto2D puntoFinal){
        super(puntoInicial.getX(),puntoInicial.getY());
        this.puntofinal=new Punto2D(puntoFinal.getX(),puntoFinal.getY());
        
    }
    public Punto2D getInicio(){ return this;}//Polimorfismo
    
    public Punto2D getFinal(){ return this.puntofinal;}//Polimorfismo
    
   
    
    
    
    @Override
    public String toString(){return "(" + getX() + "," + getY() + ")";}
}
