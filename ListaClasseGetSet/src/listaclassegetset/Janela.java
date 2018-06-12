package listaclassegetset;

/*
 Crie uma classe chamada Janela que contenha os seguintes atributos:
➔ Comprimento;
➔ Largura;
➔ Altura;
➔ Preço;
➔ Marca;
➔ Possui insulfilm.
Gerar os métodos Get e Set para cada um dos atributos.
Gerar a classe de teste garantindo que as informações foram gravadas com sucesso.
 */

/**
 *
 * @author Gus
 */
public class Janela {
    
    private String comprimento, marca;
    private float  largura, altura, preco;
    private boolean insulfilm;
    
    public void setComprimento(String comprimento){
        this.comprimento = comprimento;
    }
    
    public String getComprimento(){
        return comprimento;
    }
    
    public void setLargura(float largura){
        this.largura = largura;
    }
    
    public float getLargura(){
        return largura;
    }
    
    public void setAltura(float algura){
        this.altura = algura;
    }
    
    public float getAltura(){
        return altura;
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
    
    public float getPreco(){
        return preco;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setInsulfilm(boolean insulfilm){
        this.insulfilm = insulfilm;
    }
    
    public boolean getInsulfilm(){
        return insulfilm;
    }
}
