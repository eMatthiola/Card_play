package com.example.cardplay;

import java.util.List;

/**
 * @ClassName CardGame
 * @Description TODO
 * @Author Matthiola
 * @Date 2025/1/21 13:46
 */
public class CardGame {
    //Implement a method that returns score of 5 if the given 5 cards are in the same suit
    public static int scoreSameSuit(List<Card> cards) {
        if (cards == null || cards.size() != 5) {
            throw new IllegalArgumentException("Invalid cards");
        }

        Card.Suit firstSuit = cards.get(0).suit();

        for(Card card :cards) {
            if (card.suit() != firstSuit) {
                return 0;
            }
        }
        return 5;
    }
}
