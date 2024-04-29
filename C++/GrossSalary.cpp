#include <iostream>
#include <math.h>
using namespace std;

int main()
{
    int Basic_Salary;
    cout << "Your Basic Salary:";
    cin >> Basic_Salary;
    int HRA, DA;
    int Gross_Salary;
    if (Basic_Salary <= 10000)
    {
        HRA = (Basic_Salary / 100) * 20;
        DA = (Basic_Salary / 100) * 80;
    }

    else if (Basic_Salary <= 20000)
    {
        HRA = (Basic_Salary / 100) * 25;
        DA = (Basic_Salary / 100) * 90;
    }

    else if (Basic_Salary >= 20000)
    {
        HRA = (Basic_Salary / 100) * 30;
        DA = (Basic_Salary / 100) * 95;
    }

    Gross_Salary = Basic_Salary + HRA + DA;
    cout << "HRA:" << HRA << endl;
    cout << "DA:" << DA << endl;
    cout << "Gross Salary:" << Gross_Salary << endl;

    return 0;
}
