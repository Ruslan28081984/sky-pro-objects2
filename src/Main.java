public class Main {




    public static void main(String[] args)
    {
        Person ruslan = new  Person("Руслан", 37, 75);
        System.out.println(ruslan.getName() + " " + ruslan.getAge());
        ruslan.setAge(38);
        System.out.println("ruslan.getAge() = " + ruslan.getAge());
        ruslan.setAge(39);
        System.out.println("ruslan.getAge() = " + ruslan.getAge());
        ruslan.setWeight(81);
        System.out.println("ruslan.getWeight() = " + ruslan.getWeight());
        ruslan.setWeight(74);
        System.out.println("ruslan.getWeight() = " + ruslan.getWeight());
    }
}
