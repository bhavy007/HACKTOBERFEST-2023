#include <iostream>
using namespace std;

int binarySearch(int arr[], int n){
    int start=0, end=n, key;
    cout<<"Enter the key: ";
    cin>>key;
    while (start<=end){
        int mid=(start+end)/2;
        if (arr[mid]==key)
            return mid;
        else if (arr[mid]<key)
            start=mid+1;
        else
            end=mid-1;
    }
    return -1;
}

int main()
{
    int n;
    cout<<"Enter the no. of elements in array: ";
    cin>>n;
    int arr[n];
    for (int i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<binarySearch(arr,n);
    return 0;
}