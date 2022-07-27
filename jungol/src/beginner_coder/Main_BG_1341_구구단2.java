package beginner_coder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_BG_1341_구구단2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int start = Integer.parseInt(s[0]);
		int end = Integer.parseInt(s[1]);
		
		
		if(start > end) {
			for(int k=start; k>=end; k--) {
				for(int i=1; i<8; i=i+3) {
					for(int j=i; j<i+3; j++) {
						System.out.printf("%d * %d = %2d",k,j,k*j);
						if(j!=i+2) {
							System.out.print("   ");
						}
					}
					System.out.println();
				}
				System.out.println();
			}
		} else {
			for(int k=start; k<=end; k++) {
				for(int i=1; i<8; i=i+3) {
					for(int j=i; j<i+3; j++) {
						System.out.printf("%d * %d = %2d",k,j,k*j);
						if(j!=i+2) {
							System.out.print("   ");
						}
					}
					System.out.println();
				}
				System.out.println();
			}
		}

	}

}
