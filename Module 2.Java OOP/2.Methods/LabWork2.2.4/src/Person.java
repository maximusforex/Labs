public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;

    public void Information (String firstName){
        System.out.println(firstName);
    }
    public void Information(String firstName,String lastName){
        System.out.println(firstName+" "+lastName);
    }
    public void Information(String firstName,String lastName,int age){
        System.out.println(firstName+" "+lastName+" "+age);
    }
    public void Information(String firstName,String lastName,int age,String gender){
        System.out.println(firstName+" "+lastName+" "+age+" "+gender);
    }
    public void Information(String firstName,String lastName,int age,String gender,int phoneNumber){
        System.out.println(firstName+" "+lastName+" "+age+" "+gender+" "+phoneNumber);
    }
}
