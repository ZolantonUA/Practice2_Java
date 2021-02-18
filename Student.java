public class Student
{
    String surname;
    static int id = 0;
    public static int number;

    Student(String surname)
    {
        number++;
    }

    public static void main(String[] args)
    {
        Student student1 = new Student("Zolotykhin");
        Student student2 = new Student("Plakhonin");
        Student student3 = new Student("Karmazin");
        Student student4 = new Student("Pokosenko");
        Student student5 = new Student("Nadtoka");
        Student student6 = new Student("Korobko");


        System.out.print("Quantity students: ");
        System.out.print(number);
    }
}