import Y2_Lab1.Account;
import Y2_Lab3.Card;
import Y2_Lab3.Rank;
import Y2_Lab3.Suit;

import java.util.ArrayList;

public class WarGame {
    public void createDeck(Deck d) {
        for(Suit s: Suit.values()) {
            for(Rank r: Rank.values()) {
                d.addCard(new Card(r, s));
            }
        }
    }
    public void giveCards(Deck p, Deck d,int numP) {
        for(int i = 0; i < 52/numP; i++) {
            p.addCard(d.deleteCard());
        }
    }
   
    public int createGame() {
        Deck d = new Deck();
        int noMoves = 0;

        createDeck(d);

        d.shuffle();

        Deck p1 = new Deck();
        Deck p2 = new Deck();
        Deck p3 = new Deck();
        Deck p4 = new Deck();

        giveCards(p1,d,4);
        giveCards(p2,d,4);
        giveCards(p3,d,4);
        giveCards(p4,d,4);
        Deck[] currentDecks = {p1, p2, p3, p4};

        while(p1.getNoCards() != 0 && p2.getNoCards() != 0 && p3.getNoCards() != 0 && p4.getNoCards() !=0) {
            Card pc1 = p1.deleteCard();
            Card pc2 = p2.deleteCard();
            Card pc3 = p3.deleteCard();
            Card pc4 = p4.deleteCard();
            Card[] currentCards = {pc1, pc2, pc3, pc4};

            Card maxP = pc1;
            Deck maxD = p1;

            for(int i = 1; i < currentCards.length; i++) {
                if(currentCards[i].compareTo(maxP) > 0) {
                    maxP = currentCards[i];
                    maxD = currentDecks[i];
                }
            }
            for(int i = 0; i < currentCards.length; i++) {
                maxD.addCard(currentCards[i]);
            }
            noMoves++;
        }



        return noMoves;
    }

}
