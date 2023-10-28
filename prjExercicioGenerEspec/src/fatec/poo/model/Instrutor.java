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
public class Instrutor extends Pessoa {
    private int identificacao;
    private String areaAtuaca;

    public Instrutor(int identificacao, String nome, String telefone) {
        super(nome, telefone);
        this.identificacao = identificacao;
    }

    public void setAreaAtuaca(String areaAtuaca) {
        this.areaAtuaca = areaAtuaca;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public String getAreaAtuaca() {
        return areaAtuaca;
    }
    
    


    
}
