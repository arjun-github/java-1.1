

 
public class Add
{
		static int a=22;
		static int b=33;
  static int add(int x, int y)
    {
        int carry;
        while(y!=0)
        {
            carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }
    public static void main(String args[])
    {
      
        System.out.println("The Sum is: "+add(a, b));
       
    }
}