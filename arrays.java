public class arrays
{
    public static void main (String args[])
    {
          int n1[][]= new int [3][4];

        // int random =(int) (Math.random()*100);
         for(int i =0; i<3;i++)
          {
             for(int j=0;j<4;j++)
             {
                n1[i][j] =(int) (Math.random()*10);
             }
             
          }


          for(int i =0; i<3;i++)
          {
             for(int j=0;j<4;j++)
             {
                System.out.print(n1[i][j] + " ");
             }
              System.out.println();
          }


    }
}





