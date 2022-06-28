class Solution {

	public int solution(int N) {

		String binaryString = Integer.toBinaryString(N);

		int occurencesDigit1 = 0;
		
		if (binaryString.indexOf('0') == -1)
			return 0;

		for (int i = 0; i < binaryString.length(); i++) {

			if (binaryString.charAt(i) == '1') {
				occurencesDigit1++;
			}
		}

		if (occurencesDigit1 < 2 )
			return 0;

		int majorGaps = 0;

		for (int i = 0; i < occurencesDigit1; i++) {

			int localGaps = 0;
			int nextOccurence = binaryString.indexOf('1', i);

			for (int j = nextOccurence + 1; j < binaryString.length(); j++) {

				if (binaryString.charAt(j) == '0')
					localGaps++;
				else
					break;

			}

			if (localGaps > majorGaps)
				majorGaps = localGaps;

			localGaps = 0;
		}

		return majorGaps;
	}
}

public class BinaryGap {

	public static void main(String[] args) {

		Solution s = new Solution();

		int num = 74901729;

		System.out.println("--------\n\nNum: " + num);
		System.out.println("Binary: " + Integer.toBinaryString(num));
		System.out.println("Gap: " + s.solution(num) + " [Expected: 4]");

	}

}
