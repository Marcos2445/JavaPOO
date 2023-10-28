
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
       int i, conta;
       
       Scanner entrada = new Scanner(System.in);
       ContaCorrente matBanco[] = new ContaCorrente[3];
       
       for (i=0; i<matBanco.length; i++ ){     
       System.out.print("Digite o numero da conta: ");
       num = entrada.nextInt();
       System.out.print("Digite o saldo da conta: ");
       sal = entrada.nextDouble();
       matBanco[i] = new ContaCorrente(num,sal);
       }
       
      
       
       
        do {
            System.out.println("1- Sacar ");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Listar contas");
            System.out.println("5 - sair");
            System.out.print("Digite a opçao: ");
            opcao = entrada.nextInt();
            switch (opcao) {

                case 1:

                    System.out.print("digite o numero da sua conta: ");
                    conta = entrada.nextInt();

                    for (i = 0; i < matBanco.length; i++) {
                        if (conta == matBanco[i].getNumero()) {
                            System.out.print("Valor do saque: ");
                            saq = entrada.nextDouble();
                            if (saq > matBanco[i].getSaldo()) {
                                System.out.println("Saldo insuficiente.");
                            } else {
                                matBanco[i].sacar(saq);

                            }
                            System.out.println("Numero da conta: " + matBanco[i].getNumero());
                            break;
                        }

                    }

                    if (i == matBanco.length) {
                        System.out.println("Conta não cadastrada");
                    }
                    break;

                case 2:

                    System.out.print("digite o numero da sua conta: ");
                    conta = entrada.nextInt();

                    for (i = 0; i < matBanco.length; i++) {
                        if (conta == matBanco[i].getNumero()) {
                            System.out.print("Qual valor do deposito: ");
                            dep = entrada.nextDouble();
                            matBanco[i].depositar(dep);
                            System.out.println("Numero da conta: " + matBanco[i].getNumero());

                            break;
                        }

                    }

                    if (i == matBanco.length) {
                        System.out.println("Conta não cadastrada");
                    }
                    break;

                case 3:
                    System.out.print("digite o numero da sua conta: ");
                    conta = entrada.nextInt();

                    for (i = 0; i < matBanco.length; i++) {
                        if (conta == matBanco[i].getNumero()) {
                            System.out.println("A conta de numero: " + matBanco[i].getNumero() + " tem um saldo de:" + matBanco[i].getSaldo());
                            break;
                        }

                    }

                    if (i == matBanco.length) {
                        System.out.println("Conta não cadastrada");
                    }
                    break;
                case 4:
                    System.out.println("Número da Conta" + "    " + "Saldo");
                    for (i=0; i < matBanco.length; i++){
                        System.out.println(matBanco[i].getNumero() + "                  " + matBanco[i].getSaldo());
                    }

                    break;
            }
        } while (opcao < 5);

    }

}
