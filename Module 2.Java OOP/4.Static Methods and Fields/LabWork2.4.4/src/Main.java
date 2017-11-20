public class Main {
    public static void main(String[] args) {
        Employee newEmployee1 = new Employee("Maxim","Malikov","Programmer","0993687069");
        Employee newEmployee2 = new Employee("Vlad","Logvin","Web-developer","0669748939");
        Employee newEmployee3 = new Employee("Den","Komarov","Marketer","067564875");

        System.out.println("Number Of Employees : "+Employee.getNumberOfEmployees());

    }
}
