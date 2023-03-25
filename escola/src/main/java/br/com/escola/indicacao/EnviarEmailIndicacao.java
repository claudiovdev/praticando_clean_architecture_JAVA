package br.com.escola.indicacao;

import br.com.escola.domain.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno aluno);
}
