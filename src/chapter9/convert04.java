package chapter9;
//convertion numeric to array

public class convert04 
{
  public static void main(String[] args) 
  {
   int si = -32768;
   char[] string1 = String.valueOf(si).toCharArray();
   System.out.println(string1);
   string1 = String.valueOf(si).toCharArray();
   System.out.println(string1);
  }

}