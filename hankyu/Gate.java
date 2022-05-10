package hankyu;
import java.util.*;

public class Gate {
   //the lists of stations and fees.
   private ArrayList<String> stations = new ArrayList<String>(Arrays.asList("umeda","juso","mikuni"));
   private ArrayList<Integer> fees = new ArrayList<Integer>(Arrays.asList(0,150,190));
   private String station;
    //constracta
    Gate(String station){
        this.station = station;
    }
    //the method when entering a gate.
    public void enter(Ticket ticket){
        ticket.stamp_at(this.station);
    }
    //the method when exiting a gate.
    public boolean exit(Ticket ticket){
        return calculate(ticket);
    }
    //calculation whether can  exit from gate or not
    public boolean calculate(Ticket ticket){
        int price = ticket.price;
        String entered_station = ticket.entered_station;
        int index_enter = stations.indexOf(entered_station);
        int index_exit = stations.indexOf(this.station);
        int fee = fees.get(index_exit - index_enter);
            if(price >= fee){
                return true;
                }else{
                return false;
                    }
    }
}
