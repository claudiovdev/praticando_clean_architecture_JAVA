package br.com.escola.infra.aluno;

import br.com.escola.domain.aluno.Aluno;
import br.com.escola.domain.aluno.CPF;
import br.com.escola.domain.aluno.RepositorioDeAluno;
import br.com.escola.domain.exception.AlunoNaoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class RelatorioDeAlunosEmMemoria implements RepositorioDeAluno {

    private List<Aluno> alunos = new ArrayList<>();
    @Override
    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
    }

    @Override
    public Aluno buscarPorCpf(CPF cpf) {
        return this.alunos.stream().filter(a -> a.getCpf().equals(cpf.getNumero())).findFirst().orElseThrow(() -> new AlunoNaoEncontradoException(cpf.getNumero()));
    }

    @Override
    public List<Aluno> listarTodosAlunos() {
        return this.alunos;
    }
}
