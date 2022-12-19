class Employee {
    int ID;
    PersonalInformation personalInfo;
    Department dept;

    public Employee(int ID,String name, int phoneNumber, Department dept) {
        this.ID = ID;
        this.personalInfo = new PersonalInformation("Mariam", 5546);
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                " " + personalInfo +
                " " + dept +
                '}';
    }
}
class  PersonalInformation {
    String name;
    int phoneNumber;
    public PersonalInformation(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PersonalInformation{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

class Department {
    int depNo;
    String depName;

    public Department(int depNo, String depName) {
        this.depNo = depNo;
        this.depName = depName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depNo=" + depNo +
                ", depName='" + depName + '\'' +
                '}';
    }
}

public class Association {

    public static void main(String[] args) {
        Department d = new Department(2,"IT");
        Employee e = new Employee(215,"Mariam",5546,d);
        System.out.println(e);
    }
}
