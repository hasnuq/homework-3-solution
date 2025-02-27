import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }

    public void describe() {
        System.out.println("Dungeon: " + name);
        System.out.println("Rooms:");
        for (Room room : rooms) {
            System.out.println(room.getName());
        }
        System.out.println("NPCs:");
        for (NPC npc : npcs) {
            System.out.println( npc.getName());
        }
    }
}
