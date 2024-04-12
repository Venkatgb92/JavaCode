import java.util.*;

class Student  {
    String name;
    int id;

    Student() {
        this.name="Admin";
        this.id=1;
    }

    Student(String name,int id)
    {
        this();
        this.name=name;
        this.id=id;
    }

    public String toString()
    {
        return "Student{name="+name+",id="+id+"}";
    }
    
}

class StudentSort implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {

        Integer id1=o1.id;
        Integer id2=o2.id;
        return id2.compareTo(id1);
        
    }
}

class sample  {

    public static void main(String[] args) {
        Student s1=new Student("Ram",55);
        Student s2=new Student("Arun",34);
        Student s3=new Student("Thilak",20);
        Student s4=new Student("Bala",14);
        Student s5=new Student();
        List<Student> students=new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        System.out.println(students);
        Collections.sort(students,new StudentSort());
        System.out.println(students);
        


    }
}