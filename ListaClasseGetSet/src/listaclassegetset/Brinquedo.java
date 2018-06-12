
package listaclassegetset;


 /** @author Gus
*/
public class Brinquedo {
    /**
     * Exercicio lista classe get/set Exercicio numero dois "Brinquedo"
     * Declaração dos metodos;
     * Criar classe de teste;
     * Exercicio deve conter os atributos a baixo: 
     * Nome; 
     * Marca; 
     * Modelo; 
     * Preço; 
     * Código; 
     * Código de barras; 
     * Descrição;
     */
    
    private String nomeBrinquedo, marca, modelo, Descricao;
    private double preco;
    private int codigo;
    private long codigoDeBarras;
    
        
    public void setNomeBrinquedo (String nomeBrinquedo){
        this.nomeBrinquedo = nomeBrinquedo;
    }
    
    public String getNomeBrinquedo(){
        return nomeBrinquedo;
    }
    
    public void setMarca (String marca){
        this.marca = marca;
    }
    
    public String getMarca (){
        return marca;
    }
    
    public void setModelo (String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo (){
        return modelo;
    }
    
    public void setDescricao (String descricao){
        this.Descricao = descricao;
    }
    
    public String getDescricao (){
        return Descricao;
    }
    
    public void setPreco (double preco){
        this.preco = preco;
    }
    public double getPreco (){
        return preco;
    }
        
    public void setCodigo (int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigo (){
        return codigo;
    }
    
    public void setCodigoDeBarras (long codigoDeBarras){
        this.codigoDeBarras = codigoDeBarras;
    }
    
    public long getCodigoDeBarras (){
        return codigoDeBarras;
    }
    
}
