package first;
/*1. Create a Class Name Cricketer Take 
>instance variables:-cname,jerseyno,highestScore
> static variables :-
boardName,countryName */

public class Cricketer {
	static String boardName = "icci ";
	static String countryName = "India";
	String cname = "dhoni";
	int jersyno;
	int highestScore = 100;

	public static void main(String[] args) {
		Cricketer msd = new Cricketer();
		Cricketer vk = new Cricketer();
		msd.jersyno = 7;
		msd.cname = "doooooni";

		boardName = "jklm";
		countryName = "bharth";

		/*
		 * System.out.println("Cricketer Name :" + msd.cname);
		 * System.out.println("Jersy No:" + msd.jersyno);
		 * System.out.println("Highest Score:" + msd.highestScore);
		 * System.out.println("Board Name:" + boardName);
		 * System.out.println("Country Name:" + countryName);
		 * System.out.println("2nd code");
		 */
		
		System.out.println("Cricketer Name :" + vk.cname);
		System.out.println("Jersy No:" + vk.jersyno);
		System.out.println("Highest Score:" + vk.highestScore);
		System.out.println("Board Name:" + boardName);
		System.out.println(Cricketer.countryName);
		
		
	}



	public void hello(){
		boardName="abcdfgf";
		countryName="India bharath";
		System.out.println("Board Name:"+boardName);
		System.out.println("Country Name:"+countryName);
		
	
	}
}
