
import fatec.poo.model.Circulo;
import java.util.Scanner;


/**
 *
 * @author 0030482011044
 */
public class Aplic {

  
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        double medRaio;
        String unidade;
        int i;
       
       
       //criando a matriz objeto
       Circulo[]matCirculo =  new Circulo[3];
     
       //Atribuindo
       for (i=0; i<3; i++){
           System.out.print("Digite a unidade de medida:");
           unidade = entrada.next();
           
           //instanciando obj da classe e chamando o metodo construtor
           matCirculo[i] = new Circulo(unidade);
           
           //recebendo os atributos
           System.out.print("Digite a medida do raio: ");
           medRaio = entrada.nextDouble();
           
           //passando dados
           
           matCirculo[i].setRaio(medRaio);
           
           
       }

       
       
       //calculando
       for (i=0; i<3; i++){
       System.out.println("\nO objeto Circulo "+ (i+1));
       System.out.println("O valor do Raio é: "+ matCirculo[i].getRaio()+matCirculo[i].getUnidadeMedida());
       System.out.println("O valor da Area é: "+ matCirculo[i].calcArea()+matCirculo[i].getUnidadeMedida());
       System.out.println("O valor do perimetro é: "+ matCirculo[i].calcPerimetro()+matCirculo[i].getUnidadeMedida());
       System.out.println("O valor do diametro é: "+ matCirculo[i].calcDiametro()+matCirculo[i].getUnidadeMedida());
       }
      }
       
    
}
