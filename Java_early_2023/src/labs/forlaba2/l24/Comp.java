package labs.forlaba2.l24;

public class Comp {
    private int cost;
    private int opMemory;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getOpMemory() {
        return opMemory;
    }

    public void setOpMemory(int opMemory) {
        this.opMemory = opMemory;
    }

    public Comp(int cost, int opMemory, String name) {
        this.cost = cost;
        this.opMemory = opMemory;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Comp{" +
                "cost=" + cost +
                ", opMemory=" + opMemory +
                ", name='" + name + '\'' +
                '}';
    }
}
