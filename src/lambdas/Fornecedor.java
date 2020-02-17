package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

// Não recebe nenhum parametro, o que faz obrigatorio o uso do () na função
// Usa apenas o () quando nao tem parametros, ou há muitos parametros
public class Fornecedor {
    
    public static void main(String[] args) {
        
        Supplier<List<String>> umLista = 
                () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
        System.out.println(umLista.get());
    }
}
