package by.gsu.pms;

import java.io.Serializable;

import java.util.Scanner;

public class Milk implements Serializable, Comparable<Milk>{
	 private String name;
	    private int percent;
	    private int sklad;

	    public Milk() {
	        this("", 0, 0);
	    }

	    public Milk(String name, int percent, int sklad) {
	        this.name = name;
	        this.percent = percent;
	        this.sklad = sklad;
	    }

	    public Milk(Scanner scanner){
	        this(scanner.next(), scanner.nextInt(), scanner.nextInt());
	    }

	    public Milk(String name, int price) {
	        this(name, price, 0);
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

	    @Override
	    public int compareTo(Milk milk) {
	        return percent - milk.getPercent();
	    }

	    @Override
	    public String toString() {
	        return "Milk{" +
	                "name='" + name + '\'' +
	                ", percent=" + percent +
	                ", sklad=" + sklad +
	                '}';
	    }

}
