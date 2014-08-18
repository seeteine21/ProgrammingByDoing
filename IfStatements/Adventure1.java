import java.util.Scanner;

public class Adventure1
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String answer1, answer2, answer3;
		System.out.print( "Your dog is licking your face! Do you wish to \"take him for a walk\" outside or \"roll over\" and go back to sleep?\n> " );
		answer1 = keyboard.nextLine();
		
		if (answer1.equals("take him for a walk") )
		{
			System.out.print( "You see a giant bone you can \"feed him\" or you can \"let your dog poop\" on your neighbors yard?\n> " );
			answer2 = keyboard.next();
			
			if ( answer2.equals("feed him") )
			{
				System.out.print( "Your dog's stomach becomes upset...Take him to the vet? (\"yes\" or \"no\")\n> " );
				answer3 = keyboard.next();
				// option 1
				if (answer3.equals("yes") )
					System.out.println( "Your doctor pumps your dogs stomach. Fido now feels a lot better..." );
				// option 2
				else if (answer3.equals("no") )
					System.out.println( "Your dog throws up on your dinner. Good you can still order pizza!" );
				else
					System.out.println( "You need to answer correctly...You lose." );
			}
			
			else if ( answer2.equals("let your dog poop") )
			{
				System.out.print( "You neighbor gets upset and wants fight you. Do you throw \"uppercut\" or a \"hadouken\"?\n> " );
				answer3 = keyboard.next();
				// option 3
				if ( answer3.equals("uppercut") )
					System.out.println( "You beat that ass down." );
				// option 4
				else if ( answer3.equals("hadouken") )
					System.out.println( "You destroy your neighbor and he hands over the deed to his house." );
				else
					System.out.println( "You need to answer correctly...You lose." );
			}
			else
				System.out.println( "You need to answer correctly...You lose." );
		}
		else if ( answer1.equals("roll over") )
		{
			System.out.print( "You wake up. Do you want some \"cereal\" or a \"sunshine\"?\n> " );
			answer2 = keyboard.next();
			if ( answer2.equals("cereal") )
			{
				System.out.print( "Do you take your cereal with \"milk\" or \"silk\"?\n> " );
				answer3 = keyboard.next();
				
				// option 5
				if ( answer3.equals("milk") )
					System.out.println( "That's great cereal. And not stale either!" );
				// option 6
				else if ( answer3.equals("silk") )
					System.out.println( "No amount of Cheerios can lower your cholesterol." );
				else
					System.out.println( "You need to answer correctly...You lose." );
			}
			else if ( answer2.equals("sunshine") )
			{
				System.out.print( "Do you want to take a \"fat\" or \"low fat\" silk?\n> " );
				answer3 = keyboard.next();
				
				// option 7
				if ( answer3.equals("fat") )
					System.out.println( "The warm water feels great! What a wonderful way to start the day!" );
				// option 8
				else if ( answer3.equals("low fat") )
					System.out.println( "That is so low fat. You're gonna be beach ready." );
				else	
					System.out.println( "You need to answer correctly...You lose." );			
			}	
		}
		else
			System.out.println( "You need to answer correctly...You lose." );
	}
}