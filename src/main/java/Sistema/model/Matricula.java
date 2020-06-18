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
public class Matricula {

    private Date dtMatricula;
    private Double valorPago;
    private String ra;

    public Matricula(Date dtMatricula, Double valorPago, String ra) {
        this.dtMatricula = dtMatricula;
        this.valorPago = valorPago;
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Date getDtMatricula() {
        return dtMatricula;
    }

    public void setDtMatricula(Date dtMatricula) {
        this.dtMatricula = dtMatricula;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    @Override
    public String toString() {
        return "Matricula{" + "dtMatricula=" + dtMatricula
                + ", valorPago=" + valorPago + ", ra=" + ra + '}';
    }

}
