void main() {

    Lista<Integer> minhaLista = new Lista<>();
    minhaLista.adicionar(1);
    minhaLista.adicionar(4);
    minhaLista.adicionar(6);
    minhaLista.adicionar(1);
    minhaLista.adicionar(4);
    minhaLista.adicionar(6);
    minhaLista.adicionar(1);
    minhaLista.adicionar(4);
    minhaLista.adicionar(6);
    minhaLista.listar();

}

<T> void imprimirArray(T[] array){
    System.out.println(Arrays.toString(array));
}

<T extends Comparable<T>> T maior(T[] array){
    return null;
}