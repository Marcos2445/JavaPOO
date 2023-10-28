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
public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    private Funcionario[] funcionarios; //multiplicidade 1..*
    private int numFunc;

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        funcionarios = new Funcionario[10];
        numFunc = 0;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc]=f;
        numFunc++;
    }
    
    public void listarFuncionarios(){
        System.out.println("\n\nCodigo: " + codigo);
        System.out.println("Descricao: " + descricao);
        System.out.println("Num. Func.: " + numFunc);
        System.out.println("Data de inicio: " + dtInicio);
        System.out.println("Data de termino: " + dtTermino);
        
        System.out.println("\nRegistro\t\tNome\t\tCargo\t\tDepartamento"); 
        for (int x=0; x < numFunc; x++){
             System.out.print(funcionarios[x].getRegistro() + "\t\t");
             System.out.print(funcionarios[x].getNome() + "\t\t");
             System.out.print(funcionarios[x].getCargo()+"\t\t");
             System.out.println(funcionarios[x].getDepartamento().getNome());
        }
    }
}
