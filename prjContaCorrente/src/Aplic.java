
import fatec.poo.model.ContaCorrente;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Aplic {


    public static void main(String[] args) {
       int num, opcao;
       double saq,dep, sal;
       
       Scanner entrada = new Scanner(System.in);
       
       System.out.print("Digite o numero da conta: ");
       num = entrada.nextInt();
       System.out.print("Digite o saldo da conta: ");
       sal = entrada.nextDouble();
       
       ContaCorrente objContaCorrente = new ContaCorrente(num,sal);
       // passando dados
      
       
       
       do{
            System.out.println("1- Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.print("Digite a opçao: ");
            opcao = entrada.nextInt();
            switch(opcao){
                case 1:
                    System.out.print("Qual valor do deposito: ");
                    dep = entrada.nextDouble();
                    objContaCorrente.depositar(dep);
                    System.out.println("Numero da conta: "+objContaCorrente.getNumero());
                    break;
                case 2:
                   System.out.print("Valor do saque: ");
                   saq = entrada.nextDouble();
                   if(saq>objContaCorrente.getSaldo()){
                       System.out.println("Saldo insuficiente.");
                       System.out.println("Numero da conta: "+objContaCorrente.getNumero());
                   }else{
                       objContaCorrente.sacar(saq);
                       System.out.println("Numero da conta: "+objContaCorrente.getNumero());
                   }
                   break;
                case 3:
                    System.out.println("A conta de numero: " + objContaCorrente.getNumero()+" tem um saldo de:"+objContaCorrente.getSaldo());
                   break; 
                        
            }
       }while(opcao<4);
       
       
       
       
    }
    
}
