/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.irati.mb;

import br.edu.ifpr.irati.dao.Dao;
import br.edu.ifpr.irati.dao.GenericDAO;
import br.edu.ifpr.irati.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Marina
 */
@ManagedBean
public class UsuarioMB {
    
    
    private Usuario usuario;
    private List <Usuario> usuarios;

    public UsuarioMB() {
        
        usuario = new Usuario();
        usuarios = new ArrayList<>();       
    }
    
    public void salvar(){
        Dao<Usuario> usuarioDAO = new GenericDAO<>(Usuario.class);
        usuarioDAO.salvar(usuario);
        usuarios = usuarioDAO.buscarTodos(Usuario.class);    
    }
    
    public String alterar(Usuario usuario){
        this.usuario = usuario;
        return " adicionar xhtml aqui";
    }
    
    public void desabilitar(){
        //implementar depois
    }
            
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List <Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List <Usuario> usuarios) {
        this.usuarios = usuarios;
    }
   
}
