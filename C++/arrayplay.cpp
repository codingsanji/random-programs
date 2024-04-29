//Input and output an array of n elements from the keyboard then:
// 1. Find the largest element from the given array of integers
// 2. Output the sum of all prime numbers in the array 
// 3. Find all positions where the element has even value

#include <iostream>
using namespace std;

//Function to make and input an array
void MakeArr(int arr[ ] ,int n){
	for (int i=0 ; i<n ; i++){
		cout<<"Element "<<i<<": ";
		cin>>arr[i];
	}
}
//Function to display your array
void ShowArr(int arr[ ] , int n){
	cout<<endl;
	cout<<"The elements in your array are: "<<endl;
	for (int i=0 ; i<n ; i++){
		cout<<"Element "<<i<<": "<<arr[i]<<endl;
	}
}
//Function to find the largest element out of all the array elements
void LargestElAr(int arr[ ] , int n){
	for (int i=0 ; i<n ; i++){
		if (arr[0]<arr[i]){
			arr[0]=arr[i];
		}
	}
	cout<<endl;
	cout<<"Largest element in the array is "<< arr[0] <<endl;
}

//Ouputs the sum of all prime numbers in the array
void PrimeSumAr(int arr[ ] , int n){
	int sum=0;
	for (int i=0 ; i<n ; i++){
		int count=0;
		for (int x=2 ; x<=arr[i]; x++)
		{	
			if (arr[i]%x==0){
				count=count+1;
			}
		}
		if(count==1){
			sum+=arr[i];	
		}	
	}
	cout<<endl;
	cout<<"Sum of the prime numbers: "<<sum;
}	

//Find all positions where the element has even value
void ArrEveCheck(int arr[ ] , int n){
	cout<<endl;
	cout<<"Even numbers are found at positions: ";
	for (int i=0 ; i<n ; i++){
		if (arr[i]%2==0){
			cout<<i<<" ";
		}
	}
		
}

//Print out all the even elements
void PrintEve(int arr[] , int n){
    for (int i=1 ; i<=n ; i++){
        if (arr[i]%2==0){
            cout<<arr[i]<<" ";
        }
    }
}
	
int main(){
	cout<<"How many members are there in your array? :";
	int n;	int arr[1000];
	cin>> n;
	MakeArr(arr, n);
	ShowArr(arr, n);
	LargestElAr(arr, n);
	PrimeSumAr(arr , n); //some random mistake that my brain cant catch
	ArrEveCheck(arr, n);
	
	}
	






