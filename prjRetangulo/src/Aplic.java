
import java.util.Scanner;
import fatec.poo.model.Retangulo;

/**
 *
 * @author Marcos
 */
public class Aplic {


    public static void main(String[] args) {  
     double medAlt, medBase;
     
     //instanciação dos obj
     Scanner entrada = new Scanner(System.in);
     Retangulo objRet = new  Retangulo();
     
     
     //atribuindo
     System.out.print("Digite a altura: ");
     medAlt= entrada.nextDouble();
     System.out.print("Digite a base: ");
     medBase= entrada.nextDouble();
     
     //passagem de mensagens com o obj da 
     //classe retangulo
     objRet.setAltura(medAlt);
     objRet.setBase(medBase);
     System.out.println("\nMedida da altura: "+objRet.getAltura());
     System.out.println("Medida da base: "+objRet.getBase());
     System.out.println("Medida do perimetro: "+objRet.calcPerimetro());
     System.out.println("Medida da Area: "+objRet.calArea());
     
          
     
     
    }
    
}
