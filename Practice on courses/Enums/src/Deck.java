import java.util.*;

class CardComparator<Card> implements Comparator<Card>{

    @Override
    public int compare(Card o1, Card o2) {
        if (o1!=null&&o2!=null){
            int result = o1.suit.compareTo(o2.suit);
            if(result == 0){
                return o1.rank.compareTo(o2.rank);
            } else {
                return  result;
            }
        }
        return 0;
    }
}
public class Deck {

    List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit: Suit.values()) {
            for (Rank rank: Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);

    }

    public void printAll() {
        int number = 0;
        for (Card card: cards) {
//            if (number % 13 == 0) {
//                System.out.println();
//            }
            System.out.print(card + " ");
            number++;
        }
    }
    public void sort(){
        Collections.sort(cards,new Card.CardComparator());

    }

}
