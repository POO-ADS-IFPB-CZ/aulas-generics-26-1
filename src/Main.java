void main() {

    Caixa<Integer> caixaInteiro = new Caixa<>();
    Caixa<String> caixaString = new Caixa<>();
    Caixa<? extends Integer> caixaNumero = new Caixa<>();

    caixaNumero = caixaInteiro;
    caixaNumero = caixaString;

}

<T> void imprimirArray(T[] array){
    System.out.println(Arrays.toString(array));
}

<T extends Comparable<T>> T maior(T[] array){
    return null;
}