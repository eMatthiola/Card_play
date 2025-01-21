package com.example.cardplay;

/**
 * @ClassName card
 * @Description TODO
 * @Author Matthiola
 * @Date 2025/1/20 19:05
 */
public class Card {
    public enum Suit {
        spade, club, diamond, heart
    }

    private Suit suit;
    private int rank;

    public Card(Suit suit, int rank) {
        if (rank < 1 || rank > 10) {
            throw new IllegalArgumentException("Rank must in 1 to 10");
        }
        this.suit = suit;
        this.rank = rank;
    }

    public Suit suit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return suit + " " + rank;
    }
}
