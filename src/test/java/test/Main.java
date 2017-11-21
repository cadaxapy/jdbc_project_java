package test;

import java.sql.*;
import java.util.List;


public class Main {
    public static void main(String args[]) {
        PlayerRepository playerRepository = new PlayerRepository();
        AttributesRepository attributesRepository = new AttributesRepository();
        ItemRepository itemRepository = new ItemRepository();
        PlayerItemsRepository playerItemsRepository = new PlayerItemsRepository();
        Connection conn = null;
        Statement stmt = null;
        try {
            List<Player> players = playerRepository.findAll();
            System.out.println("Players:");
            List<Attributes> attributes = attributesRepository.findAll();
            for(int i = 0; i < players.size(); i++) {
                System.out.println("  Name: " + players.get(i).getName());
                System.out.println("  Attributes: {");
                for(int j = 0; j < attributes.size(); j++) {
                    if(players.get(i).getId() == attributes.get(j).getPlayerId()) {
                        System.out.println("     Strength: " + attributes.get(j).getStrength());
                        System.out.println("     Agility: " + attributes.get(j).getAgility());
                        System.out.println("     Intellect: " + attributes.get(j).getIntellect());
                        System.out.println("  }");
                    }
                }
            }

            List<Items> items = itemRepository.findAll();
            List<PlayerItems> playerItems = playerItemsRepository.findAll();
            System.out.println();
            System.out.println("Items");
            for(int i = 0; i < items.size(); i++) {
                System.out.println("  Name: " + items.get(i).getName());
                System.out.println("  Creator: {");
                for(int j = 0; j < players.size(); j++) {
                    if(players.get(j).getId() == items.get(i).getCreatorId()) {
                        System.out.println("   Name: " + players.get(j).getName());
                        System.out.println("  }");

                    }
                }

                System.out.println("  Item Users: {");
                for(int j = 0; j < playerItems.size(); j++) {
                    if(playerItems.get(j).getItemId() == items.get(i).getId()) {
                        for(int z = 0; z < players.size(); z++) {
                            if(playerItems.get(j).getUserId() == players.get(z).getId()) {
                                System.out.println("   Name: " + players.get(z).getName());
                                System.out.println("  }");
                            }
                        }
                    }
                }
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
