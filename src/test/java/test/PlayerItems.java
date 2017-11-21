package test;

public class PlayerItems {
    private int id;
    private int userId;
    private int itemId;

    public PlayerItems(int id, int userId, int itemId) {
        this.id = id;
        this.userId = userId;
        this.itemId = itemId;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getItemId() {
        return itemId;
    }
}
