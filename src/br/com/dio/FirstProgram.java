package br.com.dio;

import br.com.dio.model.Gato;

public class FirstProgram {

    public static void main(String[] args) {

        Gato gato = new Gato();

        gato.setCor("marelo");
        gato.setIdade(67);
        gato.setNome("Frederico");

        Gato gato2 = new Gato();

        gato2.setNome("Pitico");
        gato2.setIdade(34);
        gato2.setCor("cor de cinza");

        System.out.println(gato);
        System.out.println(gato2);
    }

}
