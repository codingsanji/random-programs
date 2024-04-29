#include <iostream>
using namespace std;

#CODE TO RETURN GRADE AFTER INPUTTING MARKS
void grades(int n){
    if(n>91 && n<=100){
        cout<<"Your grade is AA"<<endl;
    }
    if(n>81 && n<=90){
        cout<<"Your grade is AB"<<endl;
    }
    if(n>71 && n<=80){
        cout<<"Your grade is BB"<<endl;
    }
    if(n>61 && n<=70){
        cout<<"Your grade is BC"<<endl;
    }
    if(n>51 && n<=60){
        cout<<"Your grade is CD"<<endl;
    }
    if(n>41 && n<=50){
        cout<<"Your grade is DD"<<endl;
    }
    if(n<=40){
        cout<<"Your grade is FAIL! GO STUDY--STOP TESTING THE CODE."<<endl;
    }
}

int main(){
    int n;
    cout<<"Enter your marks for grade evaluation: ";
    cin>>n;
    grades(n);
}
