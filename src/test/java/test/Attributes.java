package test;

public class Attributes {
    private int id;
    private int playerId;
    private String strength;
    private String agility;
    private String intellect;

    public Attributes(int id, int player_id, String strength, String agility, String intellect) {
        this.id = id;
        this.playerId = player_id;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
    }

    public int getId() {
        return id;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getStrength() {
        return strength;
    }

    public String getAgility() {
        return agility;
    }

    public String getIntellect() {
        return intellect;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public void setAgility(String agility) {
        this.agility = agility;
    }

    public void setIntellect(String intellect) {
        this.intellect = intellect;
    }
}
