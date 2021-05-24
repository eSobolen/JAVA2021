package by.gsu.pms;

import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

public class MilkSerialization {

	private MilkSerialization(){}

    public static void serialize(Milk[] milks, String file) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(milks);
        } catch (Exception e) {
        }
    }

}
