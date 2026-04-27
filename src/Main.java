void main() {

    Caixa<String> caixaString = new Caixa<>();
    Caixa<Integer> caixaInteiro = new Caixa<>();

    //Casting tardio
    caixaString.setObjeto("João");
    caixaInteiro.setObjeto(123);

}