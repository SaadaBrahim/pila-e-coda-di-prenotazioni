public class Coda{
    private Nodo head;
    private Nodo tail;

    // metodi get/set

        public void setHead(Nodo head){
            this.head = head;
        }
        public void setTail(Nodo tail){
            this.tail = tail;
        }
        public Nodo getHead(){
            return head;
        }
        public Nodo getTail(){
            return tail;
        }

    // metodi cost.

        public Coda(){
            head = null;
            tail = null;
        }
    
    // metodi

        public boolean isEmpty() {
            return (head == null);
        }
        public void enqueue(String valore){
            Nodo nuovo = new Nodo(valore);
            if (isEmpty()){
                head = nuovo;
                tail = nuovo;
            }
            else {
                tail.setSuccessivo(nuovo);
                tail = nuovo;
            }
        }
        public String dequeue() {
            if (isEmpty()) {
            return null; 
            }
            String valoreDaRestituire = head.getValore();
            head = head.getSuccessivo();
            if (head == null) {
            tail = null;
            }
    
            return valoreDaRestituire;
        }
        public String theQ(){
            if (isEmpty()){
                return null;
            }
        return head.getValore();
        }
            
}
    

