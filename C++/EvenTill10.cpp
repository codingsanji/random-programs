//Write a program that prints on the screen all the even numbers up to 10.

#include <iostream>
using namespace std;

int main(){
	int n;
	cout<<"The even number till 10 (included) are:"<<endl;
	for (int i=0 ; i<=10 ; i++){
		if (i%2==0){
			cout<<i<<" ";
		}
	}
}
