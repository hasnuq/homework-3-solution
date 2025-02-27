public class NPC implements CloneableGameEntity{
    private String name;

    public NPC(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public NPC cloneEntity() {
        return new NPC(this.name);
    }
}
