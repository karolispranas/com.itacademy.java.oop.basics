package Task1;

public class EmployeeManager {

    public static void main(String[] args) {
	Employee employee1 = new Employee("name1", "surname1", ContractType.Full_time,"2022-03-03", 800, "position1");
    Employee employee2 = new Employee("name2", "surname2", ContractType.Part_time,"2022-03-03", 800, "position2");
    Employee.Print(employee1);
    Employee.Print(employee2);

    }
}
