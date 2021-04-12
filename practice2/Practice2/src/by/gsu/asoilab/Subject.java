package by.gsu.asoilab;

public class Subject {


    private String name;
    private double volume;

    
    private Material material;

    public Subject(String name, double volume, Material material){
        this.material = material;
        this.name = name;
        this.volume =volume;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getMass(){
        return material.getDensity()*this.volume;
    }
    @Override
    public String toString() {
        return name + ";" + material + ";" + volume + ";" + getMass();
    }

}
