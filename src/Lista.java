import java.util.Arrays;

public class Lista<T> {

    private T[] elementos;
    private int quantidade;

    public Lista(){
        elementos = (T[]) new Object[10];
        quantidade = 0;
    }

    public void adicionar(T elemento){
        //TODO: o que fazer quando lotar ("aumentar" o array)
        elementos[quantidade++]=elemento;
    }

    public void listar(){
        System.out.println(Arrays.toString(
                Arrays.copyOfRange(elementos, 0, quantidade)));
    }

}
