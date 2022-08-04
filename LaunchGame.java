import java.util.Scanner;

class Guesser{
	int guessNum;
	
	public int guessNumber() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Guesser kindly guess number between 1 to 10:");
		guessNum=sc.nextInt();
		if(guessNum>0 && guessNum<=10)
			return guessNum;
		else 
		{
			System.out.println("You have guessed the wrong number, Please guess the Number between 1 to 10");
			guessNum=sc.nextInt();
			return guessNum;
		}
	}
}
class Player{
	int guessNum;
	public int guessNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		guessNum=sc.nextInt();
		if(guessNum>0 && guessNum<=10)
			return guessNum;
		else 
		{
			System.out.println("You have guessed the wrong number, Please guess the Number between 1 to 10");
			guessNum=sc.nextInt();
			return guessNum;
		}
	}
}
class Umpire{
	int numfromGuesser;
	int numfromPlayer1;
	int numfromPlayer2;
	int numfromPlayer3;
	
	public void collectfromGuesser(){
		Guesser gr = new Guesser();
		numfromGuesser = gr.guessNumber();
	}
	 public void collectfromPlayer(){
		 Player p1 = new Player();
		 Player p2 = new Player();
		 Player p3 = new Player();
		 
		 numfromPlayer1=p1.guessNumber();
		 numfromPlayer2=p1.guessNumber();
		 numfromPlayer3=p1.guessNumber();
	 }
	 
	 void compare(){
		 if(numfromGuesser==numfromPlayer1) {
			 if(numfromGuesser==numfromPlayer2 && numfromGuesser==numfromPlayer3)
			 {
				 System.out.println("Game Tied all 3 playes guess number correctly");
			 }
			 else if(numfromGuesser==numfromPlayer2) {
				 System.out.println("Player1 and Player2 won the game");
			 }
			 else if(numfromGuesser==numfromPlayer3) {
				 System.out.println("Player1 and Player3 won the game");
			 }
			 else {
			 System.out.println("Player1 won the game");
			 }
			}
		 else if(numfromGuesser==numfromPlayer2) {
			 if(numfromGuesser==numfromPlayer3) {
				 System.out.println("Player2 and Player3 won the game");
			 }
			 else {
			 System.out.println("Player2 won the game");
			 }
			}
		 else if(numfromGuesser==numfromPlayer3){
			 System.out.println("Player3 won the game");
		 }
		 else {
			 System.out.println("GameLost Play Again");
		 }
			 
	 }
	 
}
public class LaunchGame {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectfromGuesser();
		u.collectfromPlayer();
		u.compare();
	}

}
