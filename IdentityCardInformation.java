import java.util.Scanner;
public class IdentityCardInformation
{
	public static void main (String[]args) //mainmethod
	{
	String CNIC1;
	CNIC1=InputCNIC();
	validateProvince(CNIC1);
	Division(CNIC1);
	Gender(CNIC1);
	}
	public static String InputCNIC() //GetCNIC
		{
		String CNIC; //storeCNIC
		Scanner key = new Scanner (System.in);
		System.out.println("Enter your CNIC number : ");
		CNIC=key.nextLine();
		while(CNIC.length()!=13) //Length Check CNIC
			{
			System.out.println("Enter CNIC number again here : ");
			CNIC=key.nextLine();
			}
		return CNIC; //returnCNIC to main method
		}
	public static void validateProvince(String province_CNIC) //province method
	{
		int province;
		char province_char;
		province_char=province_CNIC.charAt(0);//character position
 		province=Character.getNumericValue(province_char);//To get numeric value of province_char 
		if(province==1)
		{
			System.out.println("The card holder is from Province : Khyber Pakhthunkhwa (K-P). ");
		}
		else if(province==2)
		{
			System.out.println("The card holder is from Province : Federally Administered Tribal Areas (FATA) .");
		}
		else if(province==3)
		{
			System.out.println("The card holder is from Province : Punjab . ");
		}
		else if(province==4)
		{
			System.out.println("The card holder is from Province : Sindh .");
		}
		else if(province==5)
		{
			System.out.println("The card holder is from Province : Balochistan .");		
		}
		else if(province==6)
		{
			System.out.println("The card holder is from Province : Islamabad Capitial Territory .");
		}
		else if(province==7) 
		{
			System.out.println("The card holder is from Province : Gilgit-Balistan . ");
		}
		else
		{
			System.out.print("CNIC number is incorrect Enter again : ");
		InputCNIC(); //if input is invalid it will again call InputCNIC	
		}		
	}
	public static void Division(String division_CNIC)//division method
	{
		int division;
		char division_char;
		division_char=division_CNIC.charAt(1);//division location
		division=Character.getNumericValue(division_char);//char into integer 		
		if(division==4)
		{
			System.out.println("The card holder belongs to Gujranwala");
		}
		else
		{
			System.out.println("The card holder dosen't belongs to Gujranwala");
		}
	}
	public static void Gender(String gender_CNIC)
	{
	int gender;
	char gender_char;
	gender_char=gender_CNIC.charAt(12);
	//System.out.println(""+gender_char);
	gender=Character.getNumericValue(gender_char);
	if(gender%2==0)
	{
		System.out.println("The gender of card holder is female ");
	}
	else
	{
		System.out.println("The gender of card holder is male ");
	}
		}

}//main	
