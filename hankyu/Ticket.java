package hankyu;

public class Ticket {
    protected int price;
    protected String entered_station;
    //constracta
    Ticket(int price){
        this.price = price;
        this.entered_station = null;
    }
    //stamping at the station where entered.
    public void stamp_at(String station){
        this.entered_station = station;
    }
}
