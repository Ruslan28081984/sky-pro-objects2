public class Main {

    public static void main(String[] args)
    {
        PersonService personService = new PersonService();
        Person ruslan = new  Person("Руслан", 37);
        if (personService.isAdult(ruslan)) {
            System.out.println("ты совершеннолетний");
        } else {
            System.out.println("иди в школу");
        }
        System.out.println(ruslan);
        ruslan.setAge(-5);

    }
}
