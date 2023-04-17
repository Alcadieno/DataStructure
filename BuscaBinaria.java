public class BuscaBinaria {
    private int [] arraynum;
    private int valorprocurado;
    private int meio;
    private int superior;
    private int inferior;

    public void setarraynum (int [] arraynum ,int valorprocurado){
        this.arraynum = arraynum;
        this.valorprocurado = valorprocurado;
        inferior = 0;
        superior = arraynum.length -1 ;
        //Cria o vetor
    }
    public void insertionSort(int [] array){
        int n = array.length;
        for(int i =1; i<n; i++){
            int key = array[i];
            int j = i-1;
            while (j>=0 && array[j] > key){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=key;
            //Ordena o Vetor
        }
    }

    public  int buscabinaria(){
        while (inferior <= superior){
            meio=  (superior+inferior)/2;
            if(arraynum[meio]==valorprocurado){
                return meio;
            }
            if(arraynum[meio]<valorprocurado){
                inferior= meio+1;
            }else{
                superior = meio - 1;
            }
        } //Realiza a busca binaria num vetor ordenado
        return -1;
    }
    public void getarraynum(){
        insertionSort(arraynum);
        if(buscabinaria()==-1){
            System.out.println("Valor "+valorprocurado+" nao encontrado");
        }else{
            System.out.println("Valor  "+valorprocurado+" encontrado");
        }
    }


}
