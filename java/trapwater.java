public class trapwater {

    public static void main(String ar[]) {

        int a[]={4,0,2};
       int min=0,sum=0,j=0,k=0;
        int n=a.length;
            for(int i=0;i<n;)
            {
                for(j=i+1;j<n-1;)
                {
                    if(a[j]>=a[j+1])
                        i++;
                    else
                        break;
                }

                for(k=j+1;k<n-1;)
                {
                    if(a[k]<=a[k+1])
                        k++;
                    else
                        break;
                }

                min=Math.min(a[i],a[k]);
                i++;

                while(i<k)
                {
                    sum+=min-a[i];
                    i++;
                }
            }
           System.out.println(sum);
    }

}
