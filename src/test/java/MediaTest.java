import edu.utfpr.opteste.atividade06.Media;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paulo
 */
public class MediaTest {
    
     @Test
     public void testeVetorOrdenadoMedia() {
        double[] v = {1, 2, 3, 4, 5};
        Media m = new Media(v);
        double res = m.getMedia();
        double exp = 3d;
        assertEquals(exp, res, 0.01);
     }
}
