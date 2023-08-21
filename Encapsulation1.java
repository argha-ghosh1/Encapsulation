class Student
{
    private int age;
    private String name;


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void show()
    {
        System.out.println(age +"  "+ name);
    }
}
public class Encapsulation1
{
    public static void main(String args[])
    {
        Student es1=new Student();
        Student es2=new Student();
        es1.setAge(25);
        es2.setAge(30);
        //es1.setdata2("argha");
        es1.setName("Argha");
        es2.setName("Dip");
        //es.age=10;
       // es.name="Vutu";
       //es1.show();
        //es2.show();
        int stud1Age=es1.getAge();
        String stud1Name=es2.getName();
        System.out.println(stud1Age);
        System.out.println(stud1Name);

    }
}