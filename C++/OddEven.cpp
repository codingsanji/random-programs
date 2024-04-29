//Write a program that tells you if a number is even or odd.

#include <iostream>
using namespace std;

//to check if value is odd or even
void OddEve(int n){
	if (n%2==0){
	cout<<n<<" is an even number.";
		}
	else{
	cout<<n<<" is an odd number."; 
	}
}

int main(){
	int n;
	cout<<"Enter your number:";
	cin>>n;
	OddEve(n);
}
