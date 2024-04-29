//Define a class for fractions

#include <iostream>
using namespace std;

class fractions {
public:
	double fractions(numerator , denominator);
	int GetNum();
	int SetNum();
	int GetDenom();
	int SetDenom();
	int Add(fractions);
	void simplify();
	bool IsEqual(fractions);

private:
   
   
};


int numerator , denominator;
double fractions(numerator , denominator){
	if (denominator == 0){
        cout << " Denominator cant be zero." << endl;
    }
    else if (numerator ==0){
        cout<<" 0/ "<< denominator <<" = 0 "<< endl;
	}
	else {
        cout << numerator << "/" << denominator << endl;
	}      	
}
int fractions::GetNum(){
	return numerator;	
}
int fractions::SetNum(int x){
	numerator=x;
}
int fractions::GetDenom(){
	return denominator;	
}
int fractions::SetDenom(int x){
	denominator=x;
}
int fractions::Add(fractions x){
	num = numerator*x.GetDenom()+denominator*GetNum();
	denom = denominator * x.GetDenom();
	cout<< "output = " << num << "/" << denom
}
void fractions::simplify(){
	int MD=FindMaxDivisor(num , denom);
	num=num/MD; 
	denom=denom/MD;
}
bool fractions::IsEqual(fractions x){
	simplify();
	x.simplify();
	if (num==x.GetNum()) && (denom==x.GetDenom()){
		return True;
	}
	else{
		return False;
	}
}


int main() {
	cout<<"Enter numerator: ";
	cin>>int numerator;
	cout<<"Enter denominator: ";
	cin>>int denominator;
    return 0;
}
