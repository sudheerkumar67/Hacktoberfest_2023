// During the assembly, a teacher lines up 

// N students in a line in front of her. She can see the first student and all the students taller than the students before them ( i.e a teacher can see the student 
// How many students will the teacher be able to see?

// Input Format
// The first line will have 1 integer 

// N.
// The second line will contain the heights of the students which would be integers in the order of them getting farther from the teacher. (will be separated by a space)
// Output Format
// Output a single integer which is the amount of students the teacher will be able to see.

// Input
// 9
// 1 2 3 4 5 6 7 8 9 

// Output
// 9 

import java.util.Scanner;

public class visibleHieghts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=0;
        int count=1;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        max=a[0];
        for(int j=1;j<n;j++)
        {
            if(a[j]>max)
            {
                count++;
                max=a[j];
            }
        }
        System.out.println(count);
    }
}
