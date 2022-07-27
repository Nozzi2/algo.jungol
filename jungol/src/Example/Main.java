package Example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		/* 입력 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int start = Integer.parseInt(s[0]);
		int end = Integer.parseInt(s[1]);
		
		/* 출력 */
		StringBuilder sb = new StringBuilder();
		sb.append("Hi").append(" ");
		sb.deleteCharAt(sb.lastIndexOf(" "));
		sb.setLength(0); //모두 지우기
		System.out.println(sb.toString().trim()); //마지막 공백 지우고 출력
	}
}
