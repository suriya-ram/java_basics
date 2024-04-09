class Mobile
{
   String brand="iphone";
   int price=1000;
   static String name;

   public void show()
   {
         System.out.println(brand +" :"+ price + " :"+name);
   }

    public static void show1(Mobile obj)

    {
        System.out.println(obj.brand +":  "+ obj.price + " :"+name);
    }
}



class staticMethod
{
public static void main (String args[])
{
    
        Mobile obj = new Mobile();
        obj.price =100;
        obj.brand ="samsung";
        Mobile obj2 = new Mobile();
         
         Mobile.show1(obj); //static Method we need to declare like this
}
}