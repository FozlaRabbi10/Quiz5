package Main;

import java.util.Scanner;

public class TicketSeller {

	public static int ticket=100;
	public static int calculate(int t) {
	ticket -=t;
	return ticket;
	
	}
			

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		int ticket=100;
		int buyer=0;
		int sold=0;
		while(sold<ticket) {
			
			int t=in.nextInt();
            if(t>4) {
            	
				System.out.println("buyer can buy maximun 4 tickets");
				continue;
				
			}
			else if(t>(ticket-sold)) {
				
				System.out.println("remaining ticket : "+(ticket-sold));
				continue;
				
			}
            
			buyer++;
			sold=sold+t;
			System.out.println("remaining ticket : "+(ticket-sold));
			
		}
		
		System.out.println("total buyer :"+buyer);

	}

}

