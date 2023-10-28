
import fatec.poo.model.Circulo;
import java.util.Scanner;


/**
 *
 * @author 0030482011044
 */
public class Aplic {

  
    public static void main(String[] args) {
       double medRaio;
       String unidade;
       
       
       //instanciação dos objetos
       Scanner entrada = new Scanner(System.in);
       
       System.out.print("Digite a unidade de medida: ");
       unidade = entrada.next();
       
       Circulo objCirculo = new Circulo(unidade);
       
       //Atribuindo
       System.out.print("Digite o valor do Raio: ");
       medRaio = entrada.nextDouble();
       objCirculo.setRaio(medRaio);
       //calculando
       
       System.out.println("\nO valor do Raio é: "+ objCirculo.getRaio()+objCirculo.getUnidadeMedida());
       System.out.println("O valor da Area é: "+ objCirculo.calcArea()+objCirculo.getUnidadeMedida());
       System.out.println("O valor do perimetro é: "+ objCirculo.calcPerimetro()+objCirculo.getUnidadeMedida());
       System.out.println("O valor do diametro é: "+ objCirculo.calcDiametro()+objCirculo.getUnidadeMedida());
    }
    
}
