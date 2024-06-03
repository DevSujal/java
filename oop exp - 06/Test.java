class Test {
	public static void main(String h[]) {
		Integer[] a = { 1, 2, 3, 4, 5 };
		Integer[] b = { 7, 6, 2, 1, 5 };
		Double[] d = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		Double[] c = { 4.0, 6.0, 3.0, 4.0, 5.0 };
		ArrayOp array1 = new ArrayOp<>(a);
		// ArrayOp<Integer> array2 = new ArrayOp<>(b);
		// ArrayOp<Double> array3 = new ArrayOp<>(c);

		System.out.println(array1.addArray());
		// System.out.println(array2.addArray());

		// try{
		// // System.out.println();
		// // array1.isEqual(array2);
		// // array1.isEqual(array1);
		// // array1.isEqual(array3);
		// // array3.isEqual(array3);
		// }
		// catch(UnmatchedSumException e){
		// e.printStackTrace();
		// }
	}
}
