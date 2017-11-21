package test;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
public class PlayerRepository implements Repository<Player> {
    private Statement stmt = ConnectionUtil.getStatement();
    public Player findById(int id) {

        try {
            String sql;
            sql = "SELECT * FROM players WHERE id = " + id;
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public  List<Player> findAll() {
        try {

            String sql;
            sql = "SELECT * FROM players";
            ResultSet rs = stmt.executeQuery(sql);
            List<Player> players = new ArrayList<Player>();
            while (rs.next()) {
                String name = rs.getString("name");
                int id = rs.getInt("id");
                players.add(new Player(id, name));
            }
            return players;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
