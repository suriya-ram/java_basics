class capsule
{

    private int age;
    private String name;


    

        
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


class encapsulation
{
    public static void main(String args[])

    {
        capsule obj= new capsule();
        obj.setAge(10);
        obj.setName("suriya");

        System.out.println(obj.getAge() + " :" + obj.getName());
         //System.out.println(obj.getName());


    }
}