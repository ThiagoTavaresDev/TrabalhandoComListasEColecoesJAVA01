import java.util.ArrayList;





public class Main {
    public static void main(String[] args) {
        //No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
        //Adicione pelo menos três pessoas à lista utilizando o método add.
        Pessoa p1 = new Pessoa("Thiago", 10);
        Pessoa p2 = new Pessoa("Jorge",12);
        Pessoa p3 = new Pessoa("Edvaldo Peri Cleiton",23);
        System.out.println(p1.toString());

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        //Imprima o tamanho da lista utilizando o método size.
        System.out.println(pessoas.size()) ;
        //Imprima a primeira pessoa da lista utilizando o método get.
        System.out.println(pessoas.get(0));
        //Imprima a lista completa
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

    }
}