package Exercises;
// Q4
public class Author 
{
    String firstName, lastName;
    Author(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    void AuthoInfo()
    {
        System.out.println(firstName+" "+lastName); 
    }
    
    public static void main(String[] args) 
    {
        Author a = new Author("Virat", "Kohli");
        a.AuthoInfo();
    }
}