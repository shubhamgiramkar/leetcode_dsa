class Solution {
    public int fib(int n) {
int f0=0;
int f1=1;
int temp=0;
  if(n==1){
    return 1;
  }

for(int i=1;i<n;i++)  {         
            temp=f0+f1;
            f0=f1;
            f1=temp;
        }
                return temp;

    }

}