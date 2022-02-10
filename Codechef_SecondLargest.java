// Three numbers A, B and C are the inputs. Write a program to find second largest among them.

// Input
// The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains three integers A, B and C.

// Output
// For each test case, display the second largest among A, B and C, in a new line.

// Constraints
// 1 ≤ T ≤ 1000
// 1 ≤ A,B,C ≤ 1000000
// Example
// Input
// 3 
// 120 11 400
// 10213 312 10
// 10 3 450

// Output

// 120
// 312
// 10
import java.util.Scanner;

class Secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if(A>B && A<C || A<B && A>C){
                System.out.println(A);
            }
            else if(B>C && B<A || B<C && B>A){
                System.out.println(B);
            }
            else{
                System.out.println(C);
            }
        }

    }
}
