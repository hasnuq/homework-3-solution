public class MUDCombinedDemo {
    public static void main(String[] args) {
        Room prototypeRoom = new Room("Dark Hallway");
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("The Forbidden Catacombs")
                .addRoom(new Room("Main Chamber"))
                .cloneAndAddRoom(prototypeRoom, 3)
                .build();
        dungeon.describe();
    }
}
