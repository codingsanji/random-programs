#include <iostream>
using namespace std; 

void MakeArr(int arr[100][100] , int n , int m ){ 
    for (int i=1 ; i<=n ; i++){
        for (int j=1 ; j<=m ; j++){
            cin>>arr[i][j];
        }
    }
}

void total(int arr[100][100] , int n , int m){ 
    int total=0;
    for (int i=1 ;i<=n ; i++){
        for (int j=1; j<=m ; j++){
            total=total+arr[i][j];
        }
    }
    cout<<total;
}

int main(){
    int n , m , arr[100][100];
    cin>>n>>m;
    MakeArr(arr , n , m);
    total (arr , n , m);
    return 0;
}
