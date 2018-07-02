/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.irati.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "curso")
public class Curso implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUsuario;

    @Column(name = "matriculaSIAPE", nullable = false, length = 200)
    private String matriculaSIAPE;

    @OneToMany(mappedBy = "curso")
    private List<Aula> aulas;

    public Curso() {
        this.idUsuario = 0;
        this.matriculaSIAPE = "";
        this.aulas = new ArrayList<>();
    }

    public Curso(int idUsuario, String matriculaSIAPE, List<Aula> aulas) {
        this.idUsuario = idUsuario;
        this.matriculaSIAPE = matriculaSIAPE;
        this.aulas = aulas;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getMatriculaSIAPE() {
        return matriculaSIAPE;
    }

    public void setMatriculaSIAPE(String matriculaSIAPE) {
        this.matriculaSIAPE = matriculaSIAPE;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

}
