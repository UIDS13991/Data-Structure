#include <iostream>
#include <string>
using namespace std;
class node{
	friend class Doubly_Linked_List;
	private:
		int data;
		node *next;
		node *prev;
	public:
		node(){

		}
		node(int data,node *next=nullptr,node *prev=nullptr){
			this->data = data;
			this->next = next;
			this->prev = prev;
		}	
};

class Doubly_Linked_List{

	private:
		int size=0;
		node *head = nullptr;
		node *tail = nullptr;
	public:
		Doubly_Linked_List(){

		}
		Doubly_Linked_List(int n){
			this->size = n;
			if(n>0){
			node *s = new node (1);
			this->head = s;
			this->tail = s;
			node *p = s;
			for(int i=2;i<=n;i++){
				node * temp = new node (i,nullptr,p);
				p->next = temp;
				p = temp;
				}
				this->tail = p;
			}
			
		}
		void rev(int i,int j){
			if(i!=j&&this->size!=0&&j<=this->size){
				node *f;
				node *e;
				node *tmpi  = this->head;
				node *tmpj;
				node *cur;
				node *nx;
				for(int k=1;k<i;k++)
					tmpi = tmpi->next;
				
				tmpj=tmpi;
				for(int k=i;k<j;k++){
					tmpj = tmpj->next;
				}
			 	f = tmpi->prev;
				e = tmpj->next;
				if(i==1)this->head = tmpj;
				else if(tmpi->prev!=nullptr){
					(tmpi->prev)->next = tmpj;
				}
				if(j==this->size)this->tail = tmpi;
				else if(tmpj->next!=nullptr){
					(tmpj->next)->prev = tmpi;
				}
				cur=tmpi->next;
				nx = tmpi->next->next;
				tmpi->prev = tmpi->next;
				tmpi->next = e;
				while(cur!=tmpj&&cur!=nullptr){

				  	cur->next = cur->prev;
				 	cur->prev = nx;
				 	cur = nx;
				  	if(nx!=nullptr)nx = nx->next;
				  	else break;
				}
				tmpj->next = tmpj->prev;
				tmpj->prev = f;

			}
	}
		void print(){
			node *tmp = this->head;
			while(tmp!=nullptr){

				cout<<tmp->data<<' ';
				tmp=tmp->next;
			}
			cout<<endl;
		}
		void name(int k){
			if(this->size!=0&&k<=this->size){
				node* tmp=this->head;
				for(int i=1;i<k;i++){
					tmp=tmp->next;
				}
				cout<<tmp->data<<endl;
			}
		}
		~Doubly_Linked_List(){
			node *tmp = this->head;
			node *tmpnx;
			while(tmp!=nullptr){
				tmpnx = tmp->next;
				delete tmp;
				tmp = tmpnx;

			}
			this->head = nullptr;
			this->tail = nullptr;
			this->size = 0;
		}

};



int main(){
	int n,t;
	cin >> n >> t;
	Doubly_Linked_List  cassettes (n);
	while(t--){
		string cm;
		cin >> cm;
		if(cm=="NAME"){
			int k;
			cin >> k;
			cassettes.name(k);
		}
		if(cm=="REV"){
			int i,j;
			cin >> i >> j;
			cassettes.rev(i,j);
		}
	}
	return 0;

}