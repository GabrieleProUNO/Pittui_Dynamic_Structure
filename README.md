Per iniziare

Questo è un template per il test.

[!TIP] Clona questo repository prima di iniziare.

Istruzioni

La struttura è una lista doppiamente collegata, il che significa che ogni nodo ha un riferimento sia al nodo di sinistra sia a quello di destra.
La classe Node è già fornita.
Per la classe DoublyLinkedList, i metodi add e get sono implementati, mentre tutti gli altri metodi sono solo prototipi vuoti.

Consegna

[!important] Devi inviare il link a un repository GitHub alla fine di questo test!

Clona il repository, rendilo pubblico e ricordati di fare commit e push del tuo lavoro prima di lasciare.

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Definire in un progetto Java tutte le classi e i metodi necessari per implementare la struttura spiegata di seguito. Il progetto dovrebbe avere un nome come “verifica_cognome_gennaio”.

La struttura è un elenco a doppio collegamento, il che significa che ogni nodo ha un riferimento sia al nodo a sinistra che a quello a destra. La classe Node è realizzata così:

classe pubblica Node {
    dati char privati;
    Nodo privato prev;
    Nodo privato successivo;
}

La classe DoublyLinkedList ha 2 riferimenti Node, uno per la testa (primo nodo nell'elenco), uno per la coda (ultimo nodo nell'elenco). Ricordatevi di implementare, ove necessario, i metodi costruttori, getter e setter. 
Importante: NON esiste un nodo successivo per la coda, NON esiste un nodo precedente per la testa!

È necessario implementare questi metodi:

- print(boolean forward), stampa ogni singolo nodo in una direzione specifica: partendo da head se il parametro è vero (il che significa che la scansione viene eseguita in avanti), partendo da tail se il parametro è falso (il che significa che la scansione viene eseguita all'indietro)

- int size(), conta quanti nodi sono presenti nell'elenco, indipendentemente dalla direzione

- merge(DoublyLinkedList otherList), riceve un altro elenco doppiamente collegato come parametro di input e lo aggiunge alla fine dell'elenco corrente

- String slice(int start, int end), crea una stringa con una "sottolista" dei caratteri aventi gli indici specificati, a partire da "start" (incluso) e terminando con "end" (escluso). Conteggio degli indici da 0. Passando lo stesso indice si ottiene una stringa vuota.
Esempio:
ABCDE -> (fetta 0,3) -> "ABC"
ABCD -> (fetta 2,3) -> "C"
ABC -> (fetta 1,1) -> ""
ABCD -> (fetta 3,1) -> "DC"

[punto extra se fatto con la ricorsione!]
- boolean palindrome(), controlla se i dati memorizzati nei nodi formano una stringa palindroma, il che significa che i nodi sono simmetrici (considerando solo il valore al loro interno!)

- shift(int amount), sposta molti elementi nell'elenco (pari al parametro "amount") dall'ultima posizione alla prima posizione
Esempio:
ABCDE -> (viene applicato 1 turno) -> EABCD
ABCDE -> (vengono applicati 3 turni) -> CDEAB

- trim(int newSize), imposta la nuova lunghezza dell'elenco sul parametro di input:
a. se newSize è inferiore alla lunghezza effettiva, l'elenco viene tagliato rendendo la sua dimensione uguale ad esso, rimuovendo alcuni nodi
b. se newSize è maggiore della lunghezza effettiva, vengono aggiunti nuovi nodi alla coda per renderne uguale la dimensione. Ogni nodo aggiunto deve avere un contenuto specificato, che sarà costituito dai successivi caratteri ASCII a partire dalla coda
Esempio:
ABCDEFG -> (newSize è 4) -> ABCD (l'elenco è stato tagliato, ora la sua lunghezza è 4) 
FWIQ -> (newSize è 7) -> FWIQRST (l'elenco è ora composto da 7 nodi, quelli aggiunti seguono la regola ASCII)

Ricordatevi di aggiornare i riferimenti testa e coda ove necessario.