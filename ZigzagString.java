/*Question 2: The string "PAYPALISHIRING" is written in a
zigzag pattern on a given number of rows like this: (you may
want to display this pattern in a fixed font for better legibility)
P.......A........H.......N
..A..P....L....S....I...I....G
....Y.........I........R
And then read line by line: PAHNAPLSIIGYIR
Write the code that will take a string and make this conversion
given a number of rows:
string convert(string text, int nRows);
convert("PAYPALISHIRING"
, 3) should return
"PAHNAPLSIIGYIR"*/
import java.util.*;
class ZigzagString{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String s = sc.next();
		System.out.println("Enter the number of Rows:");
		int nRows=sc.nextInt();
		String zig="";
		String[] arr =new String[nRows];
		for(int i=0;i<nRows;i++)
			arr[i]="";
		if(nRows==1)
			System.out.print(s);
		int j=0,i=0;
		while (i<s.length()){
			while(j<nRows&&i<s.length()){
				
				arr[j++]+=s.charAt(i++);
			}
				j=j-2;
			while(j>=0&&i<s.length()){
				
				arr[j--]+=s.charAt(i++);
			}
			
				j=1;
		}
		System.out.println();
		for(int k=0;k<arr.length;k++)
		{	zig+=arr[k];	
		for(int l=0;l<arr[k].length();l++)
		{
			System.out.print(arr[k].charAt(l)+"  ");
		}
		System.out.println();
		}
		System.out.println();
		System.out.println("The zigzag String is:");
		System.out.print(zig);	
	}
}