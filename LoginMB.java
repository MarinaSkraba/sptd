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
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginMB {

    private Usuario usuario;

    public LoginMB() {
        usuario = new Usuario();
    }

    public String verificarLogin() throws HashGenerationException {
        String senhaSHA512 = Digest.hashString(usuario.getSenhaAlfanumerica(), "SHA-512");
        System.out.println("Chegou criptografia");
        System.out.println(usuario.getEmail());
        System.out.println(senhaSHA512);
        Dao<Usuario> usuarioDao = new GenericDAO<>(Usuario.class);
        List<Usuario> usuarios = usuarioDao.verificarUsuario(usuario.getEmail(), senhaSHA512);
        usuario = usuarios.get(0);
        System.out.println("Chegou object");
        System.out.println(usuario);
        if (usuario.getIdUsuario() != 0) {
            if (usuario instanceof Docente) {
                return "/umaTela";
            } else if (usuario instanceof DiretorEnsino) {
                return "/umaTela";
            }
            return "/umaTela";
        }else{
            System.out.println("Usuário não existe");
        }
        return null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String entrar(){
        return "/criarCorrigirPTD";
    }
    
}
