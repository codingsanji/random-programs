//Evaluate the expression
//Given a string S consisting of only positive integers and the signs +, -, *, ÷, there are no space characters in S. Evaluate the expression represented by S.

#include <iostream>
#include <stack>
#include <string>
#include <cctype> // for isdigit

using namespace std;

int precedence(char op) {
    if (op == '+' || op == '-') return 1;
    if (op == '*' || op == '/') return 2;
    return 0;
}

int applyOperation(int a, int b, char op) {
    switch (op) {
        case '+': return a + b;
        case '-': return a - b;
        case '*': return a * b;
        case '/': return a / b; // Assuming non-zero divisor
        default: return 0; // Invalid operator
    }
}

int evaluateExpression(const string& expression) {
    stack<int> values;
    stack<char> ops;

    for (size_t i = 0; i < expression.size(); ++i) {
        if (isdigit(expression[i])) {
            int num = 0;
            while (i < expression.size() && isdigit(expression[i])) {
                num = num * 10 + (expression[i] - '0');
                ++i;
            }
            values.push(num);
            --i; // Decrement i to stay at the correct position after the number
        } else if (expression[i] == '(') {
            ops.push(expression[i]);
        } else if (expression[i] == ')') {
            while (!ops.empty() && ops.top() != '(') {
                int b = values.top(); values.pop();
                int a = values.top(); values.pop();
                char op = ops.top(); ops.pop();
                values.push(applyOperation(a, b, op));
            }
            ops.pop(); // Pop '(' from the stack
        } else if (expression[i] == '+' || expression[i] == '-' ||
                   expression[i] == '*' || expression[i] == '/') {
            while (!ops.empty() && precedence(ops.top()) >= precedence(expression[i])) {
                int b = values.top(); values.pop();
                int a = values.top(); values.pop();
                char op = ops.top(); ops.pop();
                values.push(applyOperation(a, b, op));
            }
            ops.push(expression[i]);
        }
    }

    while (!ops.empty()) {
        int b = values.top(); values.pop();
        int a = values.top(); values.pop();
        char op = ops.top(); ops.pop();
        values.push(applyOperation(a, b, op));
    }

    return values.top();
}

int main() {
    string expression;
    cout << "Enter the arithmetic expression: ";
    getline(cin, expression);

    int result = evaluateExpression(expression);
    cout << "Result: " << result << endl;

    return 0;
}

