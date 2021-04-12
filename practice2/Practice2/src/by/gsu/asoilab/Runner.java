package by.gsu.asoilab;

public class Runner {


    public static void main(String[] args) {
	 Material steel = new Material("steel", 7850);
	 Material copper = new Material("copper", 8500);
	 Subject wire = new Subject("wire",0.3,steel);

	 System.out.println(steel.toString());
	 System.out.println(copper.toString());
	 System.out.println(wire.toString());
	 wire.setMaterial(copper);
	 System.out.println(wire.toString());
    }

}
