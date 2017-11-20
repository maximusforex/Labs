public class Employee {
   private String firstName;
   private String lastName;
   private String profession;
   private String telephoneNumber;
   private static int numberOfEmployees;

   public Employee(String firstName,String lastName,String profession,String telephoneNumber){
       this.firstName=firstName;
       this.lastName=lastName;
       this.profession=profession;
       this.telephoneNumber=telephoneNumber;
       System.out.println(firstName+" "+lastName+" "+profession+" "+telephoneNumber);
       numberOfEmployees++;
   }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}
