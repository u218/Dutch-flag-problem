/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	int[ ] a={0,1,2,1,1,1,2,2,2,0,0,0,};
	int c0=0, c1=0, c2=0;
	for(int i =0;i<a.length;i++)
	{if(a[i]==0)
	{   c0+=c0;
	}
	if(a[i]==1)
	{ c1+=c1;
	}
	if(a[i]==2)
	{ c2+=c2;
	}
	}
	System.out.println(c0+c1+c2);
	}
}

