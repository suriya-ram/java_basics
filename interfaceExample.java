interface A{

    int age =22;
    String area="Mumbai";  // final and static variable inside the interface
   void show();
   void config();

}

interface X   // unlike abstract we can use 2,3 interface which implements using class
{
    void run();
}
interface Y extends X
{
   // class ---> class       extends
   // class ---> interface   implements
   //interface ---> interface  extends
}

class dummy implements A,Y
{
  public void show()

  {
    System.out.println("hey guys!");
  }

  public void config()
  {
      System.out.println("bye guys!");
  }

  public void run()
  {
    System.out.println("love u guys!");
  }
  }

public class interfaceExample{

    public static void main (String args[])
    {
         A obj = new dummy();
         obj.show();
         obj.config();

         Y obj1 = new dummy();
         obj1.run();
          System.out.println(A.area); // dont want any object to call them ,simply using interface is enough



      }
    }
    