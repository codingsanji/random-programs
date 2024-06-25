#include <iostream>
#include <vector>
#include <stack>

using namespace std;

bool dfs(int start, int end, vector<vector<int>>& adj, vector<bool>& visited) {
    stack<int> s;
    s.push(start);
    visited[start] = true;

    while (!s.empty()) {
        int node = s.top();
        s.pop();

        if (node == end) {
            return true;
        }

        for (int neighbor : adj[node]) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                s.push(neighbor);
            }
        }
    }

    return false;
}

int main() {
    int m, n;
    cin >> m >> n;

    vector<vector<int>> adj(m);
    for (int i = 0; i < n; ++i) {
        int u, v;
        cin >> u >> v;
        adj[u].push_back(v);
        adj[v].push_back(u);
    }

    int a, b;
    cin >> a >> b;

    vector<bool> visited(m, false);

    if (dfs(a, b, adj, visited)) {
        cout << "1" << endl;
    } else {
        cout << "0" << endl;
    }

    return 0;
}

