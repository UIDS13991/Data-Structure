#include <bits/stdc++.h> 
#define MAX_SIZE 100
using namespace std;
//----------------------------------------------------------------------------------------------
class Queue
{
private:
	int A[MAX_SIZE];
	int front, rear; 
public:
	Queue()
	{
		front = -1; 
		rear = -1;
	}
//----------------------------------------------------------------------------------------------
	bool IsEmpty()
	{
		return (front == -1 && rear == -1); 
	}
//----------------------------------------------------------------------------------------------
	bool IsFull()
	{
		return (rear+1)%MAX_SIZE == front ? true : false;
	}
//----------------------------------------------------------------------------------------------
	void Enqueue(int x)
	{
		if(IsFull())
		{
			return;
		}
		if (IsEmpty())
		{ 
			front = rear = 0; 
		}
		else
		{
		    rear = (rear+1)%MAX_SIZE;
		}
		A[rear] = x;
	}
//----------------------------------------------------------------------------------------------
	void Dequeue()
	{
		if(IsEmpty())
		{
			return;
		}
		else if(front == rear ) 
		{
			rear = front = -1;
		}
		else
		{
			front = (front+1)%MAX_SIZE;
		}
	}
//----------------------------------------------------------------------------------------------
	int Front()
	{
		if(front == -1)
		{
			return -1; 
		}
		return A[front];
	}
//----------------------------------------------------------------------------------------------
	void Print()
	{
		int count = (rear+MAX_SIZE-front)%MAX_SIZE + 1;
		for(int i = 0; i <count; i++)
		{
			int index = (front+i) % MAX_SIZE;
			cout<<A[index]<<" ";
		}
	}
}; 
//----------------------------------------------------------------------------------------------
int main(void) 
{ 
    int number,sum=0;
    int value;
    cin>>number;
    sum+=number;
     Queue q1; 
    for(int i=0;i<number;i++){
        cin>>value;
         q1.Enqueue(value); 
    }
    cin>>number;
    sum+=number;
     Queue q2; 
    for(int i=0;i<number;i++){
        cin>>value;
         q2.Enqueue(value); 
    }
    cin>>number;
    sum+=number;
     Queue q3; 
    for(int i=0;i<number;i++){
        cin>>value;
         q3.Enqueue(value); 
    }
//----------------------------------------------------------------------------------------------
    Queue final;
    while(sum!=0){
        if(q1.Front()>=q2.Front() && q1.Front()>=q3.Front()){
            final.Enqueue(q1.Front());
             q1.Dequeue();
        }
        else if(q2.Front()>=q1.Front() && q2.Front()>=q3.Front()){
            final.Enqueue(q2.Front());
            q2.Dequeue();
        }
        else if(q3.Front()>=q2.Front() && q3.Front()>=q1.Front()){
            final.Enqueue(q3.Front());
            q3.Dequeue();
        }
        sum--;
    }
    final.Print();
    return 0; 
} 