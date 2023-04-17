public class EstruturaPilha {
    private  int[] array;
    private  int top;

    public EstruturaPilha (int size){
        array = new int[size];
        top = -1;
    }
    public void push (int value){
        if(top == array.length -1){
            throw new RuntimeException("Pilha cheia");

        }
        top++;
        array[top]=value;
    }
    public int pop (){
        if(isEmpty()){
            throw new RuntimeException("Pilha vazia");

        }
       int value = array[top];
        top--;
        return value;
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Pilha vazia");
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
    public void mostrarpilha (EstruturaPilha pilha){
        int[]array1 = pilha.array;
        int top1 =pilha.top;
        System.out.print("Pilha:");
        for (int i = top1;i>=0;i--){
            System.out.print(array1[i]+"");
        }

    }
}
