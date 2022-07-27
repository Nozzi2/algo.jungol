package beginner_coder;

import java.io.IOException;
import java.util.Scanner;

public class Main_BG_1291_구구단 {
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int start, end;

		while (true) {
//			String[] s = br.readLine().split(" ");
//			start = Integer.parseInt(s[0]);
//			end = Integer.parseInt(s[1]);
			start = sc.nextInt();
			end = sc.nextInt();
			if (start > 9 || start < 2 || end > 9 || end < 2) {
				System.out.println("INPUT ERROR!");
			} else {
				break;
			}
		}

		for (int i = 1; i < 10; i++) {
			if (start > end) {
				for (int j = start; j >= end; j--) {
					System.out.printf("%d * %d = %2d", j, i, j*i);
					if (j != end) {
						System.out.print("   ");
					}
				}
				System.out.println();
			} else {
				for (int j = start; j <= end; j++) {
					System.out.printf("%d * %d = %2d", j, i, j*i);
					if (j != end) {
						System.out.print("   ");
					}
				}
				System.out.println();
			}
		}

	}
}
