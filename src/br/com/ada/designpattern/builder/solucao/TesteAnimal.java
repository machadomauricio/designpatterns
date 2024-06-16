package br.com.ada.designpattern.builder.solucao;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal = Animal.builder()
                .nome("Rex")
                .raca("Pasto Alemão")
                .dono("Maurício")
                .build();

        System.out.println(animal);
    }
}
