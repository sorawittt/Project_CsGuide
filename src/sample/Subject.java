package sample;

public class Subject {
    private String name;
    private String id;
    private int credit;

    public Subject(String name, String id, int credit) {
        this.name = name;
        this.id = id;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getCredit() {
        return credit;
    }
}
