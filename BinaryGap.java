class Solution {

	public int solution(int N) {

		String binaryString = Integer.toBinaryString(N);
		int maxGap = 0;
		int currentGap = 0;
		int lastOne = -1;
		int firstOne = -1;
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) == '1') {
				if (firstOne == -1) {
					firstOne = i;
				} else {
					currentGap = i - lastOne - 1;
					if (currentGap > maxGap) {
						maxGap = currentGap;
					}
				}
				lastOne = i;
			}
		}
		return maxGap;
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
