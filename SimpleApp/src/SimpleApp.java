import java.util.Scanner;
public class SimpleApp {				
		public static int count = 0;

		public static void main(String[] args) {

			Scanner nameTxt = new Scanner(System.in);
	try{
			System.out.println("Please Eneter Your Name");
			String nameScreenYou = (nameTxt.nextLine()).toLowerCase();
			System.out.println("Please Enter The Person's Name");
			String nameScreenOther = (nameTxt.nextLine()).toLowerCase();
			char[] nameYou = nameScreenYou.toCharArray();
			char[] nameOther = nameScreenOther.toCharArray();
			
			while (!nameScreenYou.matches("[a-zA-Z]+") || !nameScreenOther.matches("[a-zA-Z]+")) { // Check if it has anything other than alphabets
			    System.out.println("This is not in letters only");
			    nameScreenYou = nameTxt.nextLine(); // if not, ask the user to enter new first name
			    nameScreenOther = nameTxt.nextLine();
			}
			
			LovePartenerGuesser lpg = new LovePartenerGuesser();
			lpg.doCompetetion(nameYou, nameOther);
			System.out.println("You Feel About The other " + lpg.theLoveDocYouSays[nameYou.length - lpg.count]);
			System.out.println("The other Feel about you" + lpg.theLoveDocOtherSays[nameOther.length - lpg.count]);
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Exception thrown :" + e);
		System.out.println("it's out of range");
		}
			
			nameTxt.close();
		}

	}



