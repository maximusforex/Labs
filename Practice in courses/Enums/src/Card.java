public class Card implements Comparable<Card>{
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return String.format("%s%s", suit, rank);
    }
    @Override
    public int compareTo(Card o) {
        if (o!=null){
            int result = this.suit.compareTo(o.suit);
            if(result == 0){
                return this.rank.compareTo(o.rank);
            } else {
                return  result;
            }
        }
        return 0;
    }
}
