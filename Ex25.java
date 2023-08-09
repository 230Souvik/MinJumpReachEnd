
package ex25;
import java.util.*;

public class Ex25 {
static boolean maxLength(int arr[],int n){
    int r=0;
    for(int i=0;i<n;i++){
        if(r<i)
            return false;
        r=Math.max(r,i+arr[i]);
    }
    System.out.println("max no of jump"+r);
    return true;
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={2,3,5,0,7,0,3};
        int n=arr.length;
        maxLength(arr,n);
    }
    
}
