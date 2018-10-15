import java.util.Scanner;
/**
 * 
 * @author jane schneider 
 * 
 * ask for target sum from the user and roll until the sum of the two die are the target
 */
public class DiceValue 
{
	public static void main(String args)
	{
	Dice one = new Dice();

	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter the target sum value: ");
	int target = scan.nextInt();
	scan.nextLine();

	
	if(target < 2)
	{
		System.out.print("please enter a valid target value: ");
		scan.nextInt();
	}
	
	if(target > 12)
	{
		System.out.print("please enter a valid target value: ");
		scan.nextInt();
	}
	
	
	boolean play = true;
	
	
	
	while(play = true) 
	{
	 int oneRoll = one.roll();
	 int twoRoll = one.roll();
	 int add = oneRoll + twoRoll;
	 System.out.println("first roll: " + oneRoll + "second roll: " + twoRoll + "sum: " + add);
	 
	 		if(oneRoll + twoRoll == target)
	 			{
	 				play = false;
	 				System.out.println("you've hit your target of " + target + "with a roll of " + oneRoll + "and" + twoRoll);
	 			}
	 		else
	 		{
	 			play = false;
	 		}
		
	}
}
}
