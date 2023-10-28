
import fatec.poo.model.Circulo;
import java.util.Scanner;


/**
 *
 * @author 0030482011044
 */
public class Aplic {

  
    public static void main(String[] args) {
       double medRaio;
       
       
       //instanciação dos objetos
       Scanner entrada = new Scanner(System.in);
       Circulo objCirculo = new Circulo();
       
       //Atribuindo
       System.out.print("Digite o valor do Raio: ");
       medRaio = entrada.nextDouble();
       objCirculo.setRaio(medRaio);
       //calculando
       
       System.out.println("\nO valor do Raio é: "+ objCirculo.getRaio());
       System.out.println("O valor da Area é: "+ objCirculo.calcArea());
       System.out.println("O valor do perimetro é: "+ objCirculo.calcPerimetro());
       System.out.println("O valor do diametro é: "+ objCirculo.calcDiametro());
    }
    
}
