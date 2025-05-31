package IF_ELSE_ELSEIF;
import java.io.*;
import java.util.Scanner;

public class TICKT {
    public static void main(String[] args) {
        // Criando o objeto pessoa1 da classe Pessoa
        Pessoa pessoa1 = new Pessoa();

        Scanner scanner = new Scanner(System.in);

        // Solicitação de dados
        System.out.println("Olá, responda as perguntas abaixo para saber qual ingresso você comprará");
        
        System.out.print("Digite seu nome: ");
        pessoa1.setNome(scanner.nextLine());

        System.out.print("Digite sua idade: ");
        pessoa1.setIdade(scanner.nextInt());

        System.out.print("Digite sua altura: ");
        pessoa1.setAltura(scanner.nextDouble());

        // Salvar as informações no arquivo
        salvarInformacoesNoArquivo(pessoa1);

        // Ler e apresentar as informações salvas
        System.out.println(pessoa1.apresentar());

        scanner.close();  // Fechar o scanner após o uso
    }

    // Método para salvar as informações no arquivo
    private static void salvarInformacoesNoArquivo(Pessoa pessoa) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dados_pessoa.txt"))) {
            writer.write(pessoa.getNome() + "\n");
            writer.write(pessoa.getIdade() + "\n");
            writer.write(pessoa.getAltura() + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao salvar as informações no arquivo.");
            e.printStackTrace();
        }
    }
}
