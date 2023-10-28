
import java.util.Scanner;



/**
 *
 * @author Marcos P Junior
 */
public class Exemplo1 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codProd, qtdeVend;
        String descProd;
        double precUnit, valCompra;
        
        
        System.out.print("Digite o codigo do produto: ");
        codProd = entrada.nextInt();
        System.out.print("Digite a descrição: ");
        descProd = entrada.next();
        System.out.print("Digite o preço unitario: ");
        precUnit = entrada.nextDouble();
        System.out.print("Digite a quantidade vendida: ");
        qtdeVend = entrada.nextInt();
        valCompra=precUnit * qtdeVend;
        System.out.println("\nValor da compra: "+ valCompra);
    }
    
}
