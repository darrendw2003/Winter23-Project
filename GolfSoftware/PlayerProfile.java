package Project;

public class PlayerProfile {
    private final String _firstName;
    private final String _lastName;
    private Handicap _handicap;
    private PlayerProfile _next = null;

    public PlayerProfile(String firstName, String lastName) {
        _firstName = firstName;
        _lastName = lastName;
        _next = new PlayerProfile();
    }

    public PlayerProfile() {
        _firstName = null;
        _lastName = null;
        _next = null;
    }

    public String getName() {return _firstName + " " + _lastName;}

    public double getHandicap() {return 0.0;}

    public String getLastName() {return _lastName;}

    public PlayerProfile getNext() {return _next;}


    public boolean isEmpty() {return _firstName == null || _lastName == null;}

    public boolean contains(String firstName, String lastName) {
        if (this.isEmpty()) {
            return false;
        } else if (_firstName.equals(firstName) && _lastName.equals(lastName)) {
            return true;
        } else {
            return _next.contains(firstName, lastName);
        }
    }

    public PlayerProfile addPlayer(String firstName, String lastName) {
        if (this.isEmpty()) {
            return new PlayerProfile(firstName, lastName);
        } else {
            _next = _next.addPlayer(firstName, lastName);
        }
        return this;
    }

    public PlayerProfile remove(String firstName, String lastName) {
        if (this.contains(firstName, lastName)) {
            return this;
        } else if (_firstName.equals(firstName) && _lastName.equals(lastName)) {
            if (_next.isEmpty()) {
                return new PlayerProfile();
            } else {
                return _next;
            }
        } else {
            _next = _next.remove(firstName, lastName);
        }
        return this;
    }

}
