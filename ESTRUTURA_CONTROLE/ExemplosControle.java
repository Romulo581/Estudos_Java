package ESTRUTURA_CONTROLE;

public class ExemplosControle {

    public static void main(String[] args) {
        // if - else (condicionais)

        // operadores de comparação
        // x > y a == b
        int idade = 18;

        // if -> começa a condição
        // () -> contem a conição a ser avaliada
        // {} -> corpo da condição
        if (idade >= 18) {
            System.out.println("Você é maior ed idade. ");
        }
        // if -> valida se algo é verdadeiro
        // else -> executa se o if não executar

        double nota = 6.3;

        if (nota > 7) {
            System.out.println("Você passou de ano. ");
        }else{
            System.out.println("Você está de recuperação. ");
        }
        //else if -> intermediario do if e else
        //e ele valia um bloco tambem

        int hora = 15;
        if ( hora <= 14){
            System.out.println("Você deve sair de casa agora! ");
        }else if( hora > 16){
            System.out.println("Não precisa ir, mande uma mensagem se desculpanddo");

        }else{
            System.out.println("Você está atrasado, avise quando sair! ");
        }
        // eu posso ter mais de 1 else 1
        // 2 - operadores de comparação
         int x = 8;
         int y = 5;

         //EH DIFERENTE DE ==
         //  = é atribuição
         // == é comparação
         System.out.println("X == Y: " + (x == y));
         System.out.println("X != Y: " + (x != y)); // != significa Diferente de
         System.out.println("X  > Y: " + (x > y));
         System.out.println("X  < Y: " + (x < y));
         System.out.println("X >= Y: " + (x >= y));
         System.out.println("X <= Y: " + (x <= y));
         
         boolean o = true;
         if (o) {
            System.out.println("é verdadeiro");
         }
         // Operadores logicos
         // && => AND => operação 1 && operação 2 => Viram boolean => Valida como true apenas se os dois forem true se n felse
         // || => OR =>  operação 1 || operação 2 => Viram boolean => Valida de alguma das duas operações for true
         //  ! => NOT => !valor => altera o valor para o contrario => (True Vira False")e (False vira True)

         boolean temDinheiro = true;
         boolean temTempo = false;

         if(temDinheiro && temTempo){
            System.out.println("Pode viajar");
         }else{
            System.out.println("Não pode Viajar");
         }

         // LOOPS - While e For
         // FOCO em FOR
         // Repetir alo até uma condição ser atingida
         // Evitar repetição mecanica de codigo (ela vira automatica)
         int contador = 1;
         while (contador <= 5) {

            System.out.println( contador );
            contador++; 
         }
         // se eu nao tenho uma condição de encerramento de loop
         // eu caio num loop infinito

         // interação = cada passagem pela estrutura do loop

         for(int i = 1; i <= 5; i ++){
            System.out.println("Valor de i é " + i);
         }

         // exemplos práticos

         //analise numerica
         int[] numeros = {1,2,3,4,5,6,7,8,9};
         int somaPar = 0;
         int somaImpar = 0;

        // com vou chamar a unidade da lista : lista
        for(int num : numeros){
            System.out.println(num);
            if(num % 2 ==0){
                somaPar += num;
            }else{
                somaImpar += num;
            }
            // idedntificar se o numero e multiplo de 3
            if (num % 3 == 0) {
                System.out.println("o numero " + num + " é multipl de 3");
            }
            if (num > 5 && num < 7) {
                System.out.println("O número esta entre 5 e 7, " + num);
        }
        }
        System.out.println("Soma pares: " + somaPar);
        System.out.println("Soma impares: " + somaImpar);
        
        //break => ejeta o loop
        //continue => pular uma execução

        // vars temporarios dos loops, elas podem repetir o nome
        for( int i = 1; i <= 10; i++){
            if (i == 2) {
                continue;
            }
            if (i == 5 ) {
                break;
            }
            System.out.println(i);
        }
    
    }
}
