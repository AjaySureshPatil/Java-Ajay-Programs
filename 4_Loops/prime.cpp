#include<iostream>
using namespace std;
int main(){
    int i,n;
    cout<<"Enter a Number: ";
    cin>>n;
    for(i=2;i<n;++i)
    {
        if (i%n==0)
        {
            cout<<"Non prime";
        }
        else
        {
            cout<<"prime";
        }
    }
    
    return 0;
 }