package com.test.second;
public class Gugudan {
	public static void main(String[] args) {
		//파일명과 클래스명이 같아야지만 public를 붙일수있다.
//		gugudan(2, 5);
		int sum = sum(1,2);
		System.out.println(sum);
		sum = sum(1,2,3); //6
		System.out.println(sum);
		sum = sum(1,2,3,4,5,6,7,8,9,10,11,12);
		System.out.println(sum);
		
		int result = Utils.parseStringToInt("10",0);//10 정수값 리턴
		System.out.println(result);
		result = Utils.parseStringToInt("aa10",1); //파싱할 수 없을 때 두번째 인자값 리턴
		System.out.println(result);
		result = Utils.parseStringToInt("aa10");
		System.out.println(result);
		result = Utils.parseStringToInt("9");
		System.out.println(result);
		int[] arr = {4, 5, 11, 223, 3, 10};
		Utils.sortASC(arr); //오름차순 정렬
		Utils.printArr(arr); //{3,4,5,10,11,223}
		Utils.sortDESC(arr); //내림차순정렬
		Utils.printArr(arr); //{223,11,10,5,4,3}
		
		int[] rArr = Utils.createRandomArr(1,9,5);
		Utils.printArr(rArr);
		rArr = Utils.createRandomArr(10, 30, 80);
		Utils.printArr(rArr);
		//1~9 랜덤한 값을 5칸 가지는 정수형 배열을 리턴하시오
		rArr = Utils.createRandomArrNoDuplication(1, 9, 3);
		Utils.printArr(rArr);
		rArr = Utils.createRandomArrNoDuplication(1, 80, 79);
		Utils.printArr(rArr);
		String star = Utils.makeStarTriangle(5); //결과값 문자열로 별찍기
		System.out.println(star);
	}
	public static void gugudan(int n1, int n2){
		for(int i = n1 ; i <= n2 ; i++) {
			for(int z = 1 ; z <= 9 ; z++) {
				if( (i*z)%2 == 0) {
					System.out.printf("%d * %d = %d\n",i,z,i*z);
				}
			}
			System.out.println();
		}
	}
	public static int sum(int... arr) {
		int sum = 0;
		for(int i = 0 ; i < arr.length; i++) {
			sum += arr[i];
		}return sum;
	}
}
