class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        int temp=0;

          int firstEx=numBottles/numExchange;
          int firstEm= numBottles%numExchange;
          /* int sec=firstEx+firstEm;
          int secEx=sec/numExchange;
          int secEm= sec%numExchange;
          int third=secEx+secEm;
          int thirdEx=third/numExchange;
          int thirdEm= third%numExchange;

          int f=thirdEx+thirdEm;
          int fEx=f/numExchange;
          int fEm= f%numExchange;
          return numBottles+firstEx+secEx+thirdEx+fEx;*/
////
       while(firstEx/numExchange!=0 ){
         total=total+firstEx;

        temp=firstEx+firstEm;
        firstEx=temp/numExchange;
        firstEm=temp%numExchange;
       }
       if(firstEx+firstEm>=numExchange){
        total=total+firstEx;

        temp=firstEx+firstEm;
        firstEx=temp/numExchange;
        firstEm=temp%numExchange;
       }
       return total+firstEx;
    }
}