/*
Que. Write a program to create a class (Employee) with the information given below.
1. emp_id
2. name
	1. first_name
	2. last_name
3. address
    1. area
    2. city
    3. state
4. salary
5. designation
Read and print the data by creating  Employee array
Hint:- aggregation / containership
*/
import java.util.Scanner;

public class Emp {
    int emp_id;
    String first_name,last_name;
    String address;
    int Salary;
    String designation;
    Emp(int emp_id,String first_name,String last_name,String address, int Salary, String designation){
        this.emp_id = emp_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.Salary = Salary;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "emp_id=" + emp_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address='" + address + '\'' +
                ", Salary=" + Salary +
                ", designation='" + designation + '\'' +
                '}';
    }
}


class test22{
    public static void main(String[] args) {
        Emp [] arr = new Emp[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = new Emp(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.next());

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i].toString());
            System.out.println("NAMAN SAINI");  

        }

    }
}
