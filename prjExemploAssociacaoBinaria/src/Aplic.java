import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor  = new FuncionarioHorista(1010,
                                                             "Pedro Silveira",
                                                             "14/05/78",
                                                             15.80);
        
        funcHor.setCargo("Programador");
        
        FuncionarioMensalista funcMen  = new FuncionarioMensalista(2020,
                                                                   "Ana Beatriz",
                                                                   "22/07/88",
                                                                   600);
        
        funcMen.setCargo("Aux. Administrativo");
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                     "Joao Mendes",
                                                                     "10/12/1975",
                                                                     10);
        funcCom.setCargo("Vendedor");
       
        //Instanciação de objetos da 
        //classe Departamento    
        Departamento objDep1 = new Departamento("RH", "Recursos Humanos");
        Departamento objDep2 = new Departamento("VD", "Vendas");
      
	  
       //Estabelecendo a associação binária entre 1
       //objeto da classe FuncionarioHorista com
       //1 objeto da classe Departamento
       funcHor.setDepartamento(objDep1);
      // System.out.println("O funcionario horista "+ funcHor.getNome()+ " está no departamento: " 
              // + funcHor.getDepartamento().getNome());
              
       
       //Estabelecendo a associação binária entre 1
       //objeto da classe FuncionarioMensalista com
       //1 objeto da classe Departamento
       funcMen.setDepartamento(objDep1);
       //System.out.println("O funcionario mensalista "+ funcMen.getNome()+ " está no departamento: " 
             //  + funcMen.getDepartamento().getNome());
      
       //Estabelecendo a associação binária entre 1
       //objeto da classe FuncionarioComissionado com
       //1 objeto da classe Departamento       
       funcCom.setDepartamento(objDep2);
      // System.out.println("O funcionario comissionado "+ funcCom.getNome()+ " está no departamento: " 
              // + funcCom.getDepartamento().getNome());
      
       //Estabelecendo a associação binária entre um
       //objeto da classe Departamento com 1 ou mais (1..*)
       //objetos da classe FuncionarioHorista, FuncionarioMensalista
       //e FuncionarioComissionado  
       objDep1.addFuncionario(funcHor);
       objDep1.addFuncionario(funcMen);
       //objDep1.listarFuncionarios();
       
       objDep2.addFuncionario(funcCom);
       //objDep2.listarFuncionarios();
       ///projeto
       Projeto objProj1 = new Projeto(1,"Varrer o chão");
       objProj1.setDtInicio("20/05/2023");
       objProj1.setDtTermino("30/05/2023");
       
       Projeto objProj2 = new Projeto(2,"Limpar a janela");
       objProj2.setDtInicio("20/03/2024");
       objProj2.setDtTermino("30/03/2024");
       
       funcCom.setProjeto(objProj2);
       funcHor.setProjeto(objProj2);
       funcMen.setProjeto(objProj1);
       
       objProj1.addFuncionario(funcMen);
       objProj1.listarFuncionarios();
       
       
       objProj2.addFuncionario(funcCom);
       objProj2.addFuncionario(funcHor);
       objProj2.listarFuncionarios();
       
       
       
       
    }    
}
