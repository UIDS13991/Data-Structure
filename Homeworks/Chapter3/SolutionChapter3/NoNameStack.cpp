#include <bits/stdc++.h>
using namespace std;

bool exit(char x[4],char n)
{
    for(int i=0;i<4;i++)
        if(x[i]==n)
            return true;
    return false;
}
int main()
{
    char Open[4]={'(','{','<','['};
    char Close[4]={')','}','>',']'};
    string a;
    while(getline(cin,a))
    {
        stack <char> x;
        int sum=0;
        unsigned int i=0;
        for(;i<a.length();i++)
        {
            if(a[i]==' ')
                sum++;
            else
            {
                if(exit(Open,a[i]))
                {
                    if(a[i]=='(' && a[i+1]=='*')
                    {
                        x.push('(');
                        x.push('*');
                        i++;
                    }
                    else
                        x.push(a[i]);
                    sum++;
                }
                else if(exit(Close,a[i]))
                {
                    if(x.empty())
                    {
                        sum++;
                        cout<<"NO"<<" "<<sum<<endl;
                        break;
                    }
                    else if(a[i]==')')
                    {
                        sum++;
                        if(x.top()=='(')
                            x.pop();
                        else
                        {
                            cout<<"NO"<<" "<<sum<<endl;
                            break;
                        }
                    }
                    else if(a[i]=='>')
                    {
                        sum++;
                        if(x.top()=='<')
                            x.pop();
                        else
                        {
                            cout<<"NO"<<" "<<sum<<endl;
                            break;
                        }
                    }
                    else if(a[i]=='}')
                    {
                        sum++;
                        if(x.top()=='{')
                            x.pop();
                        else
                        {
                            cout<<"NO"<<" "<<sum<<endl;
                            break;
                        }
                    }
                    else if(a[i]==']')
                    {
                        sum++;
                        if(x.top()=='[')
                            x.pop();
                        else
                        {
                            cout<<"NO"<<" "<<sum<<endl;
                            break;
                        }
                    }
                }
                else if(a[i]=='*' && a[i+1]==')')
                {
                    char m=x.top();
                    x.pop();
                    if(!x.empty() && x.top()=='(' && m=='*')
                    {
                        x.pop();
                        i++;
                    }
                    else
                    {
                        sum++;
                        cout<<"NO"<<" "<<sum<<endl;
                        break;
                    }
                    sum++;
                }
                else
                    sum++;
            }
        }
        if(x.empty() && i==a.length())
            cout<<"YES"<<endl;
        else if(i==a.length())
            cout<<"NO"<<" "<<sum+1<<endl;
    }
    return 0;
}
