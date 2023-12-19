package Project;

public class GolfManagement {

    private PlayerProfile[] _players;

    public GolfManagement() {
        _players = new PlayerProfile[83];
    }

    private int hashIndex(String firstName, String lastName) {
        String fullName = lastName + firstName;
        return Math.abs(fullName.hashCode()) % 83;
    }

    public void add(String firstName, String lastName) {
        int i = hashIndex(firstName, lastName);
        if (_players[i] == null) {
            _players[i] = new PlayerProfile(firstName, lastName);
        } else {
            _players[i].addPlayer(firstName, lastName);
        }
    }

    public void remove(String firstName, String lastName) {_players[hashIndex(firstName, lastName)].remove(firstName, lastName);}

}