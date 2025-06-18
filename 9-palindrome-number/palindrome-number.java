class Solution {
    public boolean isPalindrome(int x) {
          int num=x;
          int temp,rev=0;
          while(x>0){
            temp=x%10;
            rev=rev*10+temp;
            x=x/10;
          }
          if(rev==num){
return true;          }else if(num<0){
    return false;
}else{
    return false;
}
    }
}