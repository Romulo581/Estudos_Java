public class Main {
    
    public static void main(String[] args) {
        //Acho que trabalharemos com Arrays
        String[] wordListOne ={"24/07", "Varias camada", "30.00 pes", "b-to-b", "todos ganham", "front-end", "baseado na web", "difundido", "inteligente","seis signos", "caminho  critico", "dinheir"};
        
        String[] wordListTwo = {"habilidade", "adesivo", "varios agregados", "orientados", "central", "distribuido", "agrupados", "solidificados", "dependente da maquina", "posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado", "compartilhando", "cooperativo", "acelerando"};
        
        String[] wordListThree = {"processo", "ponto maximo", "solução", "arquitetura", "habilitação no núcleo", "estrategia", "do grego estraterria", "portal", "espaço", "visão", "paradigma", "misão"};
        
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
	
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
	
	System.out.println(" precisamos de " + phrase);
        
        
    }
    
}