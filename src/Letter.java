import java.util.Random;

public class Letter{
	String unused, unusual,uncommon, common, moreused, overused;
	String vocal, nonvocal;
	String  i,h, m, n, u, e, s, t, q, cs;    
View v = new View();
	public Letter() {
	
		 unused = new String("jﬂyxq");
		 unusual = new String("kwzpv");
		 uncommon = new String("gcombf");
		 common = new String("dhlu");
		 moreused = new String("irsta");
		 overused = new String("en");
		 vocal = new String("aeiou");
		 nonvocal = new String("bcdfghjklmnpqrstvwxyz");
		 i = "i";
		 h = "h";
		 m = "m";
		 n = "n";
		 u = "u";
		 e = "e";
		 s = "s";
		 t = "t";
		 q = "q";
		 cs = "c";
	}
	

public String Rndm_Letter(int j) {
	String alphabet = new String("abcdefghijklmnopqrstuvwxyz");
	Random r = new Random();
	String result = "";
	for (int i = 0; i < j; i++) {
		char c = alphabet.charAt(r.nextInt(26));
		String s = Character.toString(c);
		result = s + "" + result;
		
	}
	System.out.println(result);
	return result;
	
	//v.setTextf(letter);
}

public String Org_Letter(int j) {
	
	int zufallszahl1;
	int zufallszahl2;
	Random r = new Random();
	String s = "";
	
		for (int i = 1; i <j;) {
			
			char[] c = new char[j];
	
		    zufallszahl1 = (int)(Math.random() * 100);
		    zufallszahl2= (int)(Math.random() * 100);
		    
				if(zufallszahl1 >= 0 && zufallszahl1 <= 26  ) {
					c[i] = (overused.charAt(r.nextInt(2)));
						 
				  }
				if(zufallszahl1 >= 27 && zufallszahl1 <= 51 ) {
					c[i] = (moreused.charAt(r.nextInt(5)));
					
				 }
					
				if(zufallszahl1 >= 52 && zufallszahl1 <= 68) {	
					c[i] = (common.charAt(r.nextInt(4)));
				
				}
				
				if(zufallszahl1 >= 69 && zufallszahl1 <= 86 ) {	
					c[i] = (uncommon.charAt(r.nextInt(6)));
					if(c[i-1] == cs.charAt(0) || zufallszahl1 >= 20 ) {
						 c[i] = h.charAt(0);
								}
				}
				
				if(zufallszahl1 >= 87 && zufallszahl1 <= 95) {	
					c[i] = (unusual.charAt(r.nextInt(5)));
				
				}
				if(zufallszahl1 >= 96 && zufallszahl1 <= 100) {	
					c[i] = (unused.charAt(r.nextInt(5)));
				if(c[i] == q.charAt(0)) 
					{
						
					 c[i+1] = u.charAt(0);
					 i++;
						 }

				if(zufallszahl2 >= 96 && zufallszahl1 <= 100) {

		 
		}
		if(c[i-1] == m.charAt(0) && zufallszahl2 >= 70 && c[i] != m.charAt(0) ) {
			 
			c[i] = m.charAt(0);
			 
			}
		if(c[i-1] == n.charAt(0) && zufallszahl2 >= 70 && c[i] != n.charAt(0)  ) {
			 c[i] = n.charAt(0);
			 
			}
		if(c[i-1] == s.charAt(0)&& zufallszahl2 >= 50 && c[i] != s.charAt(0)  ) {
			 c[i] = t.charAt(0);
			 
			}
		if(c[i-1] == t.charAt(0) && zufallszahl1 >= 50 && c[i] != t.charAt(0) && c[i-2] != s.charAt(0)    ) {
			 c[i] = t.charAt(0);
			 }
				
		else{
		c[i] = (vocal.charAt(r.nextInt(5)));	
		}
		
	
    
	if(c[i-1] == q.charAt(0)) {
			 c[i] = u.charAt(0);
			 }
				} 
	
	s = s+c[i];
	System.out.println("");
	i++;
	return s;
	
	}
	return s;
	
}
}
			


		
	
	
