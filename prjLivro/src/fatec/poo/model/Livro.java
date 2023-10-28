package fatec.poo.model;

/**
 *
 * @author 0030482011013
 */
public class Livro {
    private int identificacao;
    private boolean situacao;
    private double valMultaDiaria;

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public void setValMultaDiaria(double valMultaDiaria) {
        this.valMultaDiaria = valMultaDiaria;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public int getIdentificacao() {
        return identificacao;
    }
    
    public void emprestar() {
        situacao = true;
    }
    
    public double devolver(int qtdDiasAtraso) {
        situacao = false;
        
        return valMultaDiaria * qtdDiasAtraso;
    }
}
