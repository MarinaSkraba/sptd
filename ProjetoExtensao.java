/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.irati.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name= "projetoextensao")
public class ProjetoExtensao implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProjetoExtensao;
    
    @Column(name = "numeroProcesso", nullable = false, length = 20)
    private String numeroProcesso;
    
    @Column(name = "tituloProcesso", nullable = false, length = 250)
    private String tituloProcesso;
    
   @Temporal(TemporalType.DATE)
    private Date previsaoConclusao;
   
   @Column(name = "instituicaoPesquisa", nullable = false, length = 150)
    private String instituicaoPesquisa;

    @OneToMany
    private List<Horario> horarios;
    
    @OneToMany
    private List<Participacao> participacoes;
    
    public ProjetoExtensao() {
        
    this.idProjetoExtensao = 0;
    this.numeroProcesso = "";
    this.tituloProcesso = "";
    this.previsaoConclusao = new Date();
    this.instituicaoPesquisa = "";
    
    }

    public ProjetoExtensao(int idProjetoExtensao, String numeroProcesso, String tituloProcesso, Date previsaoConclusao, String instituicaoPesquisa) {
        this.idProjetoExtensao = idProjetoExtensao;
        this.numeroProcesso = numeroProcesso;
        this.tituloProcesso = tituloProcesso;
        this.previsaoConclusao = previsaoConclusao;
        this.instituicaoPesquisa = instituicaoPesquisa;
        this.horarios = new ArrayList();
        
        // colocar ligação iniciando vazio e mais um construtor
    }

    public ProjetoExtensao(int idProjetoExtensao, String numeroProcesso, String tituloProcesso, Date previsaoConclusao, String instituicaoPesquisa, List<Horario> horarios) {
        this.idProjetoExtensao = idProjetoExtensao;
        this.numeroProcesso = numeroProcesso;
        this.tituloProcesso = tituloProcesso;
        this.previsaoConclusao = previsaoConclusao;
        this.instituicaoPesquisa = instituicaoPesquisa;
        this.horarios = horarios;
    }
    public void adicionarHorario(Horario horario){
        this.getHorarios().add(horario);
    }
    
    public int getIdProjetoExtensao() {
        return idProjetoExtensao;
    }

    public void setIdProjetoExtensao(int idProjetoExtensao) {
        this.idProjetoExtensao = idProjetoExtensao;
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public String getTituloProcesso() {
        return tituloProcesso;
    }

    public void setTituloProcesso(String tituloProcesso) {
        this.tituloProcesso = tituloProcesso;
    }

    public Date getPrevisaoConclusao() {
        return previsaoConclusao;
    }

    public void setPrevisaoConclusao(Date previsaoConclusao) {
        this.previsaoConclusao = previsaoConclusao;
    }

    public String getInstituicaoPesquisa() {
        return instituicaoPesquisa;
    }

    public void setInstituicaoPesquisa(String instituicaoPesquisa) {
        this.instituicaoPesquisa = instituicaoPesquisa;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    public List<Participacao> getParticipacoes() {
        return participacoes;
    }

    public void setParticipacoes(List<Participacao> participacoes) {
        this.participacoes = participacoes;
    }
    

}
