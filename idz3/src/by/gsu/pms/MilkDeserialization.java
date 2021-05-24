package by.gsu.pms;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class MilkDeserialization {
	private MilkDeserialization(){}
	public static Milk[] deserialize(String file) {
	   try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
	       return (Milk[]) inputStream.readObject();
	   } catch (Exception e) {
	       return new Milk[0];
	   }
    }
}
