import java.util.Scanner;
//         A child is running up a staircase with N steps and can hop either 1 step, 2 steps or 3 steps
//        at a time. Implement a method to count how many possible ways the child can run-up to the stairs.
//        You need to return the number of possible ways W.
//        Sample Input :
//        4
//        Sample Output  :
//        7
class Count{
    public int count(int n){
        if(n<0) {
            return 0;
        }
        if(n==0) return 1;
        int sum = count(n-1)+count(n-2)+count(n-3);
        return sum;
    }

}
public class TestMAiN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of steps of Staircase: ");
        int n = sc.nextInt();
        Count obj = new Count();
        System.out.println(obj.count(n));
    }
}
