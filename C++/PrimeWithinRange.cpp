#include <iostream>
#include <math.h>
using namespace std;

int main()
{
    int count = 0;
    for (int i = 1; i <= 100; i++)
    {
        bool check = true;
        if (i < 2)
            check = false;
        if (i >= 2)
        {
            for (int j = 2; j <= sqrt(i); j++)
            {
                if (i % j == 0)
                {
                    check = false;
                    break;
                }
            }
        }
        if (check == true)
        {
            count++;
        }
    }
    cout << count;

    return 0;
}
