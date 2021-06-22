import java.util.*;
package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    Stack<Integer> stack = new Stack<Integer>();
 
   
 
    while (n != 0)
    {
      int d = n % 2;
      stack.push(d);
      n /= 2;
    } 
 string s;
    while (!(stack.isEmpty() ))
    {
      s=s+stack.pop();
    }
return s;
  
  }
}
