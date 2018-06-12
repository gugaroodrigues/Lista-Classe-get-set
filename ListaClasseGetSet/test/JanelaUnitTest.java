
import listaclassegetset.Janela;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gus
 */
public class JanelaUnitTest {
    
    @Test
    public void marcaJanela(){
        Janela sasazaki = new Janela();
        sasazaki.setMarca("Sasazaki");
        assertEquals("Sasazaki", sasazaki.getMarca());
    }
    
    @Test
    public void definirPreco(){
        Janela  sasazakiJcsssg  = new Janela();
        sasazakiJcsssg.setPreco((float)1199.49);
        assertEquals((float)1199.49, sasazakiJcsssg.getPreco(),0f); 
    }
    
    @Test
    public void definirLargura(){
        Janela jcsssgLargura = new Janela();
        jcsssgLargura.setLargura((float)150.00);
        assertEquals((float)150.00, jcsssgLargura.getLargura(),0f);
    }
    
    public void definirAltura(){
        Janela jcsssgAltura = new Janela();
        jcsssgAltura.setAltura((float)120.00);
        assertEquals((float)120.00, jcsssgAltura.getAltura(),0f);
    }
    
    public void definirComprimento(){
        Janela jcsssgComprimento = new Janela();
        jcsssgComprimento.setComprimento("1.20cm x 1.50cm");
        assertEquals("1.20cm x 1.50cm", jcsssgComprimento.getComprimento());
    }
    
    public void definirInsulfilmSimOuNao(){
        Janela jcsssgInsulfilm = new Janela();
        jcsssgInsulfilm.setInsulfilm(false);
        assertEquals(false, jcsssgInsulfilm.getInsulfilm());
    }
    
    
    
}
