public class Pila{
    private Nodo top;

    // metodi get/set

        public Nodo getTop(){
            return top;
        }
        public void setTop(Nodo top){
            this.top = top;
        }
    
    // metodi cost.

        public Pila(){
            top = null;
        }

    // metodi

        public void push(String valore){
            Nodo nuovo = new Nodo(valore);
            nuovo.setSuccessivo(top);
            top = nuovo;
        }
        public boolean isEmpty() {
            return (top == null);
        }
        public String POP(){
            if (isEmpty()){
                return null;
            }
            String valoreRecuperato = top.getValore();
            top = top.getSuccessivo();

            return valoreRecuperato;
        }
        public String peek(){
            if (isEmpty()){
                return null;
        }
        return top.getValore();
        }
}