public class TemperaturaFahrenheit {

    /*Classe responsável por converter um temperatura em graus Fahrenheit
     * para os outros tipos de temperatura conforme cálculos mostrados
     *
     * fórmulas retiras do site:
     * https://www.infoescola.com/fisica/conversao-de-escalas-termometricas/
     * */

    public double converterParaCelsius (double temperatura) {
        return (temperatura - 32) / 1.8;
    }

    public double converterParaKelvin (double temperatura) {
        return (temperatura - 32) * (5.0 / 9) + 273;
    }

    public double converterParaFahrenheit (double temperatura) {
        return temperatura;
    }
}
