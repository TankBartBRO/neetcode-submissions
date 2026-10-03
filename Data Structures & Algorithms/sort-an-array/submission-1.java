class Solution {
    private int[] temp;
    public int[] sortArray(int[] nums) {
        temp=new int[nums.length];
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    private void mergeSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    private void merge(int[] arr, int low, int mid, int high){
        int i=low;
        int j=mid+1;
        int k=low;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=high){
            temp[k++]=arr[j++];
        }
        for(int x=low;x<=high;x++){
            arr[x]=temp[x];
        }
    }
}