import java.util.Scanner;

class Staff {
    private String name, staffID;
    private double salary;
    private int workingDay;

    public void setStaffInfo(String nm, String id, int wDay){
        name=nm;
        staffID=id;
        workingDay=wDay;
    }
    public void calculateSalary(){
        salary = workingDay * 35.0;
    }
    public double getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String getStaffID(){
        return staffID;
    }
}//end class

class TestStaff {

    static Scanner console = new Scanner(System.in);

    public static void main(String arg[]){

        String name, staffID;
        int workingDay;
        double salary;

        System.out.print("Name: "); //staff name
        name = console.nextLine();
        System.out.print("ID: "); //staff id
        staffID = console.nextLine();
        System.out.print("Working Day: "); //staff working day
        workingDay = console.nextInt();

        Staff staff = new Staff();
        staff.setStaffInfo(name, staffID ,workingDay);
        staff.calculateSalary();

        System.out.println("======== Staff Info ========");
        System.out.println("Staff Name: " + staff.getName());
        System.out.println("Staff Id: " + staff.getStaffID());
        System.out.println("Staff Salary: RM " + staff.getSalary());
    }
}//end class
