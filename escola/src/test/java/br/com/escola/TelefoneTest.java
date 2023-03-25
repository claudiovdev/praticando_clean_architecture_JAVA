package br.com.escola;

import br.com.escola.domain.aluno.Telefone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TelefoneTest {
    @Test
    void naoDeveriaCadastrarTelefoneInvalido(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telefone("", ""));
    }
    @Test
    void deveriaPermitirCadastrarComDDDENumeroValidos(){
        String ddd = "11";
        String numero = "123456789";
        Telefone telefone = new Telefone(ddd, numero);
        Assertions.assertEquals(ddd, telefone.getDdd());
        Assertions.assertEquals(numero, telefone.getNumero());
    }
}
