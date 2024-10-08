package ra.businessImp;

import ra.business.IEmployee;

import java.util.Scanner;

public class Employee implements IEmployee {
    private String id;
    private String name;
    private int year;
    private float rate;
    private float commission;
    private float salary;
    private boolean status;

    public Employee() {
    }

    public Employee(String id, String name, int year, float rate, float commission, float salary, boolean status) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.rate = rate;
        this.commission = commission;
        this.salary = salary;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập thông tin cho nhân viên : ");
        System.out.println("Id : ");
        this.id = scanner.nextLine();
        System.out.println("Name : ");
        this.name = scanner.nextLine();
        System.out.println("Year : ");
        this.year = Integer.parseInt(scanner.nextLine());
        System.out.println("Rate : ");
        this.rate = Float.parseFloat(scanner.nextLine());
        System.out.println("Commission : ");
        this.commission = Float.parseFloat(scanner.nextLine());
        System.out.println("Status : ");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("===============Thông tin nhân viên==========");
        System.out.println("Id : "+this.id);

        System.out.println("Name : "+this.name);

        System.out.println("Year : "+this.year);

        System.out.println("Rate : "+this.rate);

        System.out.println("Commission : "+this.commission);

        System.out.println("Status : "+(this.status? "Dang làm":"đã nghỉ"));
    }

    public double calSalary(){
        return  ((double) this.rate*BASIC_SALARY+(double)this.commission);
    }
}
