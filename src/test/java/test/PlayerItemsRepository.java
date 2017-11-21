package test;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayerItemsRepository implements Repository<PlayerItems> {
    private Statement stmt = ConnectionUtil.getStatement();
    public PlayerItems findById(int id) {
        return null;
    }

    public List<PlayerItems> findAll() {
        try {

            String sql;
            sql = "SELECT * FROM item_users";
            ResultSet rs = stmt.executeQuery(sql);
            List<PlayerItems> playerItems = new ArrayList<PlayerItems>();
            while (rs.next()) {
                int id = rs.getInt("id");
                int player_id = rs.getInt("user_id");
                int item_id = rs.getInt("item_id");
                playerItems.add(new PlayerItems(id, player_id, item_id));
            }
            return playerItems;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
