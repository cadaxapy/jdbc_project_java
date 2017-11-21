package test;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ItemRepository implements Repository<Items>{
    private Statement stmt = ConnectionUtil.getStatement();

    public Items findById(int id) {
        return null;
    }

    public List<Items> findAll() {
        try {
            String sql;
            sql = "SELECT * FROM items";
            ResultSet rs = stmt.executeQuery(sql);
            List<Items> items = new ArrayList<Items>();
            while (rs.next()) {
                String name = rs.getString("name");
                int id = rs.getInt("id");
                int creatorId = rs.getInt("creator_id");
                items.add(new Items(id, creatorId, name));
            }
            return items;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
