#include <iostream>

using namespace std;

int main() {
    int num1, num2;

    cout << "Enter the first number: ";
    cin >> num1;

    cout << "Enter the second number: ";
    cin >> num2;

    // To find GCD/HCF
    while (num2 != 0) {
        int temp = num2;
        num2 = num1 % num2;
        num1 = temp;
    }
    
    cout << "Greatest Common Divisor: " << num1 << endl;

    return 0;
}

