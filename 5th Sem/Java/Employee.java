import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {

  String empId;
  String depName;
  String empDesignation;
  String empName;
  String dateJoin;
  int basic;
  int hra;
  int it;
  char designationCode;
  public static int da;

  public Employee(
    String empId,
    String depName,
    String empDesignation,
    String empName,
    String dateJoin,
    int basic,
    int hra,
    int it,
    char designationCode
  ) {
    this.empId = empId;
    this.depName = depName;
    this.empDesignation = empDesignation;
    this.empName = empName;
    this.dateJoin = dateJoin;
    this.basic = basic;
    this.hra = hra;
    this.it = it;
    this.designationCode = designationCode;
  }

  public static int da(char designationCode) {
    switch (designationCode) {
      case 'e':
        {
          da = 20000;
          break;
        }
      case 'c':
        {
          da = 32000;
          break;
        }
      case 'k':
        {
          da = 12000;
          break;
        }
      case 'r':
        {
          da = 15000;
          break;
        }
      case 'm':
        {
          da = 40000;
          break;
        }
      default:
        throw new IllegalStateException("Unexpected value: " + designationCode);
    }
    return da;
  }

  public static int salary(int basic, int hra, int da, int it) {
    int salary = basic + hra + da - it;
    return salary;
  }

  public static void details(
    String empId,
    String empName,
    String depName,
    String empDesignation,
    int salary
  ) {
    System.out.println(
      "Emp Id\t\tEmployee Name\tDepartment\t\tDesignation\t\tSalary"
    );
    System.out.println(
      empId +
      "\t\t" +
      empName +
      "\t\t" +
      depName +
      "\t\t\t" +
      empDesignation +
      "\t\t" +
      salary
    );
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(
      new InputStreamReader(System.in)
    );
    String empId;
    int c = 0;
    Employee[] employees = new Employee[3];
    employees[0] =
      new Employee(
        "1001",
        "R&D",
        "Engineer",
        "Ash",
        "1/04/2009",
        20000,
        8000,
        3000,
        'e'
      );
    employees[1] =
      new Employee(
        "1002",
        "PM",
        "Consultant",
        "Anjali",
        "23/08/2012",
        30000,
        12000,
        9000,
        'c'
      );
    employees[2] =
      new Employee(
        "1003",
        "Acct",
        "Clerk",
        "Raju",
        "12/11/2008",
        10000,
        8000,
        1000,
        'k'
      );
    System.out.println("Enter the employee ID ");
    empId = bufferedReader.readLine();
    for (int i = 0; i < 3; i++) {
      if (employees[i].empId.equals(empId)) {
        c = 1;
        int salary = salary(
          employees[i].basic,
          employees[i].hra,
          da(employees[i].designationCode),
          employees[i].designationCode
        );
        details(
          employees[i].empId,
          employees[i].empName,
          employees[i].depName,
          employees[i].empDesignation,
          salary
        );
        break;
      }
    }
    if (c != 1) System.out.println("Entered employee ID not found");
  }
}
