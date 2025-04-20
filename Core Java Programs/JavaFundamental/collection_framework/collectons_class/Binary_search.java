package collection_framework.collectons_class;

public class Binary_search {

    public static void main(String[] args) {
         
         int n=6; // 0   1    2   3  4  5  
          int a[]={  2 , 4,   6,  7,21, 31};
                     //   r   l,
                 //  0+5/2= 2.5
          
        int l=0,r=n-1, search=7,mid,i;
            //1<=1
        while(l<=r)
        {
            //1+1/2 =>  1
         mid=(l+r)/2;       //mid=1
            // 4   == 4
         if(search ==a[mid])
         {
             System.out.println("element is present at "+mid+" position   ")    ; //2
             break;
         }
                  //4  <  2
         else if( search < a[mid])
         {
              r=mid-1;  //mid=2
         }
         else 
         {
               l=mid+1;   //l=1
         }
      }  //while close
          //5>4
      if (l > r)
          System.out.println("Not found! "+search+" is not present in the list.\n");
    }

    }