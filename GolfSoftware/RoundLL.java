package Project;
import java.util.*;

// Linked list structure using 'Round' object types to store round data.
public class RoundLL {
    private final Round roundData;
    private RoundLL _next = null;
    private int size = 0;

    // Constructor using 'Round' type as input.
    public RoundLL(Round input) {
        roundData = input;
        _next = new RoundLL();
        size ++;
    }

    // Constructor using 'Round' input parameters as input.
    public RoundLL(int score, double courseRating, double slopeRating) {
        roundData = new Round(score, courseRating, slopeRating);
        _next = new RoundLL();
        size++;
    }

    public RoundLL() {
        roundData = null;
    }

    public boolean isEmpty() {return roundData == null;}

    // Add method using 'Round' type as input.
    public RoundLL add(Round input) {
        if (size >= 20) {
            return _next.add(input);
        } else if (this.isEmpty()) {
            return new RoundLL(input);
        } else {
            _next = _next.add(input);
        }
        size++;
        return this;
    }

    // Add method using 'Round' input parameters as input.
    public RoundLL add(int score, double courseRating, double slopeRating) {
        if (size >= 20) {
            return _next.add(score, courseRating, slopeRating);
        } else if (this.isEmpty()) {
            return new RoundLL(score, courseRating, slopeRating);
        } else {
            _next = _next.add(score, courseRating, slopeRating);
        }
        size++;
        return this;
    }

    public Round getRound() {return roundData;}

    public int getSize() {return size;}

    private RoundLL getNext() {return _next;}

    public ArrayList<Round> retArray() {
        ArrayList<Round> result = null;
        RoundLL current = this;
        while (!current.isEmpty()) {
            result.add(current.getRound());
            current = current.getNext();
        }
        return result;
    }
}
