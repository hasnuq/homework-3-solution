public class Room implements CloneableGameEntity{
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Room cloneEntity() {
        return new Room(this.name);
    }
}
