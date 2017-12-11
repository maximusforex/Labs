public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivan",Gender.MALE);
        System.out.println(person);

        for(Gender gender:Gender.values()){
            //System.out.println(gender + " " + gender.ordinal());
            System.out.println(gender + " " + gender.getAge());
        }

//        System.out.println(Gender.values()[0].name());
//        System.out.println(Gender.values()[1]);
    }
}
