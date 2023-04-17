public class MainPilha {
    public static void main(String[] args) {
        EstruturaPilha pilha1 = new EstruturaPilha(5);
        pilha1.push(1);
        pilha1.push(2);
        pilha1.push(5);
        pilha1.push(2);
        pilha1.push(4);

        pilha1.pop();
        pilha1.push(0);

        pilha1.mostrarpilha(pilha1);


    }
}
