/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author marco
 */
public class ContaCorrente {
    private int numero;
    private double saldo;
    
   public ContaCorrente(int num, double sald){
       saldo = sald;
       numero = num;
   }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void sacar(double saque){
        saldo = saldo-saque;
    }
    public void depositar(double deposito){
        saldo = saldo+deposito;   
}
}
