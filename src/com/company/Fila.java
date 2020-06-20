package com.company;


public interface Fila<T> extends Colecao<T> {

    /**
     * O método a seguir faz a inserção de um elemento no final da lista.
     * Levando em consideração as características de uma fila (FIFO).
     * @param obj objeto a ser inserido no final da fila
     */
    void enfileirar(T obj);

    /**
     * O método a seguir faz a remoção de um elemento no final da lista.
     * Levando em consideração as caracterísitica de uma fila (FIFO).
     * @return o elemento que foi desenfileirado e sua posicao
     */
    T desenfileirar();

    /**
     * O método a seguir faz a verificação de qual elemento se encontra no começo
     * da lista.
     * Levando em consideração as características de uma fila.
     * @return retorna o primeiro elemento que foi inserido à lista.
     */
    T olharPrimeiro();
}
