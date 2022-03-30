
import java.util.*;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int RNumb = 0;
		int FirstTwo=0;
		int LastTwo=0;
		int Total=0;
		int GrantTotal=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		RNumb = sc.nextInt();
		
		FirstTwo = RNumb/100;
		LastTwo = RNumb%100;
		
		Total = FirstTwo+LastTwo;
		
		GrantTotal = Total * Total;
		
		if(GrantTotal == RNumb)
		{
			System.out.println("Ramanujan Number");
		}
		else
		{
			System.out.println("Not Ramanujan Number");
		}
		
	    
		
	}

}
