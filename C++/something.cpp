//Initialize y=0 and x=6. Then write the appropriate statements to print 
//x is greater than y on one line and then x is equal to 6 on the next line. 
//Do this using if statement.

#include <iostream>
using namespace std;

int main(){
	int y=0;
	cout<<"y:"<<y<<endl;
	int x=6;
	cout<<"x:"<<x<<endl;
	cout<<endl;
	
	//to print x is greater than y
	if (x>y){
		cout<<"x is greater than y"<<endl;
	}
	else{
		cout<<"x is smaller than y"<<endl;
	}
	
	//to print x is equal to 6
	if (x=6){
		cout<<"x is equal to 6"<<endl;
	}
	else{
		cout<<"x is equal to "<< x <<endl;
	}
}
