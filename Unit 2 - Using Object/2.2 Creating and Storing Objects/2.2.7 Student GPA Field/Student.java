public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;
    
    public Student(String fName, String lName, int grade, double studentgpa)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        gpa = studentgpa;
    }
    
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel + " and has GPA: " + gpa;
    }
}