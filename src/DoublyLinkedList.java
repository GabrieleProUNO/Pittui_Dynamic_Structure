public class DoublyLinkedList {
    
    private Node head, tail;

    public DoublyLinkedList() {
        this.head = this.tail = null;
    }

    /**
     * Aggiunge un nodo alla fine della lista
     * @param newNode nuovo nodo da aggiungere
     */
    public void add(Node newNode) {
        if (head == null && tail == null) {
            head = tail = newNode;
        }
        else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    // wrapper (involucro)
    private Node getRec(Node cursor, int index) {

        if (index == 0)
            return cursor;

        return getRec(cursor.getNext(), index-1);
    }

    /**
     * Ottiene l'elemento nella posizione specificata
     * @param index posizione da leggere
     * @return l'elemento identificato dall'indice
     * @throws IndexOutOfBoundsException
     */

    public Node get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException("Indice non valido");

        return getRec(head, index);
    }

    // ------------ INSERISCI IL TUO CODICE QUI ----------------

   
    public void print(boolean forward) {
        if (forward) {

            Node cursor = head;
            while (cursor != null) {
                System.out.print(cursor + " ");
                cursor = cursor.getNext();
            }
        }
        else {
            Node cursor = tail;
            while (cursor != null) {
                System.out.print(cursor + " ");
                cursor = cursor.getPrev();

            }


        }
        System.out.println();



    }

    public int size() {
        
        int count = 0;
        Node cursor = head;
        while (cursor != null) {
            count++;
            cursor = cursor.getNext();
        }
        return count;

        
    }

    public void merge(DoublyLinkedList otherList) {

        if (otherList.head == null)
            return;

        if (this.head == null) {
            this.head = otherList.head;


            this.tail = otherList.tail;
        }
        else {
            this.tail.setNext(otherList.head);
            otherList.head.setPrev(this.tail);
            this.tail = otherList.tail;



        }

    }

    public String slice(int start, int end) {

        Node cursor = head;
        int count = 0;
        while (count != end) {
            if (count == start) {
                
                
                
            }

            
        }
        
        return null;
    }

    // Sono ricorsivo! (no non è vero)
    public boolean palindrome() {

        int left = 0;
        int right = size() - 1;


        while (left < right) {

            Node leftNode = get(left);
            Node rightNode = get(right);

            if (leftNode.getLetter() != rightNode.getLetter()) {
                return false;

            }

            left++;
            right--;
        }

        return true;




       
    }

    public void shift(int amount) {

        if (head == null || tail == null)
            return;


        int listSize = size();
        amount = amount % listSize;


        if (amount < 0){
            amount += listSize;
        }
            

        if (amount == 0){
            return;
        }


        Node newTail = get(listSize - amount - 1);
        Node newHead = newTail.getNext();

        newTail.setNext(null);
        newHead.setPrev(null);

        tail.setNext(head);
        head.setPrev(tail);

        head = newHead;
        tail = newTail;


    }

    public void trim(int newSize) {

    }
}
