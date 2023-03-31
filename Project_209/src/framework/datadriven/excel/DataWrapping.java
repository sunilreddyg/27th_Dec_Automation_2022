package framework.datadriven.excel;

public class DataWrapping {

	public static void main(String[] args) {
		
		
		//Auto-boxing   [Converting primitive to non primitive]
		double price=123.234;
		Double newprice=new Double(price);
		System.out.println(newprice.intValue());
		System.out.println(newprice.toString());
		
		//Converting Int value into String value
		int val=10;
		String Sval=new Integer(val).toString();
		System.out.println(Sval);
		
		//Converting String charcters into Numeric values
		String id="300";
		int NID=Integer.parseInt(id);
		System.out.println(NID);
		
		
		//Unboxing  [Converring non primitive to primitve]
		double oldprice=newprice;
		System.out.println(oldprice);
		
		
		
		
		

	}

}
