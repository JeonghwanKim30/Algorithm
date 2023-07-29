class Solution {
    public int solution(int[] elements) {
		int answer = 0;
		int max = 0;
		for (int i = 0; i < elements.length; i++) {
			max += elements[i];
		}

		int check[] = new int[max + 1];

		// 아예 제하는 게 없을 경우
		check[max] = 1;
		answer++;

		// 1개로 만드는 경우의 수
		for (int i = 0; i < elements.length; i++) {
			int sum = elements[i];
			if (check[sum] == 0) {
				check[sum] = 1;
				answer++;
			}
		}

		// 몇개로 숫자를 만드는가
		for (int i = 2; i < elements.length; i++) {

			// 초과하지 않을때 j = 시작 위치
			for (int j = 0; j <= elements.length - i; j++) {
				int sum = 0;

				// 숫자의 길이 만큼 더하기
				for (int z = j; z < j + i; z++) {
					sum += elements[z];
				}

				// 중복되지 않는 수라면 answer 증가
				if (check[sum] == 0) {
					check[sum] = 1;
					answer++;
				}
			}

			// 초과하는 수에 대한 계산
			// j는 몇개 수가 초과했는지 지표
			for (int j = 1; j < i; j++) {
				int sum = 0;

				// 앞에서 부터 더하기
				for (int z = 0; z < j; z++) {
					sum += elements[z];
				}

				// 뒤에서 부터 더하기
				for (int z = i - j; z > 0; z--) {
					sum += elements[elements.length - z];
				}

				if (check[sum] == 0) {
					check[sum] = 1;
					answer++;
				}
			}

		}

		return answer;
    }
}