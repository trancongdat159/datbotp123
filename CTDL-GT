#include <iostream>
using namespace std;

int sumEven(int arr[], int n) {
    if (n == 0) { 
        return 0;
    } else {
        int sum = sumEven(arr, n-1); 
        if (arr[n-1] % 2 == 0) { 
            sum += arr[n-1]; 
        }
        return sum;
    }
}

int main() {
    int arr[] = {1, 2, 3, 4, 5, 6};
    int n = sizeof(arr)/sizeof(arr[0]);
    cout << "Tong cac so chan trong mang la: " << sumEven(arr, n) << endl;
    return 0;
}
