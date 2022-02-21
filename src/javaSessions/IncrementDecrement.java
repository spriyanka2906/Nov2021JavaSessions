package javaSessions;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		//1.Post increment
		int a=1;
		int b=a++;
		
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c=-99;
		int d=c++;
		
		System.out.println(c); //-98
		System.out.println(d); //-99
		
		
		//2.Pre-increment
		
		int h=1;
		int g=++h;
		
		System.out.println(h); //2
		System.out.println(g); //2
		
		int l=-98;
		int i=++l;
		System.out.println(l);
		System.out.println(i);
		
		
		int t=10;
		System.out.println(t++);//10
		System.out.println(t); //11
		System.out.println(t++);
		System.out.println(t);
		
	//Post Decrement
		
		int s=2;
		int q=s--;
		System.out.println(s);//1
		System.out.println(q);//2
		
		//pre decrement
		
		int u=2;
		int o=--u;
		
		System.out.println(u);//1
		System.out.println(o);//1
		
		double ff=12.33;
		System.out.println(++ff); //13.33
		
		char c1='a';
		System.out.println(++c1);
		System.out.println((int)++c1);
	}

}
