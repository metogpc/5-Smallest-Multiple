
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2520, 1'den 10'a kadar kalan say�lar�n her birine b�l�nebilen en k���k say�d�r.
			1'den 20'ye kadar olan t�m say�larla e�it olarak b�l�nebilen en k���k pozitif say� nedir ?
		 */
		boolean a=true;
		int sayi=11;//12=4*3 , 14=7*2 , 15=5*3 , 16=8*2 , 18 =6*3 , 20=10*2 , olduklar� i�in 11 den ba�lad�m
		int c=0;
		while(a) {
			
			for(int i=1;i<=20;i++) {
				if(sayi%i==0) {
					c++;
				}
			}
			
			if(c==20) {
				a=false;
			}
			else {
				sayi++;
				c=0;
			}
		}
		
		System.out.println(sayi);

		
	}

}
