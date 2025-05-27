package PROJETO;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Todas as opções seram exibidas para o usuario
        // E pedira para escolher
        int opcao;

        do {

            System.out.println("Calculadora Java");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {

                // Resgatar os numeros do usuario
                System.out.println("Digite o Primeiro Número: ");
                double num1 = scanner.nextDouble();
                System.out.println("Digite o Segundo Numero: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                boolean operacaoValida = true;

                System.out.println("Primeiro número: " + num1 + " Segundo número: " + num2);
                // Encontar o resultado
                switch (opcao) {
                    case 1:
                        resultado = adicionar(num1, num2);
                        break;

                    case 2:
                        resultado = subtrair(num1, num2);
                        break;

                    case 3:
                        resultado = multiplica(num1, num2);
                        break;

                    case 4:
                        resultado = dividir(num1, num2);
                        if (num2 != 0) {
                            resultado = dividir(num1, num2);
                        } else {
                            System.out.println("Divisão por 0!");
                            operacaoValida = false;
                        }
                        break;

                    default:
                        operacaoValida = false;
                        break;
                }
                if (operacaoValida) {
                    System.out.println("Resultado: " + resultado);
                }

            } else if (opcao != 0) {
                System.out.println("Opção invalida");
            }
            
            // Mostrar o resultado

        } while (opcao != 0);
        System.out.println("Cauculadora encerrada! ");
        scanner.close();
    }

    public static double adicionar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

}
