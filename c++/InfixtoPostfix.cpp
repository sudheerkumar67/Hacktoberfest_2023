#include <iostream>
#include <stack>
#include <string>

using namespace std;

// Function to return the precedence of an operator
int precedence(char op) {
    if (op == '+' || op == '-')
        return 1;
    if (op == '*' || op == '/')
        return 2;
    if (op == '^')
        return 3;
    return 0;
}

// Function to convert infix expression to postfix expression
string infixToPostfix(string infix) {
    stack<char> s;
    string postfix = "";

    for (int i = 0; i < infix.length(); i++) {
        char c = infix[i];

        // If the scanned character is an operand, add it to output string
        if (isalnum(c))
            postfix += c;

        // If the scanned character is an operator, pop all higher precedence operators from stack and add them to output string
        else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
            while (!s.empty() && precedence(s.top()) >= precedence(c)) {
                postfix += s.top();
                s.pop();
            }
            s.push(c);
        }

        // If the scanned character is an opening parenthesis, push it to stack
        else if (c == '(')
            s.push(c);

        // If the scanned character is a closing parenthesis, pop all operators from stack until opening parenthesis is found
        else if (c == ')') {
            while (!s.empty() && s.top() != '(') {
                postfix += s.top();
                s.pop();
            }
            s.pop();
        }
    }

    // Pop all remaining operators from stack and add them to output string
    while (!s.empty()) {
        postfix += s.top();
        s.pop();
    }

    return postfix;
}

int main() {
    string infix = "a+b*(c^d-e)^(f+g*h)-i";
    string postfix = infixToPostfix(infix);
    cout << "Infix expression: " << infix << endl;
    cout << "Postfix expression: " << postfix << endl;
    return 0;
}
