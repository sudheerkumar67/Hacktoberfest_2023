import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class twomaxof3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
     
        for(int i=0;i<n;i++)
        {
            if(d==String.valueOf(arr[i]).length())
                System.out.println(arr[i]);
            else
            {
                String number=String.valueOf(arr[i]);
                String numarray[]=number.split("");
                List<String>list=new ArrayList<>(Arrays.asList(numarray));

                for(int j=0;j<3-d;j++)
                {
                    String min=Collections.min(list);
                    list.remove(min);
                }
                
                String result=String.join("",list);
                        System.out.println(result);
                }
           
        }
    }
}
