import java.util.ArrayList;

public class NumerosPrimos {
    private int busca;
    private ArrayList<Integer>  arrayprimos =new ArrayList<>();
    //Objeto do tipo Arraylist instanciado para guardar numeros primos

    public void primos(){
        for(int i = 1; i<=1000; i++){
            if (isPrime(i)){
               arrayprimos.add(i);
                //Percorre de  1 a 1000 e utiliza o metodo IsPrime para saber se o numero é primo
            }
        }
        System.out.println(arrayprimos); // Mostra o ArrayList contendo numeros Primos
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n);i++){
            if(n % i ==0){
                return false;
            }
        }
        return true; // Metodo que verifica se o numero eh Primo
    }
    public int buscabinaria (int busca){
        this.busca  = busca;
        int inferior = 0;
        int superior = arrayprimos.size() - 1; //Em array utilizamos array.lenght

        while(inferior <= superior){
            int meio = (inferior+superior)/2;
            if(arrayprimos.get(meio) == busca){ //Diferente  do array, devemos utilizar o metodo get do arraylist  e passar o parametro  meio
                return meio;

            } else if (arrayprimos.get(meio)<busca){
                inferior = meio+1;

            }else{
                superior = meio-1;

            }
        }
        return -1;// Algoritmo de busca binaria implementado em ArrayList

    }
    public void getprime(){
        if(buscabinaria(busca)==-1){
            System.out.println("Valor "+busca+"  NAO EH PRIMO");

        }else{
            System.out.println("Valor "+busca+"  EH PRIMO");
        }
    }// Verifica se o numero buscado pertece ao ArrayList de numeros  Primos
} 
//não tratei exceções :z !
