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

            System.out.println();
            
         }
    }
}
