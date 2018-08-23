import org.junit.Test;
import static org.junit.Assert.*;
import edu.utfpr.opteste.atividade06.Mediana;

/**
 *
 * @author paulo
 */
public class MedianaTest {
    
    @Test
    public void testeVetorOrdenadoImpar() {
        double[] v = {1, 2, 3, 4, 5};
        Mediana m = new Mediana();
        double res = m.getMediana(v);
        double exp = 3d;
        assertEquals(exp, res, 0.01);
    }
}
