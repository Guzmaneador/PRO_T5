/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_e;

/**
 *
 * @author munchi
 */
public class EstudiaIntentos {
    
    ficheroPalabras ficherazo = new ficheroPalabras();
        
    public  String[] palabras={"camion","mentira"};
    
    public static boolean esCorrecta;
    
    public String obtenerPalabra(){
        palabras=ficherazo.pedirFichero();
       return palabras [(int) (Math.random() *palabras.length)];    
    }
    
    public static String obtenerPalabraOculta(String palabra) {
        
        String oculta="";
        for(int i=0; i<palabra.length();i++){
            oculta +="*";
        }
        return oculta;
    }
    public static String obtenerIntento(String palabra, String palabraEscondida, char ch){
       esCorrecta=false;
       StringBuilder s = new StringBuilder(palabraEscondida);
       for(int i=0; i<palabra.length(); i++){
           
           if(ch==palabra.charAt(i) && s.charAt(i)=='*'){
               esCorrecta=true;
               s=s.deleteCharAt(i);
               s=s.insert(i, ch);
           }
           
       }
       return s.toString();
    }
    
    public static boolean yaEstaEnPalabra(String palabraEscondida, char ch){
        
        for(int i=0; i<palabraEscondida.length();i++) {
            if(ch == palabraEscondida.charAt(i)){return true;}
        }
        return false;
    }
    
}
