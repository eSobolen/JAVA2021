
import by.gsu.pms.Emp;

public class Runner {
    public static void main(String[] args) {
        
        Emp[] emps = {
                new Emp("Anton", 24000, 5),
                new Emp("Zhenya", 18000, 2),
                null,
                new Emp("Mike", 35000, 6),
                new Emp("Vadim", 7000, 2),
                new Emp("Boris", 41000, 4),
                new Emp(),
        };

        //task 2
        for (Emp emp : emps) {
            if(emp != null) {
                emp.show();
                System.out.println("______________");
            }
        }

        //task 3
        emps[6].setExpenses(3000);

        //task 4
        System.out.println(emps[6]);
        System.out.println("Duration = " + (emps[0].getDays() + emps[5].getDays()));

        //task 5
        for (Emp emp : emps) {
            System.out.println(emp);
        }

        //task 6
        int totalExpenses = 0;
        for (Emp emp : emps) {
            if(emp != null){
                totalExpenses += emp.getTotal();
            }
        }
        System.out.println("Total expenses = " + totalExpenses);

        //task 7
        
        
       

    

        int maxTotal = 0;
        String account = " ";
        
        for (Emp emp : emps) {
            if(emp != null && emp.getTotal() > maxTotal){
                maxTotal = emp.getTotal();
                account = emp.getAccount();
               
            }
        }
        System.out.println("MaxTotal = " + account);
        
        
    }
}
