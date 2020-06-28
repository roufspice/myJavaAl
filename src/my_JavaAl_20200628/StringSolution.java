package my_JavaAl_20200628;

public class StringSolution {

	// 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 a234이면
	// False를 리턴하고 1234라면 True를 리턴하면 됩니다.
	public boolean solution(String str) {
		boolean answer = false;
		char idx;
		if (str.length() == 4 || str.length() == 6) {
			for (int i = 0; i < str.length(); i++) {
				idx = str.charAt(i);
				if (Character.isDigit(idx) == true) {
					answer = true;
				} else {
					answer = false;
					break;
				}

			}
		}

		return answer;
	}
	
	
	//다른사람들이 사용한 코드!
	public boolean solutionA(String s) {
		if (s.length() == 4 || s.length() == 6) {
			try {
				int x = Integer.parseInt(s);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		} else
			return false;
	}
	
	
	

	public static void main(String[] args) {

		String s1 = "A23456";

		StringSolution ss1 = new StringSolution();

		System.out.println(ss1.solution("123456"));
		System.out.println(ss1.solution("12345"));
		System.out.println(ss1.solution("1234"));
		System.out.println(ss1.solution("123A"));
		System.out.println(ss1.solution("12345A"));
		System.out.println(ss1.solution("a123"));

		// if(Integer.parseInt(s1))
	}

}
