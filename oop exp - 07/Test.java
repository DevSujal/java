import java.util.*;
import java.io.*;

class Test{
	public static void main(String args[]){
		ArrayList<Product> prList  = new ArrayList<Product>();
		
		try(BufferedReader br = new BufferedReader(new FileReader("Product.txt"))){
			String str[], line;
			while((line = br.readLine()) != null){
				str = line.split(",");
				prList.add(new Product(str[0], Double.parseDouble(str[1]), str[2], Double.parseDouble(str[3])));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		// System.out.println(prList);
		// Iterator<Product> itr = prList.iterator();

		// while(itr.hasNext()){
		// 	System.out.println(itr.next() + " ");
		// }

		// System.out.println("Product which has max Discount 50% are below : ");

		// for(int i = 0; i < prList.size(); i++){
		// 	if(prList.get(i).getMaxDis() == 50.0){
		// 		System.out.println(prList.get(i));
		// 		System.out.println("Final cost = " + (0.5*prList.get(i).getCost()));
		// 	}
		// }
		System.out.println("Sorting Based on Cost if same then on the basis of max discount and if also same then on the basis of product name : ");
		Collections.sort(prList, new CostSorter());
		// System.out.println("Sorting Based on manufacturer : ");
		// Collections.sort(prList, new ManfSorter());
		System.out.println(prList);

		//  System.out.println("SKYBAG".compareTo("VIVO"));
		
	}
}
