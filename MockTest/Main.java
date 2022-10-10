package MockTest;
import java.util.Scanner;
 class ticket {
     public int getTicketid() {
        return ticketid;
    }
    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public static int getAvailableTickets() {
        return availableTickets;
    }
    public static void setAvailableTickets(int availableTickets) {
        ticket.availableTickets = availableTickets;
        if(ticket.availableTickets<1)
        {
            System.out.println("not allowed");
        }
    }
    int ticketid;
     int price;
    static int availableTickets;
    public int CaculateTicketCost(int nooftickets)
    {
        setAvailableTickets(availableTickets-nooftickets);
        return(nooftickets*getPrice());
    }
}
public class Main{
    public static void main(String[] args) {
        ticket obj=new ticket();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of bookings:");
        int n=sc.nextInt();
    
        System.out.println("enter available tickets:");
        obj.availableTickets=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        System.out.println("enter ticketID:");
        obj.ticketid=sc.nextInt();
        System.out.println("enter the price:");
        obj.price=sc.nextInt();
        System.out.println("enter the no of tickets:");
        int no=sc.nextInt();
        System.out.println("available tickets:"+obj.getAvailableTickets() );
        System.out.println("amount:"+obj.CaculateTicketCost(no) );
        System.out.println("available tickets after booking:"+obj.getAvailableTickets());
    }
    }
}