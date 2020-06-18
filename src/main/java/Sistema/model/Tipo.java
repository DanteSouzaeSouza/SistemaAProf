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
public enum Tipo {
    RESIDENCIAL(1), COMERCIAL(2), RECADOS(3), CELULAR(4);

    private final int value;

    // sempre que formos instanciar essa classe, devemos passar os atributos
    // do método construtor
    private Tipo(int value) {
        this.value = value;
    }

    // método que extrai o valor armazenado num objeto dessa classe
    public int getValue() {
        return value;
    }

}
