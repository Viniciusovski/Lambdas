package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        // Nesse caso não usou o new
        // Usou a classe Arrays para aajudar na consstrução
        // Contexto de collections, List
        
        
        List<String> aprovados = Arrays.asList("Ana","Bia", "Lia", "Gui");
        
        System.out.println("Forma Tradicional...");
        for(String nome : aprovados){
            System.out.println(nome);
        }
        
        System.out.println("\n Lambda #01...");
        aprovados.forEach((nome) -> { System.out.println(nome + "!!!!"); });
        // aprovados.forEach(nome -> System.out.println(nome + "!!!!")); -->> Versão curta e implicita
        
        System.out.println("\n Method Reference...");
        aprovados.forEach(System.out::println);
        
        System.out.println("\n Lambda #02...");
        aprovados.forEach(nome -> meuImprimir(nome));
        
        System.out.println("\n Method Reference #02...");
        aprovados.forEach(Foreach::meuImprimir);
        
}

    static void meuImprimir(String nome){
        System.out.println("Oi! O meu nome é " + nome);
    }
    

}

