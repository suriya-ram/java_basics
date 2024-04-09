class Computers
{
    public String getMeApen()
    {
        return "pen";
    }

    public void  sleep()
    {
        System.out.println(" I am not sleeping");
    }
}

public class Computer{
    public static void main (String args[])

    {
        Computers obj = new Computers();
        obj.sleep();
        String res = obj.getMeApen();
        System.out.println(res);
    }
}