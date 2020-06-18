/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.model;

import java.util.Date;

/**
 *
 * @author pcgrande
 */
public class Pessoa {

    private String nome;
    private String rg;
    private String cpf;
    private Date dtNasc;

    public Pessoa(String nome, String rg, String cpf, Date dtNasc) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", rg=" + rg + ", cpf=" + cpf
                + ", dtNasc=" + dtNasc + '}';
    }

}
