
package chapter9;
//convertion boolean to shortword(integer)

public class Convert00 
{

    public static void main(String[] args) {
     boolean b = false;
     short sw = (short)(b ? 1 : 0);
     System.out.println(sw);
     b = true;
     sw = (short)(b ? 1 : 0);
     System.out.println(sw);
    }
    
}
