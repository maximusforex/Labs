public enum Gender {
    MALE(7,18){
        @Override
        public String toString(){
            return "I'm god";
        }
    },
    FEMALE(1,99){
        @Override
        public String toString() {
            return "I,m some woman";
        }
    };

    private int statusCode;
    private int age;
    private Gender(int statusCode,int age){
        this.statusCode = statusCode;
        this.age = age;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public int getAge() {
        return age;
    }


}
