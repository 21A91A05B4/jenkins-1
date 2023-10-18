/*class First
{
  public static void main(String args[])
  {
     System.out.println("welcome to java programming");
  }
}



class Commandline
{
   public static void main(String args[])
   {
	int x=20,y=10,z=15;
	if(x>y++ && y++>z)
	   System.out.println(x+" "+y);
	else
	   System.out.println(y+" "+z);
   }
}
class Bitwise
{
	public static void main(String args[])
	{
		int x=7,y=10;
		System.out.println(~(x&y));
	}
}

import java.util.*;
class Terinary
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int age;
		age=sc.nextInt();
		String result=age>=18?"You are eligible to vote":"You are not eligible to vote";
		System.out.println(result);
	}
}
import java.util.*;
class Op
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x,y;
		x=sc.nextInt();
		sc.nextLine();
		y=sc.nextInt();
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(true && true);
		

	}
}



import java.util.*;
class Vowel
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		ch=sc.nextLine().charAt(0);
		ch=Character.toLowerCase(ch);
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
		   System.out.println(ch+" is a vowel");
		else
		   System.out.println(ch+" is not a vowel");
		  sc.close(); 
	}
}

*/
/*

import java.util.*;
class Vo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		ch=sc.nextLine().charAt(0);
		ch=Character.toLowerCase(ch);
		switch(ch)
		{
			case 'a':
				System.out.println(ch+" is a vowel");
				break;
			case 'e':
				System.out.println(ch+" is a vowel");
				break;
			case 'i':
				System.out.println(ch+" is a vowel");
				break;
			case 'o':
				System.out.println(ch+" is a vowel");
				break;
			case 'u':
				System.out.println(ch+" is a vowel");
				break;
			default:
				System.out.println(ch+" is not a vowel");
		}
		sc.close();
	}
}

*/
/*

import java.util.*;
class Vo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		ch=sc.nextLine().charAt(0);
		ch=Character.toLowerCase(ch);
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(ch+" is a vowel");
				break;
			default:
				System.out.println(ch+" is not a vowel");
            }
sc.close();
}
}*/
/*

import java.util.*;
class Mo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		ch=sc.nextInt();
		switch(ch)
		{
			case 3:
			case 4:
			case 5:
				System.out.println(ch+" is Summer");
				break;
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println(ch+" is rainy");
				break;
		      case 10:
			case 11:
			case 12:
			case 1:
			case 2:
				System.out.println(ch+" is winter");
				break;

			default:
				System.out.println(ch+" is not valid month");
            }
sc.close();
}
}




import java.util.*;
import java.lang.*;
class Quad
{
	public void static main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		float d;
		a=sc.nextInt();
		sc.newLine();
		b=sc.nextInt();
		sc.newLine();
		c=sc.nextInt();
float r1,r2;
		d=(b*b)-(4*a*c);
		if(d>0)
		{
			r1=((-b)+sqrt(d))/(2*a);
			r1=((-b)-sqrt(d))/(2*a);
			System.out.println(r1+" "+r2);

		}
		
	}
sc.close();
}



import java.util.*;
class tri
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	a=sc.nextInt();
	sc.nextLine();
	b=sc.nextInt();
	sc.nextLine();
	c=sc.nextInt();
	if(a+b+c==180)
	{
	  System.out.println("valid");
	}
	else
	{
	  System.out.println("invalid");
	}
  }
}





import java.util.*;
class tri
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	a=sc.nextInt();
	sc.nextLine();
	b=sc.nextInt();
	sc.nextLine();
	c=sc.nextInt();
	if(a==b && b==c && a==c)
	{
	  System.out.println("equilateral triangle");
	}
	else if(a==b || b==c || a==c)
	{
	  System.out.println("isoceles triangle");
	}
	else
	{
	  System.out.println("scalene triangle");
	}
  }
}



import java.util.*;
class prime
{
  public static void main(String args[])
  {
	for(int i=2;i<=100;i++)
	{
        int c=0;
	  for(int j=1;j<=i;j++)
	  {
		if(i%j==0)
		{
		  c+=1;
		}
	  }
       if(c==2)
       {
          System.out.println(i);
	 }
     }
  }
}


import java.util.*;
class prime
{
  public static void main(String args[])
  {
	for(int i=2;i<=100;i++)
	{
        int c=0;
	  for(int j=1;j<=i;j++)
	  {
		if(i%j==0)
		{
		  c+=1;
		}
	  }
       if(c==2)
       {
          System.out.println(i);
	 }
     }
  }
} 
 



import java.util.*;
class first{
		public static int add(int a,int b)
		{
		  return a+b;
		}
		public static int sub(int a,int b)
		{
		  return a-b;
		}
		public static int mul(int a,int b)
		{
		  return a*b;
		}
		public static int div(int a,int b)
		{
		  return a/b;
		}
		public static int mod(int a,int b)
		{
		  return a%b;
		}
	

		public static void main(String args[])
		{
		   
		  Scanner sc=new Scanner(System.in);
		  int ch,x,y,res;
		  while(true)
		  {
			System.out.println("1.Addition\n2.Subtraction\n3.multiplication\n4.division\n5.modulous_division\n6.exit");
			System.out.println("Enter  your choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				  x=sc.nextInt();
			 	  y=sc.nextInt();
			        res=add(x,y);
				  System.out.println("sum="+res);
				  break;
				case 2:
				  x=sc.nextInt();
			 	  y=sc.nextInt();
			        res=sub(x,y);
				  System.out.println("dif="+res);
				  break;
                        case 3:
				  x=sc.nextInt();
			 	  y=sc.nextInt();
			        res=mul(x,y);
				  System.out.println("mul="+res);
				  break;
				case 4:
				  x=sc.nextInt();
			 	  y=sc.nextInt();
			        res=div(x,y);
				  System.out.println("div="+res);
				  break;
				case 5:
				  x=sc.nextInt();
			 	  y=sc.nextInt();
			        res=mod(x,y);
				  System.out.println("mod="+res);
				  break;
				case 6:
				  	System.exit(0);
					
				default:
				  System.out.println("invalid choice");
			}




		  }
		}

}



import java.util.*;
class arr{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  int n,x[],i;
	  n=sc.nextInt();
	  x=new int[n];
	  for(i=0;i<n;i++)
		x[i]=sc.nextInt();
	  for(i=0;i<n;i++)
		System.out.print(x[i]+" ");
	}


}




import java.util.*;
class arr2{
	public static int findsl( int arr[],int size)
	{
             int max1=0,max2=0;
		for(int i=0;i<size;i++)
		{
		  if(arr[i]>max1)
			max1=arr[i];
		}
	       for(int i=0;i<size;i++)
		{
			if(arr[i]!=max1 && arr[i]>max2)
			{
				max2=arr[i];
			}
		}
		return max2;
	}
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  int n,x[],l,i;
	  n=sc.nextInt();
	  x=new int[n];
	  for(i=0;i<n;i++)
		x[i]=sc.nextInt();
	  l=findsl(x,n);
	  System.out.println(l);
	}


}






import java.util.*;
class arr2{
	public static boolean issorted( int arr[],int size)
	{
             
		for(int i=1;i<size;i++)
		{
		  if(arr[i]<arr[i-1])
			return false;
		}
	       
		return true;
	}
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  int n,x[],l,i;
	  n=sc.nextInt();
	  x=new int[n];
	  for(i=0;i<n;i++)
		x[i]=sc.nextInt();
	   
	  System.out.println(issorted(x,n));
	}


}
*/

import java.util.*;
class mainclass{
	public static void main(String args[]){
		System.out.println("first java file");
}
}































