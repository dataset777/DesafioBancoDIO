public interface IConta {

    /* Todos os métodos de uma interfaace são naturalmente "public",
       logo, este identificador é retirado, pois se tornaria redundante.
     */

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();

}
