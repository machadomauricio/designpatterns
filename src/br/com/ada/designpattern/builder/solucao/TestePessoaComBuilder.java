package br.com.ada.designpattern.builder.solucao;

import br.com.ada.designpattern.builder.Pessoa;

import java.time.LocalDate;

public class TestePessoaComBuilder {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.PessoaBuilder().nome("Maurício")
                .sobreNome("Machado")
                .documento("01194528040")
                .email("mau87machado@gmail.com")
                .apelido("Mau")
                .dataNascimento(LocalDate.of(1987, 04, 03))
                .build();

        System.out.println(pessoa);

        StringBuilder sb= new StringBuilder().append("palavra1").append("palavra2");
        System.out.println(sb);
    }
}
