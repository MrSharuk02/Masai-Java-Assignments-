package com.Day4;
import java.util.Scanner;

// Question 2: Ticket Price Calculation

class Ticket{
	private int ticketid;
	private int price;
	private static int availableTickets;
	
	public int calculateTicketCost(int nooftickets) {
		if(availableTickets > 0 && availableTickets >= nooftickets) {
			availableTickets = availableTickets - nooftickets;
			return price*nooftickets;
		}
		else
			return -1;
	}
	
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
		Ticket.availableTickets = availableTickets;
	}
	
	void enterdetails(Scanner sc) {
		System.out.println("Enter no of bookings: ");
		int bookings = sc.nextInt();
		System.out.println("Enter the available tickets: ");
		setAvailableTickets(sc.nextInt());
		for(int i = 0; i < bookings; i++) {
			System.out.println("Enter the ticketId: ");
			setTicketid(sc.nextInt());
			System.out.println("Enter the price: ");
			setPrice(sc.nextInt());
			System.out.println("Enter no of tickets: ");
			int no = sc.nextInt();
			show(no);
			
		}
	}
	void show(int no) {
		System.out.println("Available Tickets: "+ getAvailableTickets());
		System.out.println("Total: " + calculateTicketCost(no));
		System.out.println("Available ticket after booking: " + getAvailableTickets());
	}
}
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ticket t = new Ticket();
		t.enterdetails(sc);
		
		
		
	}

}
