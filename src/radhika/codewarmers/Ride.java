/*
ID:rxk16201	
PROG: ride
LANG: JAVA
*/
package radhika.codewarmers;
import java.util.*;
import java.io.*;

public class Ride {
	public static void main(String[] args) throws Exception {
		 Scanner scnr = new Scanner(new File("ride.in"));
		 PrintWriter output = new PrintWriter("ride.out");
		 int oldmod=0,count=0;
		 while (scnr.hasNextLine()) {
             String name = scnr.nextLine();
             if(count==0){
             oldmod=getModeOfName(name);
             } else {
            	 if(oldmod==getModeOfName(name)){
            		 output.println("GO");
            	 } else {
            		 output.println("STAY");
            	 }
             }
		 }
         scnr.close();
         output.close();
	}
	
	public static int getModeOfName(String name){
		int product=1;
		for (int i = 0; i < name.length(); ++i) {
			   product*=name.charAt(i)-'A'+1;
			}
		    return product%47;
			 	}
}