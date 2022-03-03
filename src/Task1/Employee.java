package Task1;

public class Employee {

    private String name;
    private String surname;
    private ContractType contractType;
    private String contractStartDate;
    private Double salary;
    private String position;

    public Employee(String name, String surname, ContractType contractType, String contractStartDate, double salary, String position ){
        this.name = name;
        this.surname = surname;
        this.contractType = contractType;
        this.contractStartDate = contractStartDate;
        this.salary = salary;
        this.position = position;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String newName) {
        this.surname = newName;
    }
    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType type) {
        this.contractType = type;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public static void Print(Employee employee){
        System.out.println(employee.name +" "+ employee.surname+" "+ employee.contractType+" "+employee.contractStartDate+" "+employee.salary+" "+employee.position);
    }


}
