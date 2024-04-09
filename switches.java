public class switches {
    public static void main(String[] args) 
    {
        int n =2;
        int result;
        switch(n)
         {
        case 1:
        System.out.println("monday");
        break;

        case 2:
        System.out.println("wednesday");
        break;

        case 3:
        System.out.println("tsunday");
        break;
       };
 result = (n%2==0)?10:20;
 System.out.println(result); 
        
    }
    
}
