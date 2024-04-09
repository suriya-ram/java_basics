class Mobile
{
   int price;


   public Mobile()
   {
        System.out.println("i am a constructor");

   }

   static
   {
    System.out.println(" I am in static blolck");
   }
}


class staticblock
{  
    public static void main (String args[]){
    
        Mobile obj = new Mobile();
     
       
       
         Mobile obj2 = new Mobile();}

         //once object is created constructed is called before that static block is called.
         //suppose we did not create any object mean constructor and static block won't called.
         // class.forName("Mobile"); // static block will be executed
}