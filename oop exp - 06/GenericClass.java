 class ArrayOp <T extends Number>{
 	
 	T[] obj;
 	
 	ArrayOp(T[] obj){
 		this.obj = obj;
 	}
 	
 	double addArray(){
 		double sum = 0;
 		for(int i = 0; i < obj.length; i++){
 			sum += obj[i].doubleValue();
 		}
 		return sum;
 	}
 	
 	void isEqual(ArrayOp<? extends Number> obj2) throws UnmatchedSumException{
 		double sum1 = this.addArray();
 		double sum2 = obj2.addArray();
 			
 		if(sum1 != sum2){
 			throw new UnmatchedSumException("Arrays Sum are not Equal!");
 		}
 			System.out.println("Sums are equal!");
 	}
 	
 	
 }
