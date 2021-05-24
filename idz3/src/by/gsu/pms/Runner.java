package by.gsu.pms;

import by.gsu.pms.Milk;

import by.gsu.pms.MilkDeserialization;
import by.gsu.pms.MilkSerialization;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		final int MAX_MILKS = 10;
        Milk[] milks = new Milk[MAX_MILKS];
        final String CSV_FILE = "src/milk.scv";
        
        try (Scanner scanner = new Scanner(new FileReader(CSV_FILE))) {
            for (int i = 0; i < MAX_MILKS; i++) {
                milks[i] = new Milk(scanner);
            }
            final String DAT_FILE = "src/milk.dat";

            MilkSerialization.serialize(milks, DAT_FILE);
            milks = MilkDeserialization.deserialize(DAT_FILE);

            int totalPercent = 0;
            int totalSklad = 0;

            for (Milk milk : milks) {
                System.out.println(milk);

                if (milk == null) {
                    continue;
                }
                if (milk.getSklad()!=0) {
                    totalSklad++;
                }
                totalPercent += milk.getPercent();
            }
            float averPercent=(float)totalPercent/(float)milks.length;
            System.out.println("averPercent = " + averPercent);
            System.out.println("Number of milks on sklad = " + totalSklad);
        }catch (FileNotFoundException e){
            System.err.println("File not found");
        }
    }
}


