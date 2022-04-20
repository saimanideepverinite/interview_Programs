package daily_updates.tuesday;

class Addition{
	
	void  add(int a, int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println("in Addition class");
		System.out.println(a+b+c);
	}
}
class Sum extends Addition{
	
	void  add(int a, int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println("in sub class");
		System.out.println(a+b+c);
		super.add(a, b, c);
	}
}
class SubAdd extends Sum{
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {		
		super.add(a,b,c);
		System.out.println("int clild class"+" "+a+b+c);
	}
}

class MLandMR {
	public static void main (String args[]) {
		Addition a=new SubAdd();
		a.add(1,20);
		a.add(1,2,30);
		a.add(1, 7);
		
		
	}
}
