package test;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AttributesRepository implements Repository<Attributes> {
    private Statement stmt = ConnectionUtil.getStatement();
    public Attributes findById(int id) {
        return null;
    }

    public List<Attributes> findAll() {
        try {
            String sql;
            sql = "SELECT * FROM player_attrs";
            ResultSet rs = stmt.executeQuery(sql);
            List<Attributes> attributes = new ArrayList<Attributes>();
            while (rs.next()) {
                String strength = rs.getString("strength");
                String agility = rs.getString("agility");
                String intellect = rs.getString("intellect");
                int id = rs.getInt("id");
                int player_id = rs.getInt("player_id");
                attributes.add(new Attributes(id, player_id, strength, agility, intellect));
            }
            return attributes;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
