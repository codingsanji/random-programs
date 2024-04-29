//define a class for string---clearly identify data member (if any) , operator of operation (as function)

#include <bits/stdc++.h>
using namespace std;
class Mystring {
public:
	char* Reverse(); //char* is pointer --- to show array format
    void setString(char s[]);
    void GetString();
    void GetLength();
    void toUpperCase();
    void toLowerCase();
    void append(Mystring s)
    
private:
    unsigned int length;
    char values[100];
};

int main() {
    return 0;
}
