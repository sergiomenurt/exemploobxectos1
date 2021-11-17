
package exemploobxectos1;


public class ExemploObxectos1 {

    
    public static void main(String[] args) {
        Semaforo unSemaforo = new Semaforo ();
        unSemaforo.ponCor("azul");
        String color=unSemaforo.dameCor();
        System.out.println(color);
        Semaforo outroSemaforo = new Semaforo();
        outroSemaforo.ponCor("amarelo");
        System.out.println("a cor e : "+ outroSemaforo.dameCor());
       
        
    }
    
}
