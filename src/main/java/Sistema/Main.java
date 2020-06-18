/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

// importa  uma biblioteca ou classe para uso
import Sistema.model.Aluno;
import Sistema.model.Professor;
import Sistema.model.Endereco;
import Sistema.model.Telefone;
import Sistema.model.Tipo;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

/**
 *
 * @author pcgrande
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Meu texto!");

        Telefone tel = new Telefone("11998877654321", Tipo.CELULAR);

        System.out.println(tel.toString());

        List<Telefone> tels = new ArrayList<>();

        tels.add(tel);

        Endereco end = new Endereco(Tipo.RESIDENCIAL, "Rua A", 30, null, "Vila Brasil", "São Paulo", "01111-111", "SP");

        Date data = new Date(1981, 06, 14);

        Aluno aluno = new Aluno(12345678, tels, end, "Maroca Fofoca", "987654321", "12345678900", data);

        System.out.println(aluno.toString());

        Professor prof = new Professor(tels, end, 45.97, "Maroca Fofoca", "987654321", "12345678900", data);

        System.out.println(prof.toString());

    }

}
