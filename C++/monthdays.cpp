#include <iostream>
#include <math.h>
using namespace std;

int main()
{

    int m;
    cout << "Input month: ";
    cin >> m;
    if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
        cout << "This month has 31 days.";

    if (m == 4 || m == 6 || m == 9 || m == 11)
        cout << "This month has 30 days.";

    if (m == 2)
        cout << "This month has 29 days.";

    return 0;
}
