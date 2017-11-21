package test;

public class Items {
    private int id;
    private int creatorId;
    private String name;

    public Items(int id, int creator_id, String name) {
        this.id = id;
        this.creatorId = creator_id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public String getName() {
        return name;
    }
}
