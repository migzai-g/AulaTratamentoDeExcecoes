public class Principal {

    public static void main(String[] args) {

        Soma soma = new Soma();
        Divisao divisao = new Divisao();

        // Soma
        try {
            double resultadoSoma = soma.calcular(10, 5);
            System.out.println("Resultado da Soma: " + resultadoSoma);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Divisão válida
        try {
            double resultadoDivisao = divisao.calcular(20, 4);
            System.out.println("Resultado da Divisão: " + resultadoDivisao);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        // Divisão por zero
        try {
            double resultadoInvalido = divisao.calcular(10, 0);
            System.out.println("Resultado: " + resultadoInvalido);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}