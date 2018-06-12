
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gus
 */
public class ExemploFilmeJUnitTest {

    @Test
    public void testeDefinirEObterTituloFilme() {
        Filme naruto = new Filme();
        naruto.setTitulo(" Naruto The last movie");
        assertEquals(" Naruto The last movie", naruto.getTitulo());
        

    }
    
    @Test
    public void testeDefinirEObterTituloOriginal(){
        Filme infinityWar = new Filme();
        infinityWar.setTituloOriginal("Avengers");
        assertEquals("Avengers", infinityWar.getTituloOriginal());
        
    }
    
    @Test
    public void testeDefinirEObterGenero (){
        Filme deadpool = new Filme();
        deadpool.setGenero("Ação");
        assertEquals("Ação", deadpool.getGenero());
        
    }
    
    @Test
    public void testeDefinirEObterDiretor (){
        Filme osMiseraveis = new Filme();
        osMiseraveis.setDiretor("Tim Miller");
        assertEquals("Tim Miller", osMiseraveis.getDiretor());
        
    }
    
    @Test
    public void testeDefinirEObterClassificacao(){
        Filme letraEMusica = new Filme();
        letraEMusica.setClassificacao("Livre");
        assertEquals("Livre", letraEMusica.getClassifcacao());
        
    }
    
    @Test
    public void testeDefinirEObterIdioma(){
        Filme psychokinesis = new Filme();
        psychokinesis.setIdioma("Coreano");
        assertEquals("Coreano", psychokinesis.getIdioma());
        
    }
    
    @Test
    public void testeDefinirEObterAnoLancamento(){
        Filme umaNoiteNoMuseu = new Filme();
        umaNoiteNoMuseu.setAnolancamento((short)2006);
        assertEquals(2006, umaNoiteNoMuseu.getAnolancamento());
        
    }
    
    @Test
    public void testeDefinirEObterValorFaturamento(){
        Filme watchmen = new Filme();
        watchmen.setValorFaturamento((double)550000);
        assertEquals(550000, watchmen.getValorFaturamento(),0);
        
    }
    
    @Test
    public void testeDefinirEObterValorOrcamento(){
        Filme deadPool2 = new Filme();
        deadPool2.setValorOrcamento((double)110000);
        assertEquals(110000, deadPool2.getValorOrcamento(),0);
        
    }
    
    @Test
    public void testeDefinirEObterEspectadores(){
        Filme ligaDaJustica = new Filme();
        ligaDaJustica.setEspectadores((int)180000);
        assertEquals(180000, ligaDaJustica.getEspectadores());
        
    }
    
    @Test
    public void testeDefinirEObterMediaPreco(){
        Filme mulherMaravilha = new Filme();
        mulherMaravilha.setMediaPreco((double)22);
        assertEquals(22, mulherMaravilha.getMediaPreco(),0);
        
    }
    
    
    
    
    
    
    
 
    
}
