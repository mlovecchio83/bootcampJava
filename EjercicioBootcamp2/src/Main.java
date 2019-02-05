import org.junit.Test;

public class Main {

    Clase1 primero = new Clase1();
    Clase2 segundo = new Clase2();

    //primero.mensaje1();
    //segundo.mensaje1();
    //segundo.mensaje2();

    @Test
    public void testMessages(){
        primero.mensaje1();
        segundo.mensaje1();
        segundo.mensaje2();
    }

}
