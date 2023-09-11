package heap;

public interface HeapInterface {
    public int size();    
    //Επιστρέφει το μέγεθος του σωρού (αριθμό των στοιχείων του) 
    
    public boolean isEmpty();    
    // Επιστρέφει true αν ο σωρός είναι άδειος, false στην αντίθετη περίπτωση
    
    public boolean isFull();    
    // Επιστρέφει true αν ο σωρός είναι γεμάτος, false στην  αντίθετη περίπτωση (υπερχείλιση σωρού)     
    
    public void insert(Object item) throws HeapFullException;    
    // Εισάγει ένα νέο στοιχείο στο σωρό       
    
    public Object remove() throws HeapEmptyException;    
    // Διαγράφει και επιστρέφει το στοιχείο που βρίσκεται στη ρίζα του σωρού 
    
}
