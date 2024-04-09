import java.util.*;

class Trial
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}


class Trialz extends Trial
{

    public int add(int n1,int n2)
    {
        return n1+n2+1;
    }
}


public class Overriding
{
   public static void main(String args[])

   {
     Trialz obj = new Trialz();
     int r=obj.add(3,4);
     System.out.println(r);

   } 
}