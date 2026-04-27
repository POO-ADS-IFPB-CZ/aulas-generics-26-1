void main() {

    Caixa<String> caixaString = new Caixa<>();
    Caixa<Integer> caixaInteiro = new Caixa<>();

}

<T> void imprimirArray(T[] array){
    System.out.println(Arrays.toString(array));
}

<T extends Comparable<T>> T maior(T[] array){
    return null;
}