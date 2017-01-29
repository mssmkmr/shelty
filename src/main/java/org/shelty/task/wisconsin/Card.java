package org.shelty.task.wisconsin;

/**
 * Card class to be sorted by Wisconsin Card Sorting Task.
 */
public abstract class Card
{
    /// Card Mark
    public enum Mark
    {
        CIRCLE,
        SQUARE,
        TRIANGLE,
        PENTAGON
    };

    /// Card Color
    public enum Color
    {
        Red,
        BLUE,
        GREEN,
        MAGENTA
    };

    private Mark  mark;
    private Color color;
    /// Card number
    private int   number;

    public Card(Card.Mark mark, Card.Color color, int number)
    {
        assert(number > 0 && number < 5):
        this.mark = mark;
        this.color = color;
        this.number = number;
    }

    public Card.Mark getMark() {
        return mark;
    }

    public Card.Color getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }
}
