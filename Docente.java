package br.edu.ifpr.irati.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "docente")
@PrimaryKeyJoinColumn(name = "idUsuario")
public class Docente extends Usuario implements Serializable {

    @Column(name = "matriculaSIAPE", nullable = false, length = 15)
    private String matriculaSIAPE;

    @Column(name = "regimeTrabalho", nullable = false, length = 20)
    private String regimeTrabalho;

    @Column(name = "tipoContrato", nullable = false, length = 30)
    private String tipoContrato;

    @Temporal(TemporalType.DATE)
    private Date dataContratacao;

    public Docente() {
        super();
        this.matriculaSIAPE = "";
        this.regimeTrabalho = "";
        this.tipoContrato = "";
        this.dataContratacao = new Date();
    }

    public Docente(String matriculaSIAPE, String regimeTrabalho, String tipoContrato, Date dataContratacao, int idUsuario, String nomeCompleto, String email, String imagemPerfil, String senhaAlfanumerica) {
        super(idUsuario, nomeCompleto, email, imagemPerfil, senhaAlfanumerica);
        this.matriculaSIAPE = matriculaSIAPE;
        this.regimeTrabalho = regimeTrabalho;
        this.tipoContrato = tipoContrato;
        this.dataContratacao = dataContratacao;
    }

    public String getMatriculaSIAPE() {
        return matriculaSIAPE;
    }

    public void setMatriculaSIAPE(String matriculaSIAPE) {
        this.matriculaSIAPE = matriculaSIAPE;
    }

    public String getRegimeTrabalho() {
        return regimeTrabalho;
    }

    public void setRegimeTrabalho(String regimeTrabalho) {
        this.regimeTrabalho = regimeTrabalho;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

}
