package day04.array;

public class MainClass05 {
	public static void main(String[] args) {
		int[][] nums = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12}
		};
		// 2중 배열 출력하기
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(nums[i][j] + "/");
			}
			System.out.println();
		}
	}
}