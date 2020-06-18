/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author pcgrande
 */
public class Aluno extends Pessoa {

    private int ra;
    private List<Telefone> telefones; // implementando 1 ou mais telefones
    private Endereco endereco;

    public Aluno(int ra, List<Telefone> telefones, Endereco endereco, String nome, String rg, String cpf, Date dtNasc) {
        super(nome, rg, cpf, dtNasc); // super significa que os elementos da classe pai podem ser usados
        this.ra = ra;
        this.telefones = telefones;
        this.endereco = endereco;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Aluno{" + "Nome = " + super.getNome()
                + ", RG = " + super.getRg() + ", CPF = " + super.getCpf()
                + ", Data de nascimento = " + super.getDtNasc() + ", ra=" + ra
                + ", telefones=" + telefones
                + ", endereco=" + endereco + '}';
    }

}
