package POO;
// Novos objetos para poder fazer ações no programa com elesss
// interações entre objetos

//Classe -> objeto
//Molde de objeto = classe
//Cria um novo objeto = instancia

public class Pessoa {
 
    
    // Atributos = Caracteristicas
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(){
        this.nome = "Sem nome";
        this.idade = 0;
        this.altura = 0.0;
        this.peso = 0.0;
    }
    //Métodos -> ações
    // setters e getters
    // setters para colocar, atribuir valor
    // getters para pegar 
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    //idade
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    //altura
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return this.altura;
    }
    //peso
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return this.peso;
    }
}
