/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.irati.mb;

import br.edu.ifpr.irati.dao.Dao;
import br.edu.ifpr.irati.dao.GenericDAO;
import br.edu.ifpr.irati.modelo.Participacao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Marina
 */
@ManagedBean
public class ParticipacaoMB {

    private Participacao participacao;
    private List<Participacao> participacoes;

    public ParticipacaoMB() {

        participacao = new Participacao();
        participacoes = new ArrayList<>();
    }
    
      public void salvar() {
        Dao<Participacao> participacaoDAO = new GenericDAO<>(Participacao.class);
        participacaoDAO.salvar(participacao);
        participacoes = participacaoDAO.buscarTodos(Participacao.class);

    }

    public String alterar(Participacao participacao) {
        this.participacao = participacao;
        return " adicionar xhtml aqui";
    }

    public String excluir(Participacao participacao) {
        Dao<Participacao> participacaoDAO= new GenericDAO<>(Participacao.class);
        participacaoDAO.excluir(participacao);
        participacoes = participacaoDAO.buscarTodos(Participacao.class);
        return "adicionar xhtml aqui";
    }
    

    public Participacao getParticipacao() {
        return participacao;
    }

    public void setParticipacao(Participacao participacao) {
        this.participacao = participacao;
    }

    public List<Participacao> getParticipacoes() {
        return participacoes;
    }

    public void setParticipacoes(List<Participacao> participacoes) {
        this.participacoes = participacoes;
    }

}
