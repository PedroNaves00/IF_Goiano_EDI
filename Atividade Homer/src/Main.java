public class Main {
    public static void main(String[] args) {
        // Criando os Objetos
        Object Homer = new Object();
        Object Marge = new Object();
        Object Bart = new Object();
        Object Moll = new Object();
        Object Lisa = new Object();
        Object Maggie = new Object();
        Object NedFlander = new Object();
        Object SrBurns = new Object();

        ListaDupla Lista = new ListaDupla();
        Lista.Adiciona(Homer);
        Lista.Adiciona(Marge);
        System.out.println(Lista.Imprimir());


        Lista.EsvaziaLista();
        System.out.println(Lista.Imprimir());


        Lista.Adiciona(0, Bart);
        Lista.Adiciona(1, Moll);
        System.out.println(Lista.Imprimir());


        Lista.EsvaziaLista();


        Lista.Adiciona(Homer);
        Lista.Adiciona(Bart);
        System.out.println(Lista.Imprimir());
        System.out.println(Lista.tamanho());


        Lista.EsvaziaLista();
        System.out.println(Lista.Imprimir());


        Lista.Adiciona(Homer);
        Lista.Adiciona(Maggie);
        Lista.Adiciona(0, Bart);
        Lista.Adiciona(1, Marge);
        System.out.println(Lista.Imprimir());
        System.out.println(Lista.Contem(Lisa));


        System.out.println(Lista.Contem(Marge));
        System.out.println(Lista.Contem(Homer));
        System.out.println(Lista.Contem(Bart));
        System.out.println(Lista.Contem(Maggie));
        System.out.println(Lista.Imprimir());
        System.out.println(Lista.tamanho());

        Lista.EsvaziaLista();

        Lista.AdicionaNoComeco(Homer);
        Lista.AdicionaNoComeco(Bart);
        Lista.Adiciona(Marge);
        Lista.Adiciona(1, Maggie);
        Lista.AdicionaNoComeco(NedFlander);
        Lista.Adiciona(SrBurns);

        Lista.RemovedoFim();
        System.out.println(Lista.Imprimir());

        Lista.RemovedoComeco();
        System.out.println(Lista.tamanho());

        System.out.println(Lista.Contem(Marge));
        System.out.println(Lista.Contem(Homer));
        System.out.println(Lista.Contem(Bart));
        System.out.println(Lista.Contem(Maggie));
        System.out.println(Lista.tamanho());

        Lista.RemovedoComeco();
        System.out.println(Lista.Imprimir());
        System.out.println(Lista.tamanho());

        System.out.println(Lista.Contem(Marge));
        System.out.println(Lista.Contem(Homer));
        System.out.println(Lista.Contem(Bart));
        System.out.println(Lista.Contem(Maggie));
        System.out.println(Lista.tamanho());

        Lista.EsvaziaLista();
        System.out.println(Lista.Imprimir());


    }
}