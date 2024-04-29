#include <iostream>
using namespace std;

int main()
{
    int A[] = {2,3,5,6,1,2,3,4};
    int B[8], i, numVals = 8;

    cout<<"Size of each element in A[] is: " << sizeof(A[0]) << " byte(s)\n";
    //cout<<"Address of array A is: \t\t" << A << "\n";
    // cout<<"Address of element A[0] is: \t" << &A[0] << "\n";

    // int *ptrA;

    // ptrA = A; // A[0]w
    // cout<<"Value of pointer A: \t\t"<<ptrA<<"\n";
    // cout<<"Value of address stored in pointer: "<<*ptrA<<"\n";

    // ptrA++; // A[1]
    // cout<<"Value of pointer A (after + 1): "<<ptrA<<"\n";
    // cout<<"Value of address stored in pointer: "<<*ptrA<<"\n";

    return 0;
}
