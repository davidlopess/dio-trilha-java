public class Contador {

    public static void main(String[] args) {
        try {
            if (args.length < 1) {
                throw new IllegalArgumentException("Por favor, forneça dois números inteiros como parâmetros.");
            }

            int primeiroParametro = Integer.parseInt(args[1]);
            int segundoParametro = Integer.parseInt(args[5]);

            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, insira apenas números inteiros como parâmetros.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }

    public static void contar(int primeiro, int segundo) throws ParametrosInvalidosException {
        if (primeiro > segundo) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int i = 1; i <= (segundo - primeiro); i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

// Classe para exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}