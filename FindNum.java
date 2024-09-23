  public class FindNum
   {
      public static void main (String [] args)
      {
      double randomnum = Math.random()*7;
      
      while (randomnum < 6.9999)
         {
         randomnum = Math.random()*7;
         System.out.println(randomnum);
         }
      }
   }