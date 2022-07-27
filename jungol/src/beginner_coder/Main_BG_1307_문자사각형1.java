package beginner_coder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_BG_1307_문자사각형1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int input = Integer.parseInt(br.readLine());
		
		char out = 'A'-1;
		out = (char)(out+(input*input));
		while(out>'Z') {
			out=(char)(out+'A'-'Z'-1);
		}
		
		for(int i=0; i<input; i++) {
			int tmp = out;
			for(int j=0; j<input; j++) {
				tmp = out-(input*j);
				while(tmp<'A') {
					tmp=tmp-'A'+'Z'+1;
				}
				System.out.printf("%c ",tmp);
			}
			out--;
			while(out<'A') {
				out=(char)(out-'A'+'Z'+1);
			}
			System.out.println();
		}
	}
}
