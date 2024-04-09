class hello{
    public static void main(String[] args){
         int a=7;
         int bx =0b101;//literals
         double d = 12e10;

         byte x =127;
         int y =x;
         byte ab=10;
         byte bc=20;
         int res = ab*bc;// type promotion mean byte * byte needs to be byte ,here we can store it in integer that is type promotion

// explicit casting mean big datatype to smaller datatype
    System.out.println("hello");
    System.out.println(bx);
    System.out.println(a);
    System.out.println(d);
    System.out.println(y);
    System.out.println(res);
} }