public class Main {
    public static void main(String[] args) {
        
        System.out.println("TEST PILA");
        Pila miaPila = new Pila();
        
        miaPila.push("documento 1");
        miaPila.push("documento 2");
        miaPila.push("documento 3");
        
        System.out.println("in cima (peek): " + miaPila.peek());
        System.out.println("estraggo (pop): " + miaPila.pop());
        System.out.println("estraggo (pop): " + miaPila.pop());
        System.out.println("la pila e vuota? " + miaPila.isEmpty());

        System.out.println("\n TEST CODA");
        
        Coda miaCoda = new Coda();
        
        miaCoda.enqueue("persona A");
        miaCoda.enqueue("persona B");
        miaCoda.enqueue("persona C");
        
        System.out.println("primo in fila (theQ): " + miaCoda.theQ());
        System.out.println("servo (dequeue): " + miaCoda.dequeue());
        System.out.println("servo (dequeue): " + miaCoda.dequeue());
        System.out.println("la coda e vuota? " + miaCoda.isEmpty());
    }
}
