import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws Exception {
        File file = new File("movies.txt");
        Scanner scanFile = new Scanner(file);
        System.out.println(scanFile);

        ArrayList<String> movie_list = new ArrayList<>();

        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            movie_list.add(line);
        }

        int randomNumber = (int) (Math.random() * movie_list.size()) + 1;

        String title = movie_list.get(randomNumber);
        Game game = new Game(title);

        Scanner scanner = new Scanner(System.in);
        int guessNumber = 0;

        while (guessNumber < 10 && !game.hasWon()) {
            System.out.println("You are guessing: " + game);
            System.out.println("You have guessed " + guessNumber + " wrong letters :");
            System.out.println("Guess a letter: ");
            char guess = scanner.nextLine().charAt(0);

            if (!game.contains(guess)) {
                guessNumber += 1;
            }
        }
        if (game.hasWon()) {
            System.out.println("You win!");
            System.out.println("You have guessed " + game + " correctly!");
        } else {
            System.out.println("You have lost !");
            System.out.println("The title was " + title + " !");
        }
    }
}
