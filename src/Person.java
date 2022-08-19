public class Person {
    private String name;
    private int age;


    public  Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < this.age) {
            throw new IllegalArgumentException("Новый возраст меньше, чем текущий! ");
        }
        if (age < 0) {
            throw new IllegalArgumentException("возраст не может быть отрицательным");
        }
        this.age = age;
    }

    public String toString() {

        return " имя " + this.name + " возраст " + this.age;
    }



}
