/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.irati.mb;

import br.edu.ifpr.irati.dao.Dao;
import br.edu.ifpr.irati.dao.GenericDAO;
import br.edu.ifpr.irati.modelo.ProjetoPesquisa;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Marina
 */
@ManagedBean
public class ProjetoPesquisaMB {
    
    private ProjetoPesquisa projetoPesquisa;
    private List<ProjetoPesquisa> projetosPesquisa;

     public void salvar() {
        Dao<ProjetoPesquisa> projetoPesquisaDAO = new GenericDAO<>(ProjetoPesquisa.class);
        projetoPesquisaDAO.salvar(projetoPesquisa);
        projetosPesquisa = projetoPesquisaDAO.buscarTodos(ProjetoPesquisa.class);
    }

    public String alterar(ProjetoPesquisa projetoPesquisa) {
        this.projetoPesquisa = projetoPesquisa;
        return " adicionar xhtml aqui";
    }

    public List<ProjetoPesquisa> listar() {
        
        Dao<ProjetoPesquisa> projetoPesquisaDAO = new GenericDAO<>(ProjetoPesquisa.class);
        projetosPesquisa = projetoPesquisaDAO.buscarTodos(ProjetoPesquisa.class);
        return null;
    }

    public void desabilitar() {

        // implementar depois
    }
    public ProjetoPesquisa getProjetoPesquisa() {
        return projetoPesquisa;
    }

    public void setProjetoPesquisa(ProjetoPesquisa projetoPesquisa) {
        this.projetoPesquisa = projetoPesquisa;
    }

    public List<ProjetoPesquisa> getProjetosPesquisa() {
        return projetosPesquisa;
    }

    public void setProjetosPesquisa(List<ProjetoPesquisa> projetosPesquisa) {
        this.projetosPesquisa = projetosPesquisa;
    }
}
