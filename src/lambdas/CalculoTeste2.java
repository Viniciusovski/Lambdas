package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        // Fazer a mesma coisa que o Teste1 porém com a interface junto com função lambda
        // Utiliza-se uma função sem nome (anonima), associa ela a uma variavel 
        //
        Calculo calc = (x, y) -> { return x + y; }; // Com o par de chaves é obrigatorio o return
        System.out.println(calc.executar(3, 8));
        
        calc = (x,y) -> x * y; // quando tem apena 1 sentença de código, já entende que haverá retorno e não precisa de chaves
        System.out.println(calc.executar(3, 8));
    }
}
