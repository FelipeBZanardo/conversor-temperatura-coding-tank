public class SaidaDados {

    // Classe responsável por mostrar ao usuário a conversão de temperatura e as médias

    public void mostrarTemperaturas (double[] temperaturasOrigem, char tipoTemperaturaOrigem,
                                     double[] temperaturasTransformadas, char tipoTemperaturaTransformada){

        System.out.println("\n*****\t\tRESULTADOS DA CONVERSÃO\t\t*****\n\n");

        for (int i = 0; i < temperaturasOrigem.length; i++ ){
            System.out.printf("%.1f °%s corresponde a %.1f °%s\n",
                    temperaturasOrigem[i], tipoTemperaturaOrigem ,
                    temperaturasTransformadas[i], tipoTemperaturaTransformada);
        }

        System.out.println();       //linha de espaço para melhor observação na tela

    }

    public void imprimirMedia (double mediaTemperaturasOrigem, char tipoTemperaturaOrigem,
                               double mediaTemperaturasTransformadas, char tipoTemperaturaTransformada){

        System.out.printf("Média temperaturas de origem: %.1f °%s \n",mediaTemperaturasOrigem, tipoTemperaturaOrigem);
        System.out.printf("Média temperaturas transformadas: %.1f °%s \n",mediaTemperaturasTransformadas, tipoTemperaturaTransformada);
    }
}
