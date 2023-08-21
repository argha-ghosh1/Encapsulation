class Student

{

	 private String name;

	 private Integer id;

	 private String address;

//setters
public void setName(String name)
{
    this.name=name;
}
public void setId(int id)
{
    this.id=id;
}
public void setAddress(String address)
{
    this.address=address;
}

//getters
public String getName()
{
    return name;
}
public int getId()
{
    return id;
}
public String getAddress()
{
    return address;
}
}
	/*  Student(String name,Integer id, String address){

		 this.name = name;

		 this.id = id;

		 this.address = address;

	 }

	 public void display()

	 {

		 System.out.println("Name is    :: "+name);

		 System.out.println("Id is      :: "+id);

		 System.out.println("Address is :: "+address);

	 }

}
*/

class Encap2
{
    public static void main(String args[])
    
        {

		 Student std = new Student();
         std.setName("Argha");
         std.setId(104);
         std.setAddress("kamarpukur");

         System.out.println("Name is" +std.getName());
         System.out.println("Id is :"+std.getId());
         System.out.println("Address is: " +std.getAddress());

	 }
    
} 





