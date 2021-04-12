package idz1;

public class Milks {
	private String name;
    private int percent;
    private int sklad; // 1-yes or 0-no

    public Milks(String name, int percent, int sklad) {
        super();
        this.name = name;
        this.percent = percent;
        this.sklad = sklad;
    }

    public Milks() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getSklad() {
        return sklad;
    }

    public void setSklad(int sklad) {
        this.sklad = sklad;
    }
    public void show () {
        System.out.println("name  = " + name);
        System.out.println("percent = " + percent);
        System.out.println("sklad = " + sklad);
    }
}
