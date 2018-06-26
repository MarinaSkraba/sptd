/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.irati.mb;

import br.edu.ifpr.irati.dao.Dao;
import br.edu.ifpr.irati.dao.GenericDAO;
import br.edu.ifpr.irati.modelo.ProjetoExtensao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;


@ManagedBean
public class ProjetoExtensaoMB {

    private ProjetoExtensao projetoExtensao;
    private List<ProjetoExtensao> projetosExtensao;

    public ProjetoExtensaoMB() {
        projetoExtensao = new ProjetoExtensao();
        projetosExtensao = new ArrayList<>();
    }

    public void salvar() {
        Dao<ProjetoExtensao> projetoExtensaoDAO = new GenericDAO<>(ProjetoExtensao.class);
        projetoExtensaoDAO.salvar(projetoExtensao);
        projetosExtensao = projetoExtensaoDAO.buscarTodos(ProjetoExtensao.class);
    }

    public String alterar(ProjetoExtensao projetoExtensao) {
        this.projetoExtensao = projetoExtensao;
        return " adicionar xhtml aqui";
    }

    public List<ProjetoExtensao> listar() {
        
        Dao<ProjetoExtensao> projetoExtensaoDAO = new GenericDAO<>(ProjetoExtensao.class);
        projetosExtensao = projetoExtensaoDAO.buscarTodos(ProjetoExtensao.class);
        return null;
    }

    public void desabilitar() {

        // implementar depois
    }

    public ProjetoExtensao getProjetoExtensao() {
        return projetoExtensao;
    }

    public void setProjetoExtensao(ProjetoExtensao projetoExtensao) {
        this.projetoExtensao = projetoExtensao;
    }

    public List<ProjetoExtensao> getProjetosExtensao() {
        return projetosExtensao;
    }

    public void setProjetosExtensao(List<ProjetoExtensao> projetosExtensao) {
        this.projetosExtensao = projetosExtensao;
    }

}
