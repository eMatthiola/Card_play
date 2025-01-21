package com.example.cardplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardPlayApplication {

    public static void main(String[] args) {
        Card card1 = new Card(Card.Suit.spade, 5);
        System.out.println(card1);
    }

}
