/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.model;

/**
 *
 * @author pcgrande
 */
public class Curso {
    
    private String nome;
    private Double cargaHoraria;
    private String conteudoProg;
    private Double valor;

    public Curso(String nome, Double cargaHoraria, String conteudoProg, Double valor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.conteudoProg = conteudoProg;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getConteudoProg() {
        return conteudoProg;
    }

    public void setConteudoProg(String conteudoProg) {
        this.conteudoProg = conteudoProg;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", cargaHoraria=" + cargaHoraria + 
                ", conteudoProg=" + conteudoProg + ", valor=" + valor + '}';
    }
    
    

}
