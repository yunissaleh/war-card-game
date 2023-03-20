import Y2_Lab3.Card;

import java.util.Random;

public class Deck {
    private Card[] cards = new Card[52];
    private int noCards =0;

    public void addCard(Card c) {
        for(int i = 0; i < noCards; i++) {
            if(cards[i].compareTo(c) == 0) {
                throw new NotAvailableException("This card is already in your deck!");
            }
        }
        cards[noCards++]=c;
    }

    public Card deleteCard() {

        Card temp = null;
        temp = cards[noCards-1];
        noCards--;
        return temp;
    }

    public void sort() {
        for(int i = 0 ; i < noCards; i++) {
            for(int j = 0; j < noCards - 1; j++) {
                if(cards[j].compareTo(cards[j+1]) > 0) {
                    Card temp = cards[j];
                    cards[j] = cards[j+1];
                    cards[j+1] = temp;
                }
            }
        }
    }
    public void shuffle() {
        Random r = new Random();

        for (int i = 0; i < noCards; i++) {
            int randomIn = r.nextInt(noCards);
            Card temp = cards[randomIn];
            cards[randomIn] = cards[i];
            cards[i] = temp;
        }
    }

    public int getNoCards() {
        return noCards;
    }

    @Override
    public String toString() {
        String info = "";
        for(int i = 0; i <noCards; i++) {
            info += "Card{Rank:" + cards[i].getRank() + ", with suit:" + cards[i].getSuit() + "} ";
        }
        return info;
    }

    public void display() {
        System.out.println(this.toString());
    }
}
