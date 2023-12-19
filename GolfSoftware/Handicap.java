package Project;

public class Handicap {

    private double handicap;
    private RoundLL _rounds;

    public Handicap() {
        _rounds = new RoundLL();
    }

    public void addRound(Round input) {
        _rounds.add(input);
    }

    public void addRound(int score, double courseRating, double slopeRating) {
        _rounds.add(score, courseRating, slopeRating);
    }

    public double getHandicap() {return handicap;}


}
