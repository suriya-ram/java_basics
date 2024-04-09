class Mobile
{
    String brand;
    int price;
   static String name;  //the static keyword make the name as common
    public void show()
    {
        System.out.println(brand + ":"+ price + ":" + name);
    }
}


class statickeyword
{
    public static void main(String args[])
    {
        Mobile obj = new Mobile();
        obj.brand ="iphone";
        obj.price =1400;
        Mobile.name ="smartphone"; // we declared name as static thats why we need to specify with class (mobile.name),we can also use obj.name but correct one is mobile.name


         Mobile obj2 = new Mobile();
        obj2.brand ="samsung";
        obj2.price =1500;
        Mobile.name ="smartphone";


        obj.name = "phone";// obj and obj2 name will be modified to phone ,because it is declared as static

        obj.show();
        obj2.show();
    }
}