import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<NPC> npcs = new ArrayList<>();

    public IDungeonBuilder setDungeonName(String name) {
        this.name = name;
        return this;
    }

    public IDungeonBuilder addRoom(Room room) {
        rooms.add(room);
        return this;
    }

    public IDungeonBuilder addNPC(NPC npc) {
        npcs.add(npc);
        return this;
    }

    public Dungeon build() {
        return new Dungeon(name, rooms, npcs);
    }

    public IDungeonBuilder cloneAndAddRoom(Room prototypeRoom, int cloneCount) {
        for (int i = 1; i <= cloneCount; i++) {
            Room clonedRoom = prototypeRoom.cloneEntity();
            clonedRoom = new Room(clonedRoom.getName() + " (Clone #" + i + ")");
            rooms.add(clonedRoom);
        }
        return this;
    }
}
