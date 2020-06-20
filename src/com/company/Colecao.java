package com.company;

public interface Colecao<T> {
    /**
     * O método a seguir faz a verificacao de quantos elementos
     * existem na colecao.
     * @return retorna a quantidade em inteiro, referente ao tamanho da lista de elementos.
     */
    int qtdeElems();

    /**
     * O método a seguir verifica se a lista apresentada é vazia.
     * @return verdadeiro ou falso, dependendo da condicao.
     */
    default boolean isVazia() {
        return qtdeElems() == 0;
    }
}
