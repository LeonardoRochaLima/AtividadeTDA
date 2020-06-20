package com.company;


public interface Pilha<T> extends Colecao<T> {
    /**
     * O método a seguir faz a inserção de um objeto no topo da lista de elementos.
     * @param obj elemento a ser empilhado no final da lista
     */
    void empilhar(T obj);

    /**
     * O método a seguir faz a remoção de um objeto do topo da lita de elementos.
     * @return retorna o elemento que foi desempilhado e sua posicao.
     */
    T desempilhar();

    /**
     * O método a seguir faz a verificação de qual elemento está no topo da lista.
     * @return retorna qual é o elemento que está no topo da lista e qual sua posicao.
     */
    T olharTopo();
}
