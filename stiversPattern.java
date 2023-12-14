package pattern;
class stiversPattern 
{
	 static void pattern1(int n)
	 {
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 System.out.print("$");
			 }
			 System.out.println();
		 }
	 }
	 static void pattern2(int n)
	 {
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<=i;j++)
			 {
				 System.out.print("$");
			 }
			 System.out.println();
		 }
	 }
	 static void pattern3(int n)
	 {
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0+1;j<=i+1;j++)
			 {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
	 }
	 static void pattern4(int n)
	 {
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(i);
			 }
			 System.out.println();
		 }
	 }
	 static void pattern5(int n)
	 {
		 for(int i=0;i<n;i++)
		 {
			 for(int j=n;j>i;j--) 
			 {
				 System.out.print("$");
				 
			 }
			 System.out.println();
		 }
	 }
	 static void pattern6(int n)
	 {
		 for(int i=0;i<=n;i++)
		 {
			 for(int j=n;j>i;j--) 
			 {
				 System.out.print(n-j+1);
				 
			 }
			 System.out.println();
		 }
	 }
	 static void pattern7(int n)
	 {
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n-i-1;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=0;j<2*i+1;j++)
			 {
				 System.out.print("*");
			 }
			 for(int j=0;j<n-i-1;j++)
			 {
				 System.out.print(" ");
			 }
			 System.out.println();
		 }
	 }
	 static void pattern8(int n)
	 {
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<i;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=0;j<n*2-(2*i+1);j++)
			 {
				 System.out.print("*");
			 }
			 for(int j=0;j<i;j++)
			 {
				 System.out.print(" ");
			 }
			 System.out.println();
		 }
	 }
	 static void pattern9(int n)
	 {
		 //upperpart
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n-i-1;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=0;j<2*i+1;j++)
			 {
				 System.out.print("*");
			 }
			 for(int j=0;j<n-i-1;j++)
			 {
				 System.out.print(" ");
			 }
			 System.out.println();
		 }
		 //lowerpart
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<i;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=0;j<n*2-(2*i+1);j++)
			 {
				 System.out.print("*");
			 }
			 for(int j=0;j<i;j++)
			 {
				 System.out.print(" ");
			 }
			 System.out.println();
		 }
		 
	 }
	 static void pattern10(int n)
	 {
		                        /* 
Input Format: N = 3
Result: 
  *  
  **
  ***  
  **
  *   
Input Format: N = 6
Result:   
     *
     **
     *** 
     ****
     *****
     ******  
     *****
     ****
     ***    
     **
     *                         */
		for(int i=1;i<n*2;i++) 
		{	
			int stars=i;
			if(i>n) stars=2*n-i;
			for(int j=1;j<=stars;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	 }
 /*
Input Format: N = 3
Result: 
 1
 01
 101

Input Format: N = 6
Result:   
 1
 01
 101
 0101
 10101
 010101 */
	 static void pattern11(int n)
	 {	int start;
		 for(int i=1;i<=n;i++)
		 {	 
			 if(i%2==0)
		 	 {
				 start=0;
		 	 }
			 else
				 start=1;
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(start);
				 start=1-start;
			 }
			System.out.println();
		 }
	 }
	 /*
Input Format: N = 3
Result: 
1    1
12  21
123321

Input Format: N = 5
Result:   
1        1
12      21
123    321
1234  4321
1234554321
	  */
	 static void pattern12(int n)
	 { 
		 int space=2*n-2;
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(j);
			 }
			 for(int j=1;j<=space;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=i;j>=1;j--)
			 {
				 System.out.print(j);
			 }
			 System.out.println();
			 space-=2;
		 }
	 }
	 
	 /*
	  Input Format: N = 3
Result: 
1
2 3
4 5 6

Input Format: N = 6
Result:   
1
2  3
4  5  6
7  8  9  10
11  12  13  14  15
16  17  18  19  20  21 
	  */
	 static void pattern13(int n)
	 {
		 int num=1;
		 for(int i=1;i<=n;i++)
		 {
			 
			 for(int j=1;j<=i;j++)
			 {
				 
				 System.out.print(num+" ");
				 num++;

			 }
			 
			 System.out.println();
		 }
	 }
	 
	 /*Input Format: N = 3
Result: 
A
A B
A B C

Input Format: N = 6
Result:   
A
A B
A B C
A B C D
A B C D E
A B C D E F*/
	 static void pattern14(int n)
	 {
		 for(int i=1;i<=n;i++)
		 {
			 for(char j='A';j<='A'+i;j++)
			 {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
	 }
	 /*Input Format: N = 3
Result: 
A B C
A B
A

Input Format: N = 6
Result:   
A B C D E F
A B C D E 
A B C D
A B C
A B
A*/
	 static void pattern15(int n)
	 {
		 for(int i=0;i<n;i++)
		 {
			 for(char j='A';j<='A'+(n-i-1);j++)
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
	 }
	 /*Input Format: N = 3
Result: 
A
B B
C C C

Input Format: N = 6
Result:   
A 
B B
C C C
D D D D
E E E E E
F F F F F F*/
	 static void pattern16(int n)
	 {
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<=i;j++)
			 {
				 System.out.print((char)((int)('A'+i)) +" ");
			 }
			 System.out.println();
		 }
	 }
	 /*Input Format: N = 3
Result: 
  A  
 ABA 
ABCBA


Input Format: N = 6
Result:   
     A     
    ABA    
   ABCBA   
  ABCDCBA  
 ABCDEDCBA 
ABCDEFEDCBA*/
	 static void pattern17(int n)
	 {
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n-i-1;j++)
			 {
				 System.out.print(" ");
			 }
			 
			 int num=i+1;
			 int breakpoint=(2*i+1)/2;
			 
			 for(int j=0;j<2*i+1;j++)
			 {
				 System.out.print(num+"");
				 if(j<breakpoint) num++;
				 else 
					 num--;
			 }
			 
			 for(int j=0;j<n-i-1;j++)
			 {
				 System.out.print(" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public static void main(String[] args) 
	 {
		int n=5;
		pattern17(n);
	 }
}
