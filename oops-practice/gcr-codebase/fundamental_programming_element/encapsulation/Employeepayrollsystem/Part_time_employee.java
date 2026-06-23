public class Part_time_employee extends Employee {
    private double hourlyrate;
    private int hoursworked;

    public Part_time_employee(String name, int employeeid, double hourlyrate, int hoursworked) {
        super(name, employeeid); // call parent constructor
        this.hourlyrate = hourlyrate;
        this.hoursworked = hoursworked;
    }

    public double gethourlyrate() {
        return hourlyrate;
    }
    public void sethourlyrate(double hourlyrate) {
        this.hourlyrate = hourlyrate;
    }
    public void sethoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public int gethoursworked() {
        return hoursworked;
    }
    public double calculateSalary() {
        return hourlyrate * hoursworked;
    }
}
