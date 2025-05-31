package IF_ELSE_ELSEIF;

public class Pessoa{
    private String nome;
    private int  idade;
    private double altura;

    public Pessoa(){
        this.nome = "Nome";
        this.idade = 0;
        this.altura = 0.0;
    }
    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    public void setNome(){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setAltura(){
        this.altura = altura;
    }
    public double getAltura(){
        return this.altura;
    }
    public String classificar(){
        if (idade <= 11) {
            return "Infantil";
        } else if (idade >= 12 && idade <= 17) {
            return "Adolescente";
        } else if (idade >= 18 && idade <= 59) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }
    public String apresentar() {
        return "Olá " + nome + " você tem " + idade + " anos, sua altura e de " + altura + "m seu ingreço e" + classificar + " Aproveite o desconto";
    }
}