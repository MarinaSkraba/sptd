/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.irati.mb;

import br.edu.ifpr.irati.dao.Dao;
import br.edu.ifpr.irati.dao.GenericDAO;
import br.edu.ifpr.irati.modelo.Horario;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Marina
 */
@ManagedBean
public class HorarioMB {

    private Horario horario;
    List<Horario> horarios;

    public HorarioMB() {

        horario = new Horario();
        horarios = new ArrayList<>();
    }

    public void salvar() {
        Dao<Horario> horarioDAO = new GenericDAO<>(Horario.class);
        horarioDAO.salvar(horario);
        horarios = horarioDAO.buscarTodos(Horario.class);

    }

    public String alterar(Horario horario) {
        this.horario = horario;
        return " adicionar xhtml aqui";
    }

    public String excluir(Horario horario) {
        Dao<Horario> horarioDAO = new GenericDAO<>(Horario.class);
        horarioDAO.excluir(horario);
        horarios = horarioDAO.buscarTodos(Horario.class);
        return "adicionar xhtml aqui";
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
