#include <bits/stdc++.h>
#define ll long long
#define ull unsigned long long
#define inf 1 << 30
#define min(a, b) (a) < (b) ? (a) : (b)
#define max(a, b) (a) < (b) ? (b) : (a)
#define vi vector<int>
#define vll vector<ll>
#define pb push_back
#define pii pair<int, int>
#define mp make_pair
#define mii map<int, int>
#define umii unordered_map<int, int>

using namespace std;

int main (int argc, char const *argv[]) {
	cin.sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

    int w;
    cin >> w;

    if (w % 2 == 0 && w > 2) {
        cout << "YES";
    } else {
        cout << "NO";
    }
    
	return 0;
}
