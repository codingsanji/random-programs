#include <iostream>
using namespace std;

//CODE TO FIND LAST PRIME NUMBER B4 INPUTTED NUMBER
bool isPrime(int n){
	int count=0;
	if (n==1){
		return true;
	}
	for (int i=2 ; i<=n ; i++ )
	{	
		if (n%i==0){
			count=count+1;
		}
	}	
	if(count==1){
		return false;	
	}
	else{
		return true;
	}
	
}
void primeno (int n){
	if (n==1){
		cout<<"Please enter another number greater than 1 after running code again.";
	}
	for (int i=n-1 ; i>2 ; i--){
		if (isPrime(i)==false){
			cout<<i<<" is the last prime number before "<<n; 
			break;
		}
	}
}
int main () {
	int n;
	cout<<"Input a number to find the last prime number occurs before the number:  ";
	cin >> n;
	primeno(n);
}


