// Call a constructor from another constructor
public class Student
{
	private String name;
	private int id;
	private float gpa;
	public Student(String name)
	{
		this.name = name;	
	}
	public Student(String name, int id)
	{
		this.name = name;
		this.id = id;	
	}
	public Student(float gpa)
	{
		this.gpa = gpa;	
	}
	public Student(String name, int id, float gpa)
	{
		this(name,id);
		this.gpa = gpa;	
	}
	public void printStudent()
	{
		System.out.println("Name = " + this.name + ", ID = " + this.id + ", GPA = " + this.gpa);
	}

	public static void main(String[] args)
	{
		Student st = new Student("Dave",1234,3.5f);
		st.printStudent();	
	}
}