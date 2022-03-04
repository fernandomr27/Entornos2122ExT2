import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema1 {
    @Test
    public void devuelve_una_cadena_de_textos(){
        Problema1 num= new Problema1();
        String expected = "12345678911121314151617181920";
        String actual = num.numbers();
        Assertions.assertEquals(expected,actual);

    }
}
