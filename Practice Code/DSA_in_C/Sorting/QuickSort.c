#include <stdio.h>
int partition(int arr[], int low, int high)
{
    int pivot = arr[low];
    int start = low;
    int end = high;
    while (start < end)
    {
        while (arr[start] <= pivot)
            start++;
        while (arr[end] > pivot)
            end--;
        if (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
    int temp = arr[low];
    arr[low] = arr[end];
    arr[end] = temp;
    return end;
}
void quick_sort(int arr[], int low, int high)
{
    if (low < high)
    {
        // partitioning the single array into two sub-arrays
        int loc = partition(arr, low, high);
        // sorting the sub-arrays
        quick_sort(arr, low, loc - 1);
        quick_sort(arr, loc + 1, high);
    }
}
int print(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
}
int main()
{
    int n, i;
    int arr[] = {10, 9, 454, 4, 5, 231, 3, 4, 3, 2222, 34, 5};
    n = sizeof(arr) / sizeof(arr[0]);
    quick_sort(arr, 0, n - 1);
    print(arr, n);
}    