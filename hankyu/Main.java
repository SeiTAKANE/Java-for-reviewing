package hankyu;

public class Main {
    public static void main(String[] args){
        //Buying 150 Yens ticket in Umeda and enter the gate, exit the gate from Mikuni.
        Gate umeda = new Gate("umeda");
        Gate mikuni = new Gate("mikuni");
        Ticket ticket = new Ticket(150);
        umeda.enter(ticket);
        System.out.println(mikuni.exit(ticket));//false

        //Buying 190 Yens ticket in Umeda and enter the gate, exit the gate from Mikuni.
        Ticket ticket_2 = new Ticket(190);
        umeda.enter(ticket_2);
        System.out.println(mikuni.exit(ticket_2));//true
    }
}
