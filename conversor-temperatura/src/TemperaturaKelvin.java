public class TemperaturaKelvin {

    /*Classe responsável por converter um temperatura em graus Kelvin
     * para os outros tipos de temperatura conforme cálculos mostrados
     *
     * fórmulas retiras do site:
     * https://www.infoescola.com/fisica/conversao-de-escalas-termometricas/
     * */

    public double converterParaCelsius (double temperatura) {
        return temperatura - 273;
    }

    public double converterParaKelvin (double temperatura) {
        return temperatura;
    }

    public double converterParaFahrenheit (double temperatura) {
        return (temperatura - 273) * (9.0 / 5) + 32;
    }
}
