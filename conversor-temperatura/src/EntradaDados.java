import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDados {

    /* Classe responsável por receber os dados do usuário.
     *
     * O método obterQuantidadeTemperaturas pergunta ao usuário a quantidade
     * de temperaturas que deseja converter
     *
     *
     * O método obterTemperaturas recebe como parâmetro a quantidade recebida pelo método anterior,
     * obtém as temperaturas digitadas pelo usuário e retorna um array de Strings com as mesmas.
     *
     * Os métodos obterTipoTemperaturaOrigem/Transformada recebe a resposta do usuário
     * e retorna um char com o tipo
     */

    public int obterQuantidadeTemperaturas (){
        boolean erro = false;                   //variável de controle do while
        int quantidadeTemperaturas = 0;

        do {
            try {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite a quantidade de temperaturas para conversão: ");
                quantidadeTemperaturas = scanner.nextInt();
                erro = true;
            } catch (InputMismatchException exception){
                System.err.println("Tipo incompatível de dado");
                System.out.println("Por favor digite apenas números");
            }
        }while (!erro);

        return quantidadeTemperaturas;
    }

    public char obterTipoTemperaturaOrigem (){

        boolean erro = false;                   //variável de controle do while
        char tipoTemperaturaOrigem = 'C';

        do {
            try {
                Scanner scanner = new Scanner(System.in);

                System.out.println("\nC - Celsius\t F - Fahrenheit\t K - Kelvin");
                System.out.print("Digite o tipo da temperatura de Origem [C,F,K]: ");
                tipoTemperaturaOrigem = scanner.next().toUpperCase().charAt(0);
                if (tipoTemperaturaOrigem != 'C' && tipoTemperaturaOrigem != 'F' && tipoTemperaturaOrigem != 'K'){
                    throw new ExceptionTipoInvalido("\nDigite apenas C (Celsius), F (Fahrenheit) ou K(Kelvin)");
                }
                erro = true;
            } catch (ExceptionTipoInvalido exceptionTipoInvalido){
                    System.out.println(exceptionTipoInvalido.getMessage());
            }
        }while (!erro);

        return tipoTemperaturaOrigem;

    }

    public char obterTipoTemperaturaTransformada (){

        boolean erro = false;                   //variável de controle do while
        char tipoTemperaturaTransformada = 'C';

        do {
            try {
                Scanner scanner = new Scanner(System.in);

                System.out.println("\nC - Celsius\t F - Fahrenheit\t K - Kelvin");
                System.out.print("Digite o tipo da temperatura a ser Transformada [C,F,K]: ");
                tipoTemperaturaTransformada = scanner.next().toUpperCase().charAt(0);
                if (tipoTemperaturaTransformada != 'C' && tipoTemperaturaTransformada != 'F' && tipoTemperaturaTransformada != 'K'){
                    throw new ExceptionTipoInvalido("\nDigite apenas C (Celsius), F (Fahrenheit) ou K(Kelvin)");
                }
                erro = true;
            } catch (ExceptionTipoInvalido exceptionTipoInvalido){
                System.out.println(exceptionTipoInvalido.getMessage());
            }
        }while (!erro);

        return tipoTemperaturaTransformada;

    }

    public double[] obterTemperaturas (int quantidadeTemperaturas, char tipoTemperatura){
        double[] temperaturas = new double[quantidadeTemperaturas];

        for (int i = 0; i < temperaturas.length; i++){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Temperatura " + (i + 1) + " °" + tipoTemperatura + ": ");
                temperaturas[i] = scanner.nextDouble();
            } catch (InputMismatchException exception) {
                System.err.println("Tipo incompatível de dado");
                System.out.println("Por favor digite apenas números. Aceita números reais (com parte decimal)");
                i--;        //continua pedindo a mesma temperatura até o usuário digitar corretamente
            }
        }

        System.out.println("\nTemperaturas registradas com sucesso!");
        return temperaturas;

    }
}
