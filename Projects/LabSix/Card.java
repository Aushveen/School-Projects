public class Card {
    private String notation;
    public Card(String notation){
        this.notation = notation;
    }

    public String getDescription() {
        String a = null;
        if (notation.equals("AS"))
            a = "Ace of Spades";
        else if (notation.equals("AD"))
            a = "Ace of Diamonds";
        else if (notation.equals("AH"))
            a = "Ace of Hearts";
        else if (notation.equals("AC"))
            a = "Ace of Clubs";
        else if (notation.equals("JS"))
            a = "Jack of Spades";
        else if (notation.equals("JD"))
            a = "Jack of Diamonds";
        else if (notation.equals("JH"))
            a = "Jack of Hearts";
        else if (notation.equals("JC"))
            a = "Jack of Clubs";
        else if (notation.equals("KS"))
            a = "King of Spades";
        else if (notation.equals("KD"))
            a = "King of Diamonds";
        else if (notation.equals("KH"))
            a = "King of Hearts";
        else if (notation.equals("KC"))
            a = "King of Clubs";
        else if (notation.equals("QS"))
            a = "Queen of Spades";
        else if (notation.equals("QD"))
            a = "Queen of Diamonds";
        else if (notation.equals("QH"))
            a = "Queen of Hearts";
        else if (notation.equals("QC"))
            a = "Queen of Clubs";
        else
            a = "unknown";

        for (int i = 2; i <= 10; i++) {
            String b = Integer.toString(i);
            if (notation.equals(b + "S"))
                a = b + " of Spades";
            else if (notation.equals(b + "D"))
                a = b + " of Diamonds";
            else if (notation.equals(b + "H"))
                a = b + " of Hearts";
            else if (notation.equals(b + "C"))
                a = b + " of Clubs";
            else
                a = "unknown";
        }
        return a;
    }
}
