#include <iostream>
using namespace std;


#CODE TO CHECK IF NUMBER IS PRIME
bool primeno (int n){
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
int main () {
	int n;
	cout<<"Enter your number: ";
	cin >> n;
	primeno(n);
	if (primeno(n) == true) {
		cout<<"Value is not prime";
	}
	else{
		cout<<"Value is prime";
	}
}


