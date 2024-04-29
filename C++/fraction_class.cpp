#include <iostream>
using namespace std;

//new data type---fraction
struct fraction{
	int x;
	int y;
};

//input fraction
void inputFraction(fraction &n){
	cout<<"Input numerator: ";
	cin>>n.x;
	cout<<"Input denominator: ";
	cin>>n.y;	
}

//print fraction
void printFraction(fraction n){
	cout<<"Given fraction is: ";
	cout<<n.x<<"/"<<n.y<<endl;
}

//add fractions
fraction plusOperate(fraction a , fraction b){
	fraction result;
	result.x=a.x*b.y+a.y*b.x;
	result.y=a.y*b.y;
	return result;
}

//make an array to store inputted fractions
void MakeArr(fraction arr[ ] ,int n){
	for (int i=0 ; i<n ; i++){
		cout<<"Fractions:";
		inputFraction(arr[i]);
	}
}

//show the fractions in the array
void ShowArr(fraction arr[ ] , int n){
	cout<<endl;
	cout<<"The fractions in your array are: "<<endl;
	for (int i=0 ; i<n ; i++){
		cout<<"Fraction "<<i<<": "<<arr[i]<<endl;
	}
}

//check in array and return the biggest fraction
void LargestElAr(fraction arr[ ] , int n){
	for (int i=0 ; i<n ; i++){
		if (arr[0]<arr[i]){
			arr[0]=arr[i];
		}
	}
	cout<<endl;
	cout<<"Largest fraction in the array is "<< arr[0] <<endl;
}


int main(){
	fraction a , b;
//	inputFraction(a);
//	inputFraction(b);
//	printFraction(a);
 //	fraction result = plusOperate(a , b);
 //	printFraction(result);
 	
 	cout<<"How many fractions are there in your array? :";
	int n;
	fraction arr[1000];
	cin>> n;
	MakeArr(arr, n);
	ShowArr(arr , n);
 	
 	return 0;
 	
}
