import java.util.Scanner;
import java.util.Random;//to create random number from computer
public class game
{
	public static void main (String[]args)
	{
	int user,comp;
	char choice;
	Scanner key = new Scanner(System.in);
	do
	{
		user=userinput();
		comp=compinput();
		output(user,comp);
		winner(user,comp);
		System.out.println(" Enter y if you want to play again : ");
		choice= key.next().charAt(0);
	}
	while(choice=='y');
	}//main
	public static int userinput()
	{
		int user_choice;
		Scanner key = new Scanner(System.in);
		System.out.print("Press (1) for rock (2) for paper and  (3) for scissors : ");
		user_choice=key.nextInt();
		return user_choice;
	}//userinput
	public static int compinput()
	{
		String choice;//to store computer decision
		int comp_choice;
		Random rand = new Random();//to generate random number
		comp_choice=1+rand.nextInt(3);
		if(comp_choice==1)
		{
			choice="rock";
		}
		else if(comp_choice==2)
		{
			choice="paper";
		}
		else
		{
			choice="scissor";
		}
		//System.out.println(""+choice);
		return comp_choice;
	}//userinput
	public static void winner(int player1 , int player2)
	{
		if(player1==1 && player2==3 || player1==3 && player2==1)
		
			System.out.println("The rock wins (rock smatch tha scissor)");
			
		if(player1==3 && player2== 2 || player1==2 && player2==3) 
		
			System.out.println("Scissor wins (Scissor cut the paper)");
		
		if(player1==2 && player2==1 || player1 ==1 && player2==2)
		
			System.out.println("Paper wins (paper wraps the rock) ");			
		
		
		if(player1==player2 || player2==player1)
		{
			System.out.println("Play the game again : ");
			
		}
	}//winner
	public static void output(int user,int computer)
	{
	String choice;
	String choice1;
	if(computer==1)
		{
			choice="rock";
		}
	else if(computer==2)
		{
			choice="paper";
		}
	else
		{
			choice="scissor";
		}
	if(user==1)
		{
			choice1="rock";
		}
	else if(user==2)
		{
			choice1="paper";
		}
	else if(user==3)
		{
			choice1="scissor";
		}
	else
		{
			choice1="Invalid";
		}
		System.out.println(" ------------------------------------------------");
		System.out.print("|");
		System.out.print("\t User choice ");
		System.out.print("\t || ");
		System.out.println("\tComputer choice  | ");
		System.out.println(" ------------------------------------------------");
		System.out.println("| \t \t \t ||\t \t \t |");
		System.out.println("\t "+choice1+"\t \t  \t"+choice+"\t \t ");
		System.out.println("|\t \t \t ||\t \t \t |");
		System.out.println(" ------------------------------------------------");
	}//output
}//class