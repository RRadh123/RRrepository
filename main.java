class Student
{
  int rollno;
  int age;
  String collegename;
  
  public Student()
  {
System.out.println("constructor one");
    collegename="MAGNA";
  }
  public Student(int r,int a)
  {
System.out.println("constructor second");
    rollno=r;
    age=a;
  }
  public void display()
  {
    System.out.println("Display method");
    System.out.println(rollno);
System.out.println(age);
System.out.println(collegename);

  }
}
class main
{
  
  public static void main(String args[])
  {
    Student s1=new Student();
Student s2=new Student(60,20);
s1.display();
s2.display();
 }
  
}    
    
    