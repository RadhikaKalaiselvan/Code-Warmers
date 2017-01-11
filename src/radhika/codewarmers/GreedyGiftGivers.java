package radhika.codewarmers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
public class GreedyGiftGivers {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		HashMap<String,Integer> gifts=new HashMap<String,Integer>();
		 Scanner scnr = new Scanner(new File("gift1.in"));
		 //PrintWriter output = new PrintWriter("gift1.out");
		//Scanner scnr=new Scanner(System.in);
		 int countLine=0,NP=0;
		
		 while (scnr.hasNextLine()) {
		
			 if(countLine==0){
				 NP=Integer.parseInt(scnr.nextLine());
				 
			 }else{
             String name=scnr.nextLine();
            
			 gifts.put(name,0);
			 System.out.println("name "+name);
			 }
			 countLine++;
			 if(countLine>NP) {
				 break;
			 }
		 }
		 while(scnr.hasNextLine()){
		 String gifterName=scnr.nextLine();
		 String numbers=scnr.nextLine();
		 String[] strs = numbers.trim().split("\\s+");
	     int amount=Integer.parseInt(strs[0]);
		 int friends=Integer.parseInt(strs[1]);
		 int countfriends=0;
		 int eachShare=(friends!=0?amount/friends:0);
		 int remainingAmount=(friends!=0?amount%friends:0);
		 System.out.println("Each share "+eachShare+" remaining amount "+remainingAmount);
		if(amount!=0){
		 gifts.put(gifterName, gifts.get(gifterName)-amount);
		}
		 while( countfriends<friends){
			 System.out.println(" count "+countfriends+" friends"+friends);
			 String friendName=scnr.nextLine();
			 countfriends++;
			 if(eachShare!=0){
				 System.out.println("Friend Name "+friendName);
				 gifts.put(friendName, gifts.get(friendName)+eachShare);
			 }
		 }
		 if(remainingAmount!=0){
			 gifts.put(gifterName, gifts.get(gifterName)+remainingAmount);
		 }
		 }
         scnr.close();
         for (HashMap.Entry<String, Integer> entry : gifts.entrySet()) {
        	    String frndName = entry.getKey();
        	    Integer bal = entry.getValue();
        	    System.out.println(frndName+" "+bal);
        	    // ...
        	}
                // output.close();
	}
	}

