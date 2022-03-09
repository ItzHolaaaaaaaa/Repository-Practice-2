import java.util.*;
public class Inheritance{
	
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Would you like to make a Black history month movie on Harriet Tubman, Rosa Parks, or Martin Luther King?");
		String response = input.nextLine();
		
		if(response.equals("Harriet Tubman")) {
			HarrietTubman myMovie = new HarrietTubman();
			System.out.println("What would you like to name it? ");
			String movieName = input.nextLine();
			myMovie.setName(response);
			System.out.println("You have created a book about Harriet Tubman called " + movieName + "!");
			System.out.println("Known as the “Moses of her people,” Harriet Tubman was enslaved, escaped, and helped others gain their freedom as a “conductor\" of the Underground Railroad. " + "\u270A");
			
		} else if (response.equals("Rosa Parks")) {
			RosaParks myMovie = new RosaParks();
			System.out.println("What would you like to name it? ");
			String  movieName = input.nextLine();
			myMovie.setName(response);
			System.out.print("What civil rights movement would you like it to talk about? ");
			String moviePlot = input.nextLine();
			System.out.println("You have created a book about Rosa parks, talking about the civil rights movement that she lead called " + moviePlot + "and the title is " + movieName + "!");
			System.out.println("Called \"the mother of the civil rights movement,\" Rosa Parks invigorated the struggle for racial equality when she refused to give up her bus seat to a white man in Montgomery, Alabama. Parks' arrest on December 1, 1955 launched the Montgomery Bus Boycott by 17,000 black citizens. " + "\u270A");
			
		} else if (response.equals("Martin Luther King")) {
			MartinLutherKing myMovie = new MartinLutherKing();
			System.out.println("What would you like to name it? ");
			String movieName = input.nextLine();
			myMovie.setName(response);
			System.out.print("What speech of hs would you like to include in this book? ");
			String moviePlot = input.nextLine();
			System.out.println("You have created a book about Martin Luther King, talking about his speech " + moviePlot + "and the title is " + movieName + "!");
			System.out.println("Martin Luther King, Jr., is a civil rights legend. In the mid-1950s, Dr. King led the movement to end segregation and counter prejudice in the United States through the means of peaceful protest. His speeches—some of the most iconic of the 20th century—had a profound effect on the national consciousness. " + "\u270A" );
			
		}
	}
	
	public static void clear(){ 
		for(int i = 0; i <20; i++){
			System.out.println();
		}
	}
}