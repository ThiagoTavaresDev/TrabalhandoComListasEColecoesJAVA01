//Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.

public class Pessoa {
    private String nome;
    private int idade;
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    @Override
    public String toString() {
        return ("o nome é: " + nome + " e a idade " + idade);
    }
}
