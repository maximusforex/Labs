
public class Employee {
    public void calculateSalary(String name, double... varargs) {

        String yourName = ("Your name is " + name + "\n");

        double sum = 0;
        for (int i = 0; i < varargs.length; i++) {
            sum += varargs[i];
        }
        String resultOfAmount = ("The amount of your salaries = " + sum);
        String nameAndAmount = yourName + resultOfAmount;
        System.out.println(nameAndAmount);
    }
}

