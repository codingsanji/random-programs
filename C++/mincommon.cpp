
#include <iostream>
#include <vector>
using namespace std;

int smallestCommon(vector<int> nums1, vector<int> nums2) {
	    int i = 0, j = 0;
    while (i < nums1.size() && j < nums2.size()) {
        if (nums1[i] == nums2[j]) {
            return nums1[i];  
        } else if (nums1[i] < nums2[j]) {
            i++;  
        } else {
            j++;  
        }
    }
    return -1;  
}


int main() {
    int n, m;
    cin >> n >> m;

    vector<int> nums1;
    vector<int> nums2;

    int val = 0;
    for (auto i = 0; i < n; i++) {
        cin >> val;
        nums1.push_back(val);
    }
    for (auto i = 0; i < m; i++) {
        cin >> val;
        nums2.push_back(val);
    }

    cout << smallestCommon(nums1, nums2) << endl;

    return 0;
}

