package cards;

public class Card {

    private String suit;
    private int value;
    private String name;
    
    public Card(String suit, int value, String name) {
        this.suit = suit;
        this.value = value;
        this.name = name;
    }

    public String getSuit() {
        return suit;
    }
    public int getValue() {
        return value;
    }
    public String getName() {
        return name;
    }

    //.formatted is to construct, not to print out in this class. so when Main calls out print function, this will show instead of reference
    @Override
    public String toString() {
        return "Card[name = %s, suit = %s, value = %d".formatted(this.name, this.suit, this.value);
    }
    
}
