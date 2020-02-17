package lambdas;

import java.util.function.Function;

public class Funcao {
    // Function => Pode definir o tipo de parametro e retorno
    public static void main(String[] args) {
        // Nesse cógido foi usado a composição de função
        Function<Integer, String> parOuImpar = 
                numero -> numero % 2 == 0 ? "Par" : "Impar";
        System.out.println(parOuImpar.apply(32));
        
        Function<String, String> oResultadoE = 
                valor -> "O resultado é: " + valor;
        
        Function<String, String> empolgado = 
                valor -> valor + "!!!";
        
        String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
    }
}
