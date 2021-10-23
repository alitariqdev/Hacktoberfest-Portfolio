#include<iostream>
using namespace std;
int calculatefactorial(int x);
int main()
{
    int x,fact;
    cout<<"Enter First number"<<endl;
    cin>>x; 
    fact=calculatefactorial(x);
    cout<<"Factorial of a number is"<<fact;
    return 0;
}
int calculatefactorial(int x)
{
    int fact=1;
    for(int i=1;i<=x;i++)
    {
        fact=fact*i;
    }
    return fact;
}