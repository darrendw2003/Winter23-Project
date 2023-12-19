package Project;

// Round object type, used to store player score and score differential (used to calculate handicap index).
public class Round {
    private final int _score;
    private final double _scoreDifferential;

    public Round(int score, double courseRating, double slopeRating) {
        _score = score;
        _scoreDifferential = Math.round(((score - courseRating) * 1130.0) / slopeRating) / 10.0; // Calculates handicap index.
    }

    public double getScoreDif() {return _scoreDifferential;}

    public int getScore() {return _score;}
}