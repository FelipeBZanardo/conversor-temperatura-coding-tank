public class ExceptionTipoInvalido extends Exception{

    /* Classe customizada de Exception
     *
     * Quando a entrada por parte do usuário é inválida gera uma Exception desse tipo.
     * Foi apenas utilizada na criação do método continuarConversao quando o usuário
     * digita algo diferente de S (sim) e N (não).
     *
     * Erros de digitação para tipos diferentes de dados foi utilizada a InputMismatchException.
     */

    public ExceptionTipoInvalido(String message) {
        super(message);
    }
}
