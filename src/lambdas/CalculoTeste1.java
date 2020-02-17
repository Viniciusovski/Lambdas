package lambdas;

public class CalculoTeste1 {
    public static void main(String[] args) {
//        
//        Calculo somar = new Soma();
//        Calculo multiplicacao = new Multiplicar();
        
        Calculo calculo = new Soma();
        System.out.println(calculo.executar(5, 6));
        
        calculo = new Multiplicar();
        System.out.println(calculo.executar(6, 2));
        
        
    }
}
