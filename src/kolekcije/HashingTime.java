package kolekcije;

import com.sun.java.accessibility.util.Translator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Locale;
import java.util.StringTokenizer;

public class HashingTime {

    public static void main(String[] args) {

        /*  System.out.println("*****HashMap*****");
        HashMap users_map = new HashMap();

        users_map.put("user1", "SpawN");
        users_map.put("user2", "f0rest");
        users_map.put("user3", "Edward");
        users_map.put("user4", "Markeloff");
        users_map.put("user5", "Neo");
        System.out.println("Top 3 players are: " + users_map.get("user1") + ", " + users_map.get("user2" ) + ", " + users_map.get("user3"));
        System.out.println("\nFull list of the players: \n");
 Iterator  iter = users_map.entrySet().iterator();
       while(iter.hasNext()){
        
           Map.Entry kvp = (Map.Entry)iter.next();
           System.out.println(kvp.getKey()+ " " + kvp.getValue()); 
       } */
        HashMap topList = new HashMap();

        topList.put("user1", "amidzaaa");
        topList.put("user2", "Filip");
        topList.put("user3", "Maked");
        topList.put("user4", "Brutal");
        topList.put("user5", "takber");
        topList.put("user6", "N3on");
        topList.put("user7", "SuTek");

        System.out.println("The greatest player of all time is our one and only the lovely: " + topList.get("user1"));
        System.out.println("Congratulations to amidzaaa for winning The Goat Award 2020, it was a huge honor to watch a player like you to be a part of this wonderful activity");
        System.out.println("\nList of players who participated in this tournament are: ");
        Iterator iter = topList.entrySet().iterator();
        while (iter.hasNext()) {

            Map.Entry surfGateway = (Map.Entry) iter.next();
            System.out.println(surfGateway.getKey() + " " + surfGateway.getValue());

        }

    }

}
