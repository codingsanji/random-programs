#include <iostream>
using namespace std;

//Write a program that checks if the angles given can make a triangle or not (their sum must be 180 degrees).

//Make an array of the angles
int i;
void MakeArr(int arr[ ] ,int n){
	for (int n=1 ; n<4 ; n++){
		cout<<"Angle "<<n<<": ";
		cin>>arr[n];
	}
}

//To check if it will form a triangle or not
void TrangleCheck(int arr[ ] , int n){
	int sum=0;
	for(int n=1 ; n<4 ; n++){
		sum+=arr[n];
	}
	cout<<"The total angle of the triangle is "<<sum;
	cout<<endl;
	if (sum==180){
		cout<<"The given angles make a triangle.";
	}
	else{
		cout<<"The given angles don't make a triangle.";
	}
	
}

int main(){
	cout<<"Program that checks if the angles given can make a triangle or not (their sum must be 180 degrees).";
	cout<<endl;
	int i , n;
	int arr[3];
	MakeArr(arr , n);
	TrangleCheck(arr , n);
	
	
}
