package com.naver.main;

public class Main
{
	public static void main(String[] args)
	{
		// test data set
		int[] num =
		{ 1, 2, 3 };

		// 1. com.naver.util.CollectionStack
		// add - 새로운 숫자 추가 무조건 0번 인덱스에 추가 1,2,3에 4를 넣으면 -> 4,1,2,3
		// remove - 0번 인덱스 삭제 - 4,1,2,3 -> 1,2,3

		// 2. com.naver.util.CollectionQue
		// add - 새로운 숫자 추가 무조건 0번 인덱스에 추가 1,2,3에 4를 넣으면 -> 4,1,2,3
		// remove - 마지막 인덱스 삭제 -> 4,1,2

		// 3. com.naver.util.CollectionSet
		// add - 새로운 숫자 마지막에 추가 단, 중복되지 않는 숫자만 추가 -> 1,2,3,4
		// remove - 삭제할 숫자를 입력받아서 일치하는 숫자를 삭제 ->
	}
}
