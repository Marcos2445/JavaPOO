
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;


/**
 *
 * @author 0030482011044
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
       Aluno objAluno = new Aluno(1010,"Marcos","30/10/2001");
       
       objAluno.setMensalidade(1000);
       
       System.out.println("Registro escolar: " + objAluno.getRegEscolar());
       System.out.println("Nome: " + objAluno.getNome());
       System.out.println("Data nascimento: " + objAluno.getDataNascimento());
       System.out.println("Mensalidade: " + objAluno.getMensalidade());
       
       
       Professor objProfessor = new Professor(2121,"João","30/10/2001");
       
       objProfessor.setSalario(2000);
       
       System.out.println("Registro Funcionario: " + objProfessor.getRegFuncional());
       System.out.println("Nome: " + objProfessor.getNome());
       System.out.println("Data nascimento: " + objProfessor.getDataNascimento());
       System.out.println("Salario: " + objProfessor.getSalario());
       
    }
    
}
