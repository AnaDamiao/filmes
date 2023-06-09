package br.com.tech4me.filmes.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie_cast")
public class Atuacao {
    @EmbeddedId
    private AtuacaoId id;
    @Column(name = "role")
    private String papel;

    public AtuacaoId getId() {
        return id;
    }

    public void setId(AtuacaoId id) {
        this.id = id;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", id.getAtor().getNomeCompleto().trim(), papel.trim());
    }
}