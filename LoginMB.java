/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.irati.mb;

import br.edu.ifpr.irati.dao.Dao;
import br.edu.ifpr.irati.dao.GenericDAO;
import br.edu.ifpr.irati.modelo.DiretorEnsino;
import br.edu.ifpr.irati.modelo.Docente;
import br.edu.ifpr.irati.modelo.Usuario;
import br.edu.ifpr.irati.util.Digest;
import br.edu.ifpr.irati.util.HashGenerationException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginMB {

    private Usuario usuario;

    public LoginMB() {
        usuario = new Usuario();
    }

    public void verificarLogin() throws HashGenerationException {
        String senhaSHA512 = Digest.hashString(usuario.getSenhaAlfanumerica(), "SHA-512");     
        System.out.println("Chegou criptografia");
        System.out.println(usuario.getEmail());
        System.out.println(senhaSHA512);
        Dao<Usuario> usuarioDao = new GenericDAO<>(Usuario.class);
        usuario = usuarioDao.verificarUsuario(usuario.getEmail(), senhaSHA512);
        System.out.println("Chegou object");
        System.out.println(usuario);

        efetuarLogin(usuario);
    }

    public String efetuarLogin(Object o) {
        if (o instanceof Docente) {
            return "/PTD";
        } else if (o instanceof DiretorEnsino) {
            return "/index";
        }
        System.out.println("Usuário não existe");
        return null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
