public class MUDBuilderDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Dark Cave")
                .addRoom(new Room("Entrance"))
                .addRoom(new Room("Hall of Shadows"))
                .addNPC(new NPC("Goblin"))
                .addNPC(new NPC("Wizard"))
                .build();
        dungeon.describe();
    }
}
