/*Question 3: Given a string s consists of upper/lower-case
alphabets and empty space characters ' ', return the length of the
last word in the string.
If the last word does not exist, return 0.
Note: A word is defined as a character sequence consisting of non-space characters only.
Example:
Given s = "Hello World",
return 5 as length("World") = 5
*/
import java.util.Scanner;
class LengthOfLastWord
{
    public static int lengthOfWord(String s)
    {
        String[] str=s.split(" ");
        if(str.length==0)
            return 0;
        return str[str.length-1].length();
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        System.out.print("The length of last word in string is: ");
        System.out.println(lengthOfWord(s));

    }
}
