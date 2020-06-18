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
public class Professor extends Pessoa {

    private List<Telefone> telefones; // implementando 1 ou mais telefones
    private Endereco endereco;
    private Double valHrAula;

    public Professor(List<Telefone> telefones, Endereco endereco, Double valHrAula, String nome, String rg, String cpf, Date dtNasc) {
        super(nome, rg, cpf, dtNasc);
        this.telefones = telefones;
        this.endereco = endereco;
        this.valHrAula = valHrAula;
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

    public Double getValHrAula() {
        return valHrAula;
    }

    public void setValHrAula(Double valHrAula) {
        this.valHrAula = valHrAula;
    }

    @Override
    public String toString() {
        return "Professor{" + "Nome = " + super.getNome()
                + ", RG = " + super.getRg() + ", CPF = " + super.getCpf()
                + ", Data de nascimento = " + super.getDtNasc()
                + ", telefones=" + telefones + ", endereco=" + endereco
                + ", valHrAula=" + valHrAula + '}';
    }

}
