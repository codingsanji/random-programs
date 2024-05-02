//C++ program to convert a decimal number to its binary representation

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std; 

vector<int> decimalToBinary(int decimal) {
    vector<int> binary;
    
    while (decimal > 0) {
        binary.push_back(decimal % 2);
        decimal /= 2;
    }
    
    reverse(binary.begin(), binary.end());
    return binary;
}

int main() {
    int decimal;
    cin >> decimal;
    
    vector<int> binary = decimalToBinary(decimal);
    
    for (int digit : binary) {
        cout << digit;
    }
    
    cout << endl;
    
    return 0;
}

