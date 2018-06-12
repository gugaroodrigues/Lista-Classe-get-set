
import listaclassegetset.Brinquedo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gus
 */
public class TesteBrinquedoJUnitTest {

    @Test
    public void definirEObterNomeBrinquedo() {
        Brinquedo jengaBoom = new Brinquedo();
        jengaBoom.setNomeBrinquedo("Jenga Boom");
        assertEquals("Jenga Boom", jengaBoom.getNomeBrinquedo());
    }
    
    @Test
    public void definirEObterMarca(){
        Brinquedo monopoli = new Brinquedo();
        monopoli.setMarca("Hasbro");
        assertEquals("Hasbro", monopoli.getMarca());
    }
    
    @Test
    public void definirModelo(){
        Brinquedo bopit = new Brinquedo();
        bopit.setModelo("Smash");
        assertEquals("Smash", bopit.getModelo());
    }
    
    @Test
    public void definirDescricao(){
        Brinquedo gameoflife = new Brinquedo();
        gameoflife.setDescricao("Jogo de tabuleiro");
        assertEquals("Jogo de tabuleiro", gameoflife.getDescricao());
    }
    
    @Test
    public void definirPreco(){
        Brinquedo polaris = new Brinquedo();
        polaris.setPreco(1999.99);
        assertEquals(1999.99, polaris.getPreco(),0); 
    }
    
    @Test
    public void definirCodigo(){
        Brinquedo legoSuperStarDestroye = new Brinquedo();
        legoSuperStarDestroye.setCodigo((int) 10221);
        assertEquals((int)10221, legoSuperStarDestroye.getCodigo());
    }
    
    @Test
    public void codigoDeBarras(){
        Brinquedo legoACasaDosSimpsons = new Brinquedo();
        legoACasaDosSimpsons.setCodigoDeBarras((long)673419207); //673419207669
        assertEquals((long)673419207, legoACasaDosSimpsons.getCodigoDeBarras());
    }
}
