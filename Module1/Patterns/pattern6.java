package Patterns;

import java.util.Scanner;

/*


Pattern

12345
1234
123
12
1
 


 */

public class pattern6 {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		

    for(int i=0 ; i<=n;i++){
        for(int j=1;j<n-i+1; j++) {
            System.out.print(j);
        

        }System.out.println(" ");
    }
}
}
