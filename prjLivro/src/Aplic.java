
import fatec.poo.model.Livro;
import java.util.Scanner;

/**
 *
 * @author 0030482011013
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Livro objLivro = new Livro();
        int opcao = 0;
        
        objLivro.setIdentificacao(123);
        objLivro.emprestar();
        objLivro.setValMultaDiaria(10);
        
        while(opcao != 4) {
            System.out.println("\n\n1 - Consultar livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Sair");
            System.out.print("Digite a opçao: ");
            opcao = entrada.nextInt();
            
            switch(opcao) {
                case 1: 
                    System.out.print("\nIdentificação: " + objLivro.getIdentificacao());
                    if (objLivro.getSituacao()) {
                        System.out.print("\nO livro está emprestado.");
                    } else {
                        System.out.print("\nO livro está disponível.");
                    }
                    break;
                case 2:
                    objLivro.emprestar();
                    System.out.print("\nLivro emprestado.");
                    break;
                case 3:
                    System.out.print("\nValor a ser pago: " + objLivro.devolver(2));
                    break;
            }
        }   
    }
}
