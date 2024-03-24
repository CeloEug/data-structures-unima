class no {
    int data;
    Node next;

    no(int data) {
        this.data = data;
        this.next = null;
    }
}

class lista {
    no fim;

    lista() {
        this.fim = null;
    }

    void append(int data) {
        no novoNo = new no(data);
        if (fim == null) {
            fim = novoNo;
            return;
        }
        no ultmoNo = fim;
        while (ultmoNo.next != null) {
            ultmoNo = ultmoNo.next;
        }
        ultmoNo.next = novoNo;
    }

    void remove(int n) {
        if (fim == null) return;

        no atual = fim;
        for (int i = 0; i < n; i++) {
            if (atual == null) return;
            atual = atual.next;
        }

        fim = atual;
    }

    void display() {
        no atual = fim;
        while (atual != null) {
            System.out.print(atual.data + " -> ");
            atual = atual.next;
        }
        System.out.println("null");
    }
}

public class ListaEncadeada {
    public static void main(String[] args) {
        lista ll = new lista();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

        System.out.println("Lista original:");
        ll.display();

        int n = 3;
        ll.remove(n);

        System.out.println("Os nós de 0 à " + n + " foram removidos:");
        ll.display();
    }
}
