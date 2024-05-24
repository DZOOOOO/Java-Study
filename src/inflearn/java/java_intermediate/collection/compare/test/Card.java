package inflearn.java.java_intermediate.collection.compare.test;

public class Card implements Comparable<Card> {
    private final Integer rank;
    private final Suit suit;

    public Card(Integer rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Integer getRank() {
        return rank;
    }

    @Override
    public int compareTo(Card anothreCard) {
        if (this.rank != anothreCard.rank) {
            return Integer.compare(this.rank, anothreCard.rank);
        } else {
            return this.suit.compareTo(anothreCard.suit);
        }
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}