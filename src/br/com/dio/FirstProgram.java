package br.com.dio;

import br.com.dio.model.Gato;

public class FirstProgram {

    public static void main(String[] args) {

        Double a = 5.0;
        Double b = 2.0;
        Double c = a/b;

        System.out.println(c);


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

        Livro livro1 = new Livro("O Problema dos três corpos", 2000);
        System.out.println(livro1);
    }

    static class Livro{
        private String nome;
        private Integer numPaginas;

        public Livro(String nome, Integer numPaginas) {
            this.nome = nome;
            this.numPaginas = numPaginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(Integer numPaginas) {
            this.numPaginas = numPaginas;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas=" + numPaginas +
                    '}';
        }
    }

}
