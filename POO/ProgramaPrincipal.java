package POO;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        
        // Criar uma pessoa => instanciar (new)
        // tipo(classe) var = new classe()
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Rômulo César");
        pessoa1.setIdade(26);
        pessoa1.setPeso(65.5);
        pessoa1.setAltura(1.75);

        System.out.println("Meu nome é " + pessoa1.getNome() + " eu tenho " + pessoa1.getIdade() + " anos, peso por volta de " + pessoa1.getPeso() + "Kg e tenho " + pessoa1.getAltura() + " metros de Altura");


        Pessoa pessoa2 = new Pessoa( " César", 27, 1.75,65);

        System.out.println("Olá meu nome é " + pessoa2.getNome() + " eu tenho " + pessoa2.getIdade() + " de idade," + " tenho cerca de " + pessoa2.getPeso() + "kg e tenho " + pessoa2.getAltura() + " metros de altura");

        System.out.println(pessoa2.calcularImc());

        System.out.println(pessoa2.classificaoDeImc());

        System.out.println(pessoa1.apresentar());
        System.out.println(pessoa2.apresentar());
    }
}
<<<<<<< Updated upstream
<<<<<<< Updated upstream
//teste de branch
=======
// teste 2
//teste 3
>>>>>>> Stashed changes
=======
// teste 2
//teste 3
>>>>>>> Stashed changes
