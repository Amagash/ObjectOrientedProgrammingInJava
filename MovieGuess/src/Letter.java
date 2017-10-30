public class Letter {
    private char letter;
    private boolean found;

    public Letter(char letter) {
        this.letter = letter;
        this.found = false;
    }

    @Override
    public String toString() {
        if (this.found){
            return String.valueOf(letter);
        }
        return "-";
    }

    public char getLetter() {
        return letter;
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    public boolean isFound() {
        return found;
    }
}
