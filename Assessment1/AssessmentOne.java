
public class AssessmentOne{
	public static void main(String[] args) {
		
		int a = 7;
		
		int b = a++ - ++a - a++ + ++a - a--;
		/*  b = 7   - 9   - 9   +  11 - 11;
			b = 7 -18 ;
			b = -11;
		*/
		int c = --a + a-- + ++a + a-- - ++a;
		/*  c =  9  + 9   + 9   + 9   - 9;
			c = 27;
		*/
		System.out.println(b);
		System.out.println(c);

	}
}