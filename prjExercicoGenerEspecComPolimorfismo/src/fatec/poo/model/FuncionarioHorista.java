
package fatec.poo.model;

/**
 *
 * @author 0030482011044
 */
public class FuncionarioHorista extends Funcionario {

private double valHoraTrab;
private int qtdHorTrab;

    public FuncionarioHorista( int registro, String nome, String dtAdmissao, double valHoraTrab, String cargo) {
        super(registro, nome, dtAdmissao, cargo);
        this.valHoraTrab = valHoraTrab;
    }

    public void setQtdHorTrab(int qtdHorTrab) {
        this.qtdHorTrab = qtdHorTrab;
    }

    public double calcSalBruto(){
        return(qtdHorTrab*valHoraTrab);
    }
    
    public double calcGratificacao(){
        return(calcSalBruto()*0.075);
    }

    @Override
    public double calcSalLiquido() {
        return ((calcSalBruto()-calcDesconto())+calcGratificacao()); 
    }
    
    
    


    
    
}
