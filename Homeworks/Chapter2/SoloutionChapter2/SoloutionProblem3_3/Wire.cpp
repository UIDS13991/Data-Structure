#include<bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    int mx1 = 0, m1 = INT_MAX;
    int mx2 = 0, m2 = INT_MAX;

    for (int i = 0; i < n; ++i) {
        int a, b;
        cin >> a >> b;
        mx1 = max(mx1, a + b);
        m1 = min(m1, a + b);

        mx2 = max(mx2, a - b);
        m2 = min(m2, a - b);
    }

    cout << max(mx1 - m1, mx2 - m2) << endl;
}