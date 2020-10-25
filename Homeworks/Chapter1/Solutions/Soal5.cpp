#include  <iostream>
using namespace std;
int main(){

	int t;
	cin >> t;
	while(t--){

		int n,m,f=1;
		cin >> n >> m;
		
		int **mat = new int * [n];
		for(int i=0;i<n;i++)
			mat[i] = new int [m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				cin >> mat[i][j];
			}
		}
		for(int i=0;i<n;i++){
			int cwd[11]={0};
			for(int j=0;j<m-1;j++){
				int diff = abs(mat[i][j]-mat[i][j+1]);
				if(diff>m-1||diff==0){
					continue;
				}
				cwd[diff]++;
			}
			for(int c=1;c<=m-1;c++){
				if(cwd[c]!=1){
					f=0;
				}
			}
			if(!f)break;

		}
		for(int j=0;j<m;j++){
			int cwd[11]={0};
			for(int i=0;i<n-1;i++){
				int diff = abs(mat[i][j]-mat[i+1][j]);
				if(diff>n-1||diff==0){
					continue;
				}
				cwd[diff]++;
			}
			for(int c=1;c<=n-1;c++){
				if(cwd[c]!=1){
					f=0;
				}
			}
			if(!f)break;
		}
		for(int i=0;i<n;i++)
			delete[] mat[i];
		delete[] mat;
		if(!f){
			cout<<"Wicked"<<endl;
			continue;
		}
		cout<<"Tame"<<endl;
	}
	return 0;
}