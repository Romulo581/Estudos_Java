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
    }
}
