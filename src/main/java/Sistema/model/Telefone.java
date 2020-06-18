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
public class Telefone {

    private String numero;
    private Tipo tipo;

    //m�todo construtor
    public Telefone(String numero, Tipo tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    // extrai o n�mero salvo em uma inst�ncia dessa classe
    public String getNumero() {
        return numero;
    }

    // salva um n�mero dentro de uma inst�ncia dessa classe
    public void setNumero(String numero) {
        this.numero = numero;
    }

    // extrai o tipo salvo em uma inst�ncia dessa classe
    public Tipo getTipo() {
        return tipo;
    }

    // salva um tipo dentro de uma inst�ncia dessa classe
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Telefone{" + "numero=" + numero + ", tipo=" + tipo + '}';
    }
}
