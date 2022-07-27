package beginner_coder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_BG_1303_숫자사각형1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] s = br.readLine().split(" ");
		int row = Integer.parseInt(s[0]);
		int col = Integer.parseInt(s[1]);
		
		int out = 1;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				sb.append(out++).append(" ");
			}
			//sb.deleteCharAt(sb.lastIndexOf(" "));
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
