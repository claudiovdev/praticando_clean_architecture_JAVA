package br.com.escola.domain.aluno;

import java.util.List;

public interface RepositorioDeAluno {

    void matricular(Aluno aluno);

    Aluno buscarPorCpf(CPF cpf);

    List<Aluno> listarTodosAlunos();

}
