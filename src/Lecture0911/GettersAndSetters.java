package Lecture0911;

public class GettersAndSetters {
    public static void main(String[] args) {
        GettersAndSetters ex1 = new GettersAndSetters();
        GettersAndSetters ex2 = new GettersAndSetters();

        ex1.setAge(45);
        ex1.getAge();
        ex1.setAge(33);
        ex1.getAge();
    }
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age >=0){
            this.age = age;
        }
    }
}
