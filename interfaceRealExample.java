class Computer
{
    public void code()
    {

    }
}

class Laptop extends Computer
{
    public void code()
    {
        System.out.println(" I will do coding ");
    }
}

class Desktop extends Computer
{
    public void code()
    {
        System.out.println(" I will do coding much faster");
    }
}

class Developer
{
    public void devapp(Computer lap)

    {    lap.code();
        //System.out.println("coding will be done ");
    }
}

public class interfaceRealExample
{

    public static void main(String args[])

    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer suriya = new Developer();
        suriya.devapp(desk);
       
    }
    
}