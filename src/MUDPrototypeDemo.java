public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room originalRoom = new Room("Treasure Chamber");
        NPC originalNPC = new NPC("Skeleton");
        Room clonedRoom = originalRoom.cloneEntity();
        NPC clonedNPC1 = originalNPC.cloneEntity();

        System.out.println("Original Room: " + originalRoom.getName());
        System.out.println("Cloned Room: " + clonedRoom.getName());
        System.out.println("Original NPC: " + originalNPC.getName());
        System.out.println("Cloned NPC: " + clonedNPC1.getName());
    }
}
