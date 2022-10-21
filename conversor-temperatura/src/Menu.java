
public class Menu {

    /* Classe responsável pela interação do programa com o usuário.
     *
     * O método iniciarMenu apresenta um título na tela e incializa a entrada das temperaturas,
     * tipos de temperaturas
     *
     * Também inicializa os cálculos e a saída de dados
     *
     */

    public void iniciarMenu () {
        System.out.println("*****\t\tCONVERSOR DE TEMPERATURAS\t\t*****");

        // incializa a classe EntradaDados e obtem através do usuário a quantidade de temperaturas
        EntradaDados entradaDados = new EntradaDados();
        int quantidadeTemperaturas = entradaDados.obterQuantidadeTemperaturas();

        // obtem o tipo de temperatura de origem e a ser transformada
        char tipoTemperaturaOrigem = entradaDados.obterTipoTemperaturaOrigem();
        char tipoTemperaturaTransformada = entradaDados.obterTipoTemperaturaTransformada();

        // array contendo as temperaturas de origem digitadas pelo usuário
        double[] temperaturasOrigem = entradaDados.obterTemperaturas(quantidadeTemperaturas, tipoTemperaturaOrigem);

        // incializa a classe Calculos e obtem um array com todas as temperaturas convertidas
        Calculos calculos = new Calculos();
        double[] temperaturasTransformadas = calculos.converterTemperaturas(temperaturasOrigem, tipoTemperaturaOrigem, tipoTemperaturaTransformada);

        //calcula a média das temperaturas de origem e transformadas
        double mediaTemperaturaOrigem = calculos.calculaMedia(temperaturasOrigem);
        double mediaTemperaturaTransformada = calculos.calculaMedia(temperaturasTransformadas);

        //incializa a classe SaidaDados
        //mostra a conversão de temepratura
        //mostra as médias
        SaidaDados saidaDados = new SaidaDados();
        saidaDados.mostrarTemperaturas(temperaturasOrigem, tipoTemperaturaOrigem, temperaturasTransformadas, tipoTemperaturaTransformada);
        saidaDados.imprimirMedia(mediaTemperaturaOrigem, tipoTemperaturaOrigem, mediaTemperaturaTransformada, tipoTemperaturaTransformada);
    }
}
