
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;






/**
 *
 * @author 0030482011044
 */
public class Aplic {


    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat ("#,##0.00");
        FuncionarioHorista funcHor = new FuncionarioHorista(11,"Paulo","Ontem",10,"Entregador");
        
        funcHor.setQtdHorTrab(20);
        
        
        System.out.println("Horista");
        System.out.println("Identificação:"+ funcHor.getRegistro());
        System.out.println("Nome:"+ funcHor.getNome());
        System.out.println("Cargo:"+ funcHor.getCargo());
        System.out.println("Data de admissão:"+ funcHor.getDtAdmissao());
        System.out.println("Salario bruto: "+  df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto: "+  df.format(funcHor.calcDesconto()));
        System.out.println("Gratificação: "+  df.format(funcHor.calcGratificacao()));
        System.out.println("Salario Liquido: "+  df.format(funcHor.calcSalLiquido()));  
 
        
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(13,"Paulo","Esses dias", 1200,"Motorista");
        funcMen.setNumSalMin(2);
        
        
        System.out.println("\nMensalista");
        System.out.println("Identificação:"+ funcMen.getRegistro());
        System.out.println("Nome:"+ funcMen.getNome());
        System.out.println("Cargo:"+ funcMen.getCargo());
        System.out.println("Data de admissão:"+ funcMen.getDtAdmissao());
        System.out.println("Salario bruto: "+  df.format(funcMen.calcSalBruto()));
        System.out.println("Desconto: "+  df.format(funcMen.calcDesconto()));
        System.out.println("Salario Liquido: "+  df.format(funcMen.calcSalLiquido()));
        

    }
    
}
