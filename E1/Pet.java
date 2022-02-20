package Exercises;
// Q2
public class Pet 
{
    String name, animal;
    int age;
    Pet(String animal, String name, int age)
    {
        this.animal = animal;
        this.name = name;
        this.age = age;
    }
    void setAnimal(String animal)
    {
        this.animal = animal;
    }
    void setName(String name)
    {
        this.name = name;
    }
    void setAge(int age)
    {
        this.age = age;
    }
    String getAnimal()
    {
        return animal;
    }
    String getName()
    {
        return name;
    }
    int getAge()
    {
        return age;
    }
    public static void main(String[] args) 
    {
        Pet p = new Pet("Cat", "Shadow", 9); 
// if values will not be assigned by set functions, these constructor values will get stored in the fields
        p.setAnimal("Dog");
        p.setName("Maggy");
        p.setAge(4);
        System.out.println("Animal Field = "+p.getAnimal());
        System.out.println("Pet Name = "+p.getName());
        System.out.println(p.getName()+"'s age = "+p.getAge());
    }
}