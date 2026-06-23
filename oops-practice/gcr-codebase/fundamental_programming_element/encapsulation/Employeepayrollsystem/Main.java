public class Main {
    public static void main(String[] args) {
        Full_time_employee FullTime = new Full_time_employee("Aman", 101, 50000);
        Part_time_employee PartTime = new Part_time_employee("Rohit", 102, 200.0, 20);
        System.out.println("Full Time Employee Details:");
        FullTime.displayDetails();
        
        System.out.println("\nPart Time Employee Details:");
         PartTime.displayDetails();
         System.out.println("Part Time Salary: " + PartTime.calculateSalary());

    }
}
