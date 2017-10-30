import java.util.ArrayList;

public class Game {
    private ArrayList<Letter> game = new ArrayList<>();

    public Game(String word) {
        for (int i = 0; i < word.length(); i++) {
            Letter letter = new Letter(word.charAt(i));
            game.add(letter);
        }
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < game.size(); i++){
            string += game.get(i);
        }
        return string;
    }

    public boolean contains(char c){
        boolean found = false;
        for (Letter letter : game){
            if (Character.toLowerCase(letter.getLetter()) == Character.toLowerCase(c)){
                letter.setFound(true);
                found = true;
            }
        }
        return found;
    }
    public boolean hasWon(){
        for (Letter letter : game){
            if (!letter.isFound()){
                return false;
            }
        }
        return  true;
    }
}
