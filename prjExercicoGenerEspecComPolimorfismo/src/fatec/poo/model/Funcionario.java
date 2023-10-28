
package fatec.poo.model;

/**
 *
 * @author 0030482011044
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;

    public Funcionario(int registro, String nome, String dtAdmissao, String cargo) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
        this.cargo = cargo;
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getDtAdmissao() {
        return dtAdmissao;
    }

    public String getCargo() {
        return cargo;
    }
 
    
    
    
    
    abstract public double calcSalBruto();
    
    
    
   public double calcDesconto(){
       return (0.1*calcSalBruto());
    }
   public double calcSalLiquido(){
       return calcSalBruto()-calcDesconto();
   }
}
