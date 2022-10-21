public class Calculos {

    /*Classe responsável pelos cálculos:
    *
    * o método converterTemperaturas recebe um array com as temperaturas de origem,
    * o tipo de temperatura de entrada e de saída e retorna um array com as temperaturas convertidas
    *
    * o método calculaMedia recebe um array com as temperaturas e retorna a média das mesmas*/

    public double[] converterTemperaturas
            (double[] temperaturasOrigem, char tipoTemperaturaOrigem, char tipoTemperaturaTransformada){

            double[] temperaturasTransformadas = new double[temperaturasOrigem.length];

            TemperaturaCelsius temperaturaCelsius = new TemperaturaCelsius();
            TemperaturaFahrenheit temperaturaFahrenheit = new TemperaturaFahrenheit();
            TemperaturaKelvin temperaturaKelvin = new TemperaturaKelvin();

            switch (tipoTemperaturaOrigem){
                case 'C': {
                    if (tipoTemperaturaTransformada == 'C'){
                        for (int i = 0; i < temperaturasOrigem.length; i++){
                            temperaturasTransformadas[i] = temperaturasOrigem[i];
                        }
                    } else if (tipoTemperaturaTransformada == 'F') {
                        for (int i = 0; i < temperaturasOrigem.length; i++){
                            temperaturasTransformadas[i] = temperaturaCelsius.converterParaFahrenheit(temperaturasOrigem[i]);
                        }
                    } else if (tipoTemperaturaTransformada == 'K') {
                        for (int i = 0; i < temperaturasOrigem.length; i++){
                            temperaturasTransformadas[i] = temperaturaCelsius.converterParaKelvin(temperaturasOrigem[i]);
                        }
                    }
                    break;
                }
                case 'F': {
                    if (tipoTemperaturaTransformada == 'C'){
                        for (int i = 0; i < temperaturasOrigem.length; i++){
                            temperaturasTransformadas[i] = temperaturaFahrenheit.converterParaCelsius(temperaturasOrigem[i]);
                        }
                    } else if (tipoTemperaturaTransformada == 'F') {
                        for (int i = 0; i < temperaturasOrigem.length; i++){
                            temperaturasTransformadas[i] = temperaturasOrigem[i];
                        }
                    } else if (tipoTemperaturaTransformada == 'K') {
                        for (int i = 0; i < temperaturasOrigem.length; i++){
                            temperaturasTransformadas[i] = temperaturaFahrenheit.converterParaKelvin(temperaturasOrigem[i]);
                        }
                    }
                    break;
                }
                case 'K': {
                    if (tipoTemperaturaTransformada == 'C'){
                        for (int i = 0; i < temperaturasOrigem.length; i++){
                            temperaturasTransformadas[i] = temperaturaKelvin.converterParaCelsius(temperaturasOrigem[i]);
                        }
                    } else if (tipoTemperaturaTransformada == 'F') {
                        for (int i = 0; i < temperaturasOrigem.length; i++){
                            temperaturasTransformadas[i] = temperaturaKelvin.converterParaFahrenheit(temperaturasOrigem[i]);
                        }
                    } else if (tipoTemperaturaTransformada == 'K') {
                        for (int i = 0; i < temperaturasOrigem.length; i++){
                            temperaturasTransformadas[i] = temperaturasOrigem[i];
                        }
                    }
                }
                break;
                default:
                    System.out.println("Essa temperatura não existe.");

            }

            return temperaturasTransformadas;
    }

    public double calculaMedia (double[] temperaturas) {
        double soma = 0;
        for (double temperatura : temperaturas){
            soma += temperatura;
        }

        return soma / temperaturas.length;
    }
}
