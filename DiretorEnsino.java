package br.edu.ifpr.irati.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "diretorEnsino")
@PrimaryKeyJoinColumn(name = "idUsuario")
public class DiretorEnsino extends Usuario implements Serializable {

    public DiretorEnsino() {
        super();
    }

    public DiretorEnsino(int idUsuario, String nomeCompleto, String email, String imagemPerfil, String senhaAlfanumerica) {
        super(idUsuario, nomeCompleto, email, imagemPerfil, senhaAlfanumerica);
    }
}
