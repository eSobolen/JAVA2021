package idz1;

import idz1.Milks;

public class Runner {
	public static void main(String[] args) {
        Milks[] milk = {
                new Milks("Shalle", 2, 1),
                new Milks("Alps", 3, 0),
                new Milks("Milka", 4, 1),
                null,
                new Milks("Cows",2 , 0),
                new Milks("Land", 2, 1),
                new Milks("Joy", 3, 0),
                new Milks("Meadow", 2, 1),
                new Milks("Milk-world", 3, 0),
                new Milks("My-my", 2, 0),
        };
        int totalPercent=0;
        int totalSklad=0;
        for (Milks milks : milk) {
            if (milks != null){
                totalPercent+=milks.getPercent();
                milks.show();
                System.out.println("______________");
                if (milks.getSklad() != 0) {
                    totalSklad++;
                System.out.println();
                }
            }
        }
        float avgPercent=(float)totalPercent/(float)milk.length;
        System.out.println("Average percent of all milks = " + avgPercent);
        System.out.println("Milks on sklad = " + totalSklad);
    }
}
