public class BuscaSequencial {
    private int [] arraynum ;
    private int valorprocurado;

    public int busca(int[] arraynum ,int valorprocurado){
        for(int i=0 ; i<arraynum.length;i++){
            if(arraynum[i]==valorprocurado){
                return i; // retorna o valor encontrado

            }
        }
        return -1 ; //retorna -1 caso não encontre
    }
    public void  setarray(int []arraynum, int valorprocurado){
        this.arraynum = arraynum;
        this.valorprocurado = valorprocurado;
        // criar o array
    }
    public void getarraynum(){
        if(busca(arraynum,valorprocurado)==-1){
            System.out.println("Valor " +valorprocurado+ " nao encontrado");

        }else {
            System.out.println("Valor " +valorprocurado+ " encontrado");
        }
    }// verificar se o valor pertence ao array
}
