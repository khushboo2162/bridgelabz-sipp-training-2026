class Full_time_employee extends Employee {
     private  double monthlysalary;

     public Full_time_employee(String name, int employeeid, double monthlysalary) {
        super(name, employeeid); // call parent constructor 
        this.monthlysalary = monthlysalary;
}
public  double getmonthlysalary() {
    return monthlysalary;
}
 public void setmonthlysalary(double monthlysalary) {
    this.monthlysalary = monthlysalary;
 }
 public double calculateSalary() {
    return monthlysalary;}}

