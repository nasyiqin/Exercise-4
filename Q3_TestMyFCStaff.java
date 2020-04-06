import java.util.Scanner;

class MyFCStaff {

    private String name, id;
    private int hour;
    private double sale, commission, salary;

    public MyFCStaff(String name, String id, int hour, double sale) {
        this.name = name;
        this.id = id;
        this.hour = hour;
        this.sale = sale;
    }

    public double calculateCommission() {
        if (sale >= 150 && sale <= 300) {
            commission = 0.05 * sale;
        } else if (sale >= 301 && sale <= 500) {
            commission = 0.1 * sale;
        } else if (sale > 500) {
            commission = 0.15 * sale;
        }

        return commission;
    }

    public double calculateSalary() {
        salary = (hour * 8) + calculateCommission();
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getHour() {
        return hour;
    }

    public double getSale() {
        return sale;
    }

    public void displaySalary() {

        System.out.println("\nStaffName     : " + getName());
        System.out.println("StaffID       : " + getId());
        System.out.println("Hours Work    : " + getHour());
        System.out.println("Total Sale    : RM " + getSale());
        System.out.println("Total Salary  : RM " + calculateSalary());

    }
}

public class Q3_TestMyFCStaff{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name, id;
        int hour;
        double sale;

        System.out.print("Name: "); //staff name
        name = input.nextLine();
        System.out.print("ID: "); //staff id
        id = input.nextLine();
        System.out.print("Total Hours Work: ");
        hour = input.nextInt();
        System.out.print("Total Sales: ");
        sale = input.nextInt();

        MyFCStaff staff = new MyFCStaff(name, id, hour, sale);
        staff.displaySalary();
    }
}
