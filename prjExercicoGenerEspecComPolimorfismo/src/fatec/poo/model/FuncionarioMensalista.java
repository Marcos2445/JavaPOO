
package fatec.poo.model;

/**
 *
 * @author 0030482011044
 */
public class FuncionarioMensalista extends Funcionario{
    
    private double valSalMin;
    private double numSalMin;

    public FuncionarioMensalista(int registro, String nome, String dtAdmissao, double valSalMin, String cargo) {
        super(registro, nome, dtAdmissao, cargo);
        this.valSalMin = valSalMin;
    }

    public void setNumSalMin(double numSalMin) {
        this.numSalMin = numSalMin;
    }
    
    public double calcSalBruto(){
        return(valSalMin*numSalMin);
    }
    
}
