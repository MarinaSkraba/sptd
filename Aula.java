package br.edu.ifpr.irati.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "aula")
public class Aula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAula;

    @Column(name = "componenteCurricular", nullable = false, length = 20)
    private String componenteCurricular;

    @OneToMany
    private List<Horario> horarios;

    @ManyToOne
    @JoinColumn(name = "curso_idCurso")
    private Curso curso;

    @OneToOne
    private TipoOferta tipoOferta;

    public Aula() {
        this.idAula = 0;
        this.componenteCurricular = "";
        this.horarios = new ArrayList<>();
        this.curso = new Curso();
        this.tipoOferta = new TipoOferta();
    }

    public Aula(int idAula, String componenteCurricular, List<Horario> horarios, Curso curso, TipoOferta tipoOferta) {
        this.idAula = idAula;
        this.componenteCurricular = componenteCurricular;
        this.horarios = horarios;
        this.curso = curso;
        this.tipoOferta = tipoOferta;
    }

    public int getIdAula() {
        return idAula;
    }

    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }

    public String getComponenteCurricular() {
        return componenteCurricular;
    }

    public void setComponenteCurricular(String componenteCurricular) {
        this.componenteCurricular = componenteCurricular;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public TipoOferta getTipoOferta() {
        return tipoOferta;
    }

    public void setTipoOferta(TipoOferta tipoOferta) {
        this.tipoOferta = tipoOferta;
    }

}
