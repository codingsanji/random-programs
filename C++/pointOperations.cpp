#include <iostream>
using namespace std;

//new data type---point
struct point{
	int x;
	int y;
};

//input point
void inputpoint(point &n){
	cout<<"Input value of x: ";
	cin>>n.x;
	cout<<"Input value of y: ";
	cin>>n.y;	
}

//print point
void printpoint(point n){
	cout<<"Given point is: ";
	cout<<"("<<n.x<<","<<n.y<<")"<<endl;
}

//Write a function to calculate the distance between 2 points





//Find the point farthest from the origin among the n points just entered


int main(){
	point a , b ;
	inputpoint(a);
	printpoint(a);
	inputpoint(b);
	printpoint(b);
	
}
