package br.com.escola.domain.exception;

public class AlunoNaoEncontradoException extends RuntimeException{
    public AlunoNaoEncontradoException(String message) {
        super(message);
    }
}
