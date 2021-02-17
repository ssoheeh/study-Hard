#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	cout.tie(NULL);
	cin.tie(NULL);
	ios::sync_with_stdio(false);
	int n;
	cin >> n;
	vector<int> num(n);
	for (auto &k : num) cin >> k;

	sort(num.begin(), num.end());
	for (auto k : num)cout << k << "\n";
	return 0;
}