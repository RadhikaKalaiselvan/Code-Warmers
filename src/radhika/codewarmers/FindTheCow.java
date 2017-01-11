package radhika.codewarmers;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindTheCow {
	public static void main(String[] args) throws Exception {
//String grass=")((()())())";
int i=0;
int totalPossibleLegPatterns=0;
/*Scanner input = new Scanner(new File("cowfind.in"));
PrintWriter output = new PrintWriter("cowfind.out");
String grass = input.nextLine();
*/
String grass="(()))()()((()())";
//System.out.println("pattern "+grass);
while(i<grass.length()){
	//System.out.println("Processing position i"+i);
	int countOfCBackLegPattern=findContinuousPattern(i,"(",grass);
	int j=0;
	if(countOfCBackLegPattern>=2){
		//System.out.println("There is a continous pattern at"+i+" to "+(i+countOfCBackLegPattern-1));
		//System.out.println(" Prev i"+i+" add "+countOfCBackLegPattern);
		i+=countOfCBackLegPattern;
		j=i;
		int possibleFrontLeg=0;
		while(j<grass.length())
		{
			//System.out.println(" Processing front leg j="+j);
			int countOfFrontLegPattern=findContinuousPattern(j,")",grass);
			if(countOfFrontLegPattern>=2){
			possibleFrontLeg+=countOfFrontLegPattern-1;
//System.out.println("possible front leg "+possibleFrontLeg);
			j+=countOfFrontLegPattern;
			} else {
				j++;
			}
		}
		totalPossibleLegPatterns+=(countOfCBackLegPattern-1)*possibleFrontLeg;
	//	System.out.println("Possible leg patterns"+totalPossibleLegPatterns);
		
	}else {
		i++;
	}
}
System.out.println(" possible patterns"+totalPossibleLegPatterns);
/*output.print(totalPossibleLegPatterns);	

 * input.close();
output.close();*/
	}

public static int findContinuousPattern(int startingIndex,String patternToCheck,String grassPattern){
int count=0;
//System.out.println("func called start from "+startingIndex+" pattern "+patternToCheck);

	for(int i=startingIndex;i<grassPattern.length();i++){
//System.out.println("check arry["+i+"] "+grassPattern.charAt(i));
		if(patternToCheck.equals(grassPattern.charAt(i)+"")) {
			count++;
	}else {
		break;
	}
	}
//	System.out.println("return "+count);
return count;
}

}
