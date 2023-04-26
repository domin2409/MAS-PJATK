public class Badge {
    private String name;
    private String timeOfGetting;

    public void setTimeOfGetting(String timeOfGetting) {
        this.timeOfGetting = timeOfGetting;
    }

    public Badge(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Badge{" +
                "name='" + name + '\'' +
                ", timeOfGetting='" + timeOfGetting + '\'' +
                '}';
    }
}
