import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author saulo
 */
public class MorseTest {
        private Morse morse;
    
    @Before
    public void inicializa(){
        morse = new Morse ();
    }
        
    @Test
    public void testaSOS(){
        morse.setMensagem ("SOS");
        assertEquals("*** --- ***", morse.codifica());
    }
    
    @Test
    public void testaSUZANA(){
        morse.setMensagem ("SUZANA");
        assertEquals("*** ..- --.. .- -. .-", morse.codifica());
    }
    
     @Test
    public void testaGOSTA(){
        morse.setMensagem ("GOSTA");
        assertEquals("--. --- ... - .-", morse.codifica());
    }

    @Test
    public void testaDE(){
        morse.setMensagem ("DE");
        assertEquals("-.. .", morse.codifica());
    }
    
     @Test
    public void testaVIAJAR(){
        morse.setMensagem ("VIAJAR");
        assertEquals("...- .. .- .--- .- .-.", morse.codifica());
    }
    
    @Test
    public void testaVAMOSW(){
        morse.setMensagem ("VAMOSW");
        assertEquals("...- .- -- --- ... .--", morse.codifica());
    }
 
    
}
