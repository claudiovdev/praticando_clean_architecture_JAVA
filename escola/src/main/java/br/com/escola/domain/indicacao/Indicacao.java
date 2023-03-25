package br.com.escola.domain.indicacao;

import br.com.escola.domain.aluno.Aluno;

import java.time.LocalDateTime;

public class Indicacao {

    private Aluno indicado;
    private Aluno indicante;
    private LocalDateTime dateTime;

    public Indicacao(Aluno indicado, Aluno indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
        this.dateTime = LocalDateTime.now();
    }
}
