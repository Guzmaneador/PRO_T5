package ejercicio_c;



import java.util.*;
/**
 *
 * @author munchi
 */
public class Menu {
    Scanner Teclado= new Scanner(System.in);
    Random Aleatorio = new Random();
    
    public static ArrayList<Simples> preguntasSimples = new ArrayList<Simples>();
    public static ArrayList<Test> preguntasTest = new ArrayList<Test>();
    
    //Constructor siatuado al fianl de la clase.
    
    
    
    
    public String toString(){
        
        System.out.println("================SIMULADOR DE EXAMENES===============");
        System.out.println("|         Opciones a elegir:                       |");
        System.out.println("|  1.Cuestiones con unica resouesta.               |");
        System.out.println("|  2.Cuestiones test con unica respuesta.          |");
        System.out.println("|  3.Simulacion y cirre.                           |");
        System.out.print("--->");
        switch(Teclado.nextInt()){
            case 1:
                opcion1();
                toString();
                break;
            case 2: 
                opcion2();
                toString();
                break;
            case 3:
                opcion3();
                System.exit(0);
                break;
            default:
                System.out.println("¡¡Algo ha salido mal!!");
                      
        }
        
        return"";
    }//FIN toString()
    
    public void opcion1(){
        System.out.println("************Cargando cinco preguntas simples**************");
        System.out.println("< Cada pregunta es una cadena que contiene la respuesta rodeada por guines bajos _ _");
       /* for(int $i=0;$i<preguntasSimples.size();$i++){
            preguntasSimples.get($i).mostrarEnunciadoRespuesta();
        }
        System.out.println();*/
       String basura=Teclado.nextLine();
       for(int $i=0;$i<5;$i++){
            String cadena=Teclado.nextLine();
            String[] a1 = cadena.split("_");
            preguntasSimples.add(new Simples(a1[0],a1[1]));
       }
    }//FIN opcion1()
    
    
    public void opcion2(){    
        System.out.println("*************Cargando cinco preguntas con opciones*********");
        System.out.println("<Cada pregunta es una cade y luego se la añade la respuesta seguida de ture o false>");
        for(int $x=0;$x<preguntasTest.size();$x++){
            preguntasTest.get($x).mostrar();
        /*Sistema basado en un bucle y un numero aleatorio entre 1 y 3 para mostrar
          las posibles respuestas de forma aleatoria*/
            int aux=Aleatorio.nextInt(3)+1;    
            for(int $i=1,$z=1;$i<=3;$i++){
                if($i==aux){
                    System.out.println($i+"."+preguntasTest.get($x).respuestas[0]+" "+
                            preguntasTest.get($x).miraRespuesta(preguntasTest.get($x).respuestas[0]));
                }else{
                    System.out.println($i+"."+preguntasTest.get($x).respuestas[$z]+" "+
                            preguntasTest.get($x).miraRespuesta(preguntasTest.get($x).respuestas[$z]));
                    $z++;
                }               
            }//Fin segundo for  
        }//Fin primer for    
    }//FIN opcion2()
    
    
    
    
    public void opcion3(){
        int acertadas=0;
        String basura=Teclado.nextLine();
        System.out.println("=======Porfavor responde a cada una de las cuestiones siguientes========");
        //Simples//////////////////////////////////////////////////////////
        for(int $i=0;$i<preguntasSimples.size();$i++){
            preguntasSimples.get($i).mostrar();
            System.out.print("Respuesta: ");
            if(preguntasSimples.get($i).miraRespuesta(Teclado.nextLine())){
                System.out.println("-->Acertada");
                acertadas++;
            }else System.out.println("-->Respuesta Incorrecta");
        }
        //Test/////////////////////////////////////////////////////////////
        for(int $x=0;$x<preguntasTest.size();$x++){
            preguntasTest.get($x).mostrar();
        /*Sistema basado en un bucle y un numero aleatorio entre 1 y 3 para mostrar
          las posibles respuestas de forma aleatoria*/
            int aux=Aleatorio.nextInt(3)+1;    
            for(int $i=1,$z=1;$i<=3;$i++){
                if($i==aux){
                    System.out.println($i+"."+preguntasTest.get($x).respuestas[0]);
                }else{
                    System.out.println($i+"."+preguntasTest.get($x).respuestas[$z]);
                    $z++;
                }               
            }//Fin segundo for 
            System.out.print("Respuesta: ");
            if(preguntasTest.get($x).miraRespuesta(Teclado.nextLine())){
                System.out.println("-->Acertada");
                acertadas++;
            }else System.out.println("-->Respuesta Incorrecta");   
        }//Fin primer for
        System.out.println("Preguntas acertadas: "+acertadas);
        
        
    }//FIN opcion3()
    
    
    
    
    
    
    //CONSTRUCTOR
    public Menu(){
        //Preguntas Simples
        /*
        preguntasSimples.add(new Simples("¿Cual es la montaña mas alta de la peninsula Iberica?","mulacen"));
        preguntasSimples.add(new Simples("¿Como se llama tu instituto?","cesar manrrique"));
        preguntasSimples.add(new Simples("¿Que es la graciosa?","isla"));
        preguntasSimples.add(new Simples("¿que se hace con la cochinilla?","tinta"));
        preguntasSimples.add(new Simples("¿cual es el mejor platano del mundo?","canario"));
        */
        //Preguntas Test
        preguntasTest.add(new Test("El teide es:","cima","cumbre","isla"));
        preguntasTest.add(new Test("La tierra es:","ovalada","plana","esferica"));
        preguntasTest.add(new Test("El cambio climatico es culpa de:","petroleo","solajero","vacas"));
        preguntasTest.add(new Test("El silicio se obtiene de la:","arena","roca","alga"));
        preguntasTest.add(new Test("Una fuente de proteinas es:","insectos","neftali","sol"));
        
    }//FIN Constructor
    
}//Fin de la clase

