package com.test.second;

public class Utils {
	// 오버로딩
	public static int parseStringToInt(String str, int a) {
		try {
			int num = Integer.parseInt(str);
			return num;
		} catch (Exception e) {
			return a;
		}
	}

	public static int parseStringToInt(String str) {
		return parseStringToInt(str, 0);
	}

	public static void sortASC(int[] arr) { // 오름차순
		sort(arr, true);
	}

	public static void sortDESC(int[] arr) { // 내림차순
		sort(arr, false);
	}

	public static void sort(int[] arr, boolean asc) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int z = i + 1; z < arr.length; z++) {
				if (asc == (arr[i] > arr[z])) {
					int paste = arr[i];
					arr[i] = arr[z];
					arr[z] = paste;
				}
			}
		}
	}

	public static void printArr(int[] arr) { // 출력문
		if (arr == null) {
			System.out.println("arr is null");
		} else {
			System.out.printf("{");
			for (int i = 0; i < arr.length; i++) {
				if (i == arr.length - 1) {
					System.out.printf("%d}\n", arr[i]);
				} else
					System.out.printf("%d, ", arr[i]);
			}
		}
	}

	public static int[] ramdomArr(int a, int b, int c, boolean tf) {
		int arrlength = c - 1; // 배열은 0부터 시작하니 -1해줘야 남는자리가없음
		int[] gap = new int[arrlength];
		for (int i = 0; i < gap.length; i++) { // 랜덤값 호출
			gap[i] = (int) (Math.random() * b + a); // a~b값 rArr[i]에 입력
			if (tf) {
				for (int z = 0; z < i; z++) {
					if (gap[z] == gap[i]) { // 중복되면 재출력
						i--;
						break; 
					}
				}
			}
		}
		return gap;
	}

	public static int[] createRandomArr(int a, int b, int c) {
		return ramdomArr(a, b, c, false);
	}

	public static int[] createRandomArrNoDuplication(int a, int b, int c) {
		if((b-a)+1 < c) {
			return null;
		}
		return ramdomArr(a, b, c, true);
		}
	
	public static String makeStarTriangle(int a) {
		String star = "";
		for(int i = 0 ; i <= a ; i++) {
			for(int z = 0 ; z < i ; z ++) {
				star += "*";
			}
			star += "\n";
		}
		return star;
	}
}