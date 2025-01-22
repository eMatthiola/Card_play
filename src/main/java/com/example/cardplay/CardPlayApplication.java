package com.example.cardplay;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CardPlayApplication {

    public static void main(String[] args) {
        List<Card> mixedSuit = Arrays.asList(
                new Card(Card.Suit.spade, 1),
                new Card(Card.Suit.club, 2),
                new Card(Card.Suit.diamond, 3),
                new Card(Card.Suit.heart, 4),
                new Card(Card.Suit.spade, 5)
        );

        System.out.println(CardGame.scoreSameSuit(mixedSuit));
    }

}
