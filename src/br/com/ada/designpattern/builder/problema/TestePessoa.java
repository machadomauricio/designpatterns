package br.com.ada.designpattern.builder.problema;

import br.com.ada.designpattern.builder.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        var pessoa = new Pessoa("Maurício",
                "Machado",
                "01194528040",
                "mau87machado@gmail.com",
                "Mau",
                "03/04,/1987");

        System.out.println(pessoa);
    }
}
