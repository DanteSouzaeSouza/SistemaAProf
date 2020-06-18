/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.model;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 *
 * @author pcgrande
 */
public class Turma {

    private String nomeTurma;
    private String nomeProf;
    private String nomeCurso;
    private Date dtInicio;
    private Date dtTermino;
    private Time hrInicio;
    private Time hrFim;

    private List<Matricula> matriculas;

    public Turma(String nomeTurma, String nomeCurso,
            Date dtInicio, Date dtTermino, Time hrInicio, Time hrFim) {
        this.nomeTurma = nomeTurma;
        this.nomeCurso = nomeCurso;
        this.dtInicio = dtInicio;
        this.dtTermino = dtTermino;
        this.hrInicio = hrInicio;
        this.hrFim = hrFim;

    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Date getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Date getDtTermino() {
        return dtTermino;
    }

    public void setDtTermino(Date dtTermino) {
        this.dtTermino = dtTermino;
    }

    public Time getHrInicio() {
        return hrInicio;
    }

    public void setHrInicio(Time hrInicio) {
        this.hrInicio = hrInicio;
    }

    public Time getHrFim() {
        return hrFim;
    }

    public void setHrFim(Time hrFim) {
        this.hrFim = hrFim;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    @Override
    public String toString() {
        return "Turma{" + "nomeTurma=" + nomeTurma + ", nomeProf=" + nomeProf
                + ", nomeCurso=" + nomeCurso + ", dtInicio=" + dtInicio
                + ", dtTermino=" + dtTermino + ", hrInicio=" + hrInicio
                + ", hrFim=" + hrFim + ", matriculas=" + matriculas + '}';
    }
}
