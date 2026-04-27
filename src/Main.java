void main() {

    Caixa caixa = new Caixa();
    caixa.setObjeto("João");
    //Não deixe eu fazer isso
    caixa.setObjeto(123);
    System.out.println(caixa.getObjeto());

    CaixaString caixaString = new CaixaString();
    caixaString.setObjeto("Maria");
    caixaString.setObjeto(123);

}