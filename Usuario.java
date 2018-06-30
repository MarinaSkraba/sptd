/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.irati.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Marina
 */
@Entity(name = "usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUsuario;

    @Column(name = "nomeCompleto", nullable = false, length = 15)
    private String nomeCompleto;

    @Column(name = "email", nullable = false, length = 15)
    private String email;

    @Column(name = "imagemPerfil", nullable = false, length = 15)
    private String imagemPerfil;

    @Column(name = "senhaAlfanumérica", nullable = false, length = 15)
    private String senhaAlfanumerica;

    public Usuario() {

        idUsuario = 0;
        nomeCompleto = "";
        email = "";
        imagemPerfil = "";
        senhaAlfanumerica = "";

    }

    public Usuario(int idUsuario, String nomeCompleto, String email, String imagemPerfil, String senhaAlfanumerica) {
        this.idUsuario = idUsuario;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.imagemPerfil = imagemPerfil;
        this.senhaAlfanumerica = senhaAlfanumerica;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagemPerfil() {
        return imagemPerfil;
    }

    public void setImagemPerfil(String imagemPerfil) {
        this.imagemPerfil = imagemPerfil;
    }

    public String getSenhaAlfanumerica() {
        return senhaAlfanumerica;
    }

    public void setSenhaAlfanumerica(String senhaAlfanumerica) {
        this.senhaAlfanumerica = senhaAlfanumerica;
    }

}
