public class Nodo{
    private String valore;
    private Nodo successivo;

    // metodi get/set

        public String getValore(){
            return valore;
        }
        public Nodo getSuccessivo(){
            return successivo;
        }
        public void setValore(String valore){
            this.valore = valore;
        }
        public void setSuccessivo(Nodo successivo){
            this.successivo = successivo;
        }

    // metodi cost.

        public Nodo() {
        }
        public Nodo(String valore){
            this.valore = valore;
            successivo = null;
        }

}