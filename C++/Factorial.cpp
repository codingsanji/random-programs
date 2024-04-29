#include <iostream>
using namespace std;

void Factorial(int x){
	int i;
	if (x==0){
		cout<<"Factorial of 0 is 0";
	}
	if (x==1){
		cout<<"Factorial of 1 is 1";
	}
	for(int n=1 ; n<x ; n++){
		i=i*n;
	}
}

int main(){
	int x , i;
	cout<<"Enter your number: ";
	cin>> x;
	Factorial(x);
	cout<<"Factorial of "<<x<<" is "<<i;
}

