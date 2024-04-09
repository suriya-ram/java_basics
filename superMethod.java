class A
{
    public A() 


    {      super();      // in every constructor,super method is present,, super method calls the parent class
        System.out.println(" I am in A default");
    }

    public A(int n)
    {

          super();
        System.out.println(" I am in A parameterized");
    }
}

class B extends A

{

    public B()
    {     super();
    System.out.println(" I am in B default");
    }
    public B(int n)
    {     
        super();
        System.out.println(" I am in B parameterized");
    }
}


class superMethod
{
    public static void main(String args[])

    {
             B obj = new B();
             B obj1 = new B(5);
             
    }
}