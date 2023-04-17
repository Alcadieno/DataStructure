public class EstruturaPilha {
    private  int[] array;
    private  int top;

    public EstruturaPilha (int size){
        array = new int[size]; //Metodo EstrturaPilha recebe um parâmetro do tipo int que é o tamanho da pilha
        top = -1;
    }
    public void push (int value){
        if(top == array.length -1){
            throw new RuntimeException("Pilha cheia");  //Adiciona um elemento a pilha  , tratando a exceão pilha cheia

        }
        top++;
        array[top]=value;
    }
    public int pop (){    //Remore um  elemento da pilha , tratanto a exeção pilha vazia                          
        if(isEmpty()){
            throw new RuntimeException("Pilha vazia");

        }
       int value = array[top];
        top--;
        return value;
    }                                   
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Pilha vazia"); //Retorna o elemento do topo da pilha , mas sem removê-lo
        }
        return array[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void getpilhanumbers(){ // mostrar os valores dos arrays armazenados
        for(int i = 0 ;i<=array.length;i++){
            System.out.println(array);

        }

    }
    public void mostrarpilha (EstruturaPilha pilha){ //mostra a pilha
        int[]array1 = pilha.array;
        int top1 =pilha.top;
        System.out.print("Pilha:");
        for (int i = top1;i>=0;i--){
            System.out.print(array1[i]+"");
        }

    }
}
