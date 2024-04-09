class capsule
{

    private int age;
    private String name;


public capsule() //default constructor
{ age =35;
  name ="ramaa";
}
public capsule(int a,String n) // parameterized constructor
{
    age =a;
    name =n;
}

    

        
    public int getAge()
    {
        return age;
    }
     public String getName()
    {
        return name;
    }
    
    public void setAge( int age)
        {
            this.age = age;
        }
   
    public void setName(String name)
        {
           this.name = name;
        }
}


class constructor
{
    public static void main(String args[])

    {
        capsule obj= new capsule();
        capsule obj1 = new capsule(24,"yashhh");
        
       System.out.println(obj.getAge() + " :" + obj.getName());
       System.out.println(obj1.getAge() + " :" + obj1.getName());
         //System.out.println(obj.getName());


    }
}


//we can pass the value using constructor also;;