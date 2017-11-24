
package chapter9;
//convertion array to numeric

public class convert05 
{
      public static void main(String[] args) {

       char[] string1 = new char[]{'-','3','2','7','6','8'};
       int si = Integer.parseInt(String.valueOf(string1));
       System.out.println(si);
       string1 = new char[]{'3','2','7','6','8'};
       si = Integer.parseInt(String.valueOf(string1));
       System.out.println(si);
      }
}
