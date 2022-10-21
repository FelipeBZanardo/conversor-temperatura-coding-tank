public class TemperaturaCelsius {
    /*Classe responsável por converter um temperatura em graus Celsius
    * para os outros tipos de temperatura conforme cálculos mostrados
    *
    * fórmulas retiras do site:
    * https://www.infoescola.com/fisica/conversao-de-escalas-termometricas/
    * */

    public double converterParaCelsius (double temperatura) {
        return temperatura;
    }

    public double converterParaKelvin (double temperatura) {
        return temperatura + 273;
    }

    public double converterParaFahrenheit (double temperatura) {
        return temperatura * (9.0 / 5) + 32;
    }
}
