abstract class Employee{
    //encapsulation 
     private String name;
     private int employeeid;

     public Employee (String name , int employeeid){
        this.name=name;
        this.employeeid=employeeid;

     }
      public int getEmployeeid(){
        return employeeid;     }
        public void setEmployeeid(int employeeid){
            this.employeeid=employeeid;
        }
        public String getName(){
            return name;}

            public void setName(String name){
                   this.name=name;
            }
            public abstract double calculateSalary();
             public  void displayDetails(){
                System.out.println("Employee Name: "+name);
                System.out.println("Employee ID: "+employeeid);
                System.out.println("Salary: "+calculateSalary());
             }
            }