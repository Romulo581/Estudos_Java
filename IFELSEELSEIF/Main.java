import java.util.Scanner;
package IFELSEELSEIF;

public class Main {
    public static void main(String[] args) {
        System.out.println("Verificador de notas");
        System.out.println("Siga as instruções a baixo");

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite sua nota: ");
        double nota = scanner.nextDouble();
            

        if(nota >= 7 ){
            System.out.println("O aluno " + nome + " esta aprovado com a nota: " + nota);
        
        }else if (nota >= 6 && nota < 7){
            System.out.println("O aluno " + nome + " esta de recuperação com  nota: " + nota);
        }else{
            System.out.println("O aluno " + nome + "está reprovado com: " + nota);    
        }
        
    }
    
}


