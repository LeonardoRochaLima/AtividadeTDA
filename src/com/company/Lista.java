package com.company;

import java.util.Optional;


public interface Lista<T> extends Colecao<T> {
    /**
     * O método a seguir faz o acesso ao indíce da lista solicitado
     * @param indice inidice a ser verificado
     * @return o valor existente na lista no indice.
     */
    T acessar(int indice);

    /**
     * O método a seguir faz a insercao de um elemento na lista
     * mais especificamente no indice informado.
     * @param indice indice onde o objeto será inserido
     * @param obj objeto a ser inserido
     */
    void inserir(int indice, T obj);

    /**
     * O método a seguir faz a remoção do indice solicitado
     * @param indice indice solicitado a ser removido
     * @return o indice que foi removido
     */
    T remover(int indice);

    /**
     * O método a seguir faz a pesquisa de forma sequencial
     * do objeto na lista
     * @param obj objeto a ser pesquisado
     * @return se exitir o objeto e seu indice são retornados, se não existir
     * retorna informação de não existencia.
     */
    Optional<Integer> pesquisar(T obj);

    /**
     * O método a seguir verifica se determinado objeto existe na lista
     * @param obj objeto a ser pesquisado
     * @return verdadeiro ou falso
     */
    boolean existe(T obj);
}
