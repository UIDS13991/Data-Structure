
#include <iostream>
using namespace std;
class BigNumber{
	private:
		unsigned int nums[33]={0};
	public:
		
		BigNumber(){

		}
		BigNumber add(const BigNumber &a){
			BigNumber result;
			unsigned int carry=0;
			for(int i=32;i>=0;i--){
				unsigned int ar = a.nums[i]+this->nums[i]+carry;
				carry = ar>=10 ? 1:0;
				ar = ar%10;
				result.nums[i] = ar;

			}
			return result;
		}
		BigNumber operator+ (const BigNumber & a){
			return this->add(a);
		}
		BigNumber operator= (const BigNumber & a){
			for(int i=0;i<33;i++){
				this->nums[i]=a.nums[i];
			}
			return *this;
		}
		friend istream &operator>>( istream  &input, BigNumber &a ) { 
			string n;
		    input >> n;
		    int j=0;		    
		    for(int i=33-n.length();i<33;i++){
		    	a.nums[i]=n[j]-'0';
		    	j++;
		    } 
		    return input;       
      }
      	friend ostream &operator<<( ostream &output, const BigNumber &a ) { 
	        int i=0;
	        while(a.nums[i]==0)
	        	i++;
	        for(i;i<33;i++)
	        	output<< a.nums[i];
	        return output;            
      }

};
int main(){
	BigNumber a,b,result;
	cin >> a >> b;
	result = a+b;
	cout<<result<<endl;
	return 0;
}