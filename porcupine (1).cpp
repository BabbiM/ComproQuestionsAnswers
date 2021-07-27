#include<iostream>
#include<conio.h>
#include<stdlib.h>
#include<math.h>

using namespace std;

int isPrime (int x)
{
	int counter=2;
	while (counter<=ceil (x/counter))
	{
		if (!(x%counter))
			return 0;
		else
			counter++;
	}
	return 1;
}

int findPorcupineNumber(int n)
{
	//The objective is to find the next number greater than n that ends with 9
	//myNumber is assigned n+1 inorder to avoid the case where n ends with 9; resulting termination of the while loop and making the next number ending with 9 n itself
	int myNumber=n+1;
	while (myNumber%10!=9)
		myNumber++;
	
	cout<<"\nThe next number greater than "<<n<<" that end with 9 is "<<myNumber;
	
	while (1)
	{
		if (isPrime(myNumber))
		{
			cout<<"\nmyNumber:\t"<<myNumber;
			int counter=1;
			while(counter<=9)
			{
				if (isPrime(myNumber+counter))
					break;
				counter++;
			}
			cout<<"\nCounter: \t"<<counter<<endl;
			if (counter==10)
			{
				if (isPrime(myNumber+10))
					return myNumber;
			}
								
		}	
		myNumber+=10;
	}	
}

int main ()
{
	x:system ("cls");
	cout<<"\nEnter your number\t";
	int n;
	cin>>n;
	
	cout<<"\nThe porcupine number next to "<<n<<" is\t"<<findPorcupineNumber(n);
	cout<<"\n\nPress any key to continue or 'q' to quit\t";
	if (getch ()!='q')
		goto x;
		
/*	cout<<"\nNumbers less than "<<n<<" and ends with 9 are\n";
	
	int counter=1;
	
	while (9*counter+(counter-1)<=n)
	{
		cout<<9*counter+(counter-1)<<endl;
		counter++;
	}
	cout<<"\nThe number of these numbers is \t"<<counter-1;
*/
	return 0;
}
