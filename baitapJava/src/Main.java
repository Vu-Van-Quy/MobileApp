
import com.quy.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static List<Employee> employeeList = new ArrayList<>();

//    public EmployeeManagement() {
//        employeeList = new ArrayList<>();
//    }

//    public static void add(Employee employee) {
//        employeeList.add(employee);
//    }

    static Scanner sc = new Scanner(System.in);

    public static void addEmployee(){
        int id, age;
        long salaryRate;
        String name, department, code;

        System.out.println("Enter info: ");
        System.out.print("ID: ");
        id = sc.nextInt();

        sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Age: ");
        age = sc.nextInt();

        sc.nextLine();
        System.out.print("Department: ");
        department = sc.nextLine();

        System.out.print("Code: ");
        code = sc.nextLine();

        System.out.print("Salary rate: " );
        salaryRate = sc.nextLong();

        Employee employee = new Employee(id, name, age, department, code, salaryRate);

        employeeList.add(employee);
    }


    public static void show(){
        for (Employee employee : employeeList) {
            System.out.println("ID :"+ employee.getId()+
                    ", name: " + employee.getName()+
                    ", age: " + employee.getAge()+
                    ", department: " + employee.getDepartment()+
                    ", code: " + employee.getCode()+
                    ", salary: " + employee.getSalaryRate()
            );
        }
    }

    public static void remove(){
        System.out.println("Nhập ID cần xóa:");
        int id =sc.nextInt();
        for (Employee employee : employeeList){
            if(employee.getId() == id){
                employeeList.remove(employee);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Employee employee1  = new Employee(1,"Quy", 23, "cntt", "VuVanQuy", 15000);
        Employee employee2  = new Employee(2,"Quy", 23, "cntt", "VuVanQuy", 15000);
        Employee employee3  = new Employee(3,"Quy", 23, "cntt", "VuVanQuy", 15000);
        Employee employee4  = new Employee(4,"Quy", 23, "cntt", "VuVanQuy", 15000);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
//        addEmployee();
        show();
        remove();
        show();
    }
}
