package classe;


public class data1 {
	
	public static void main(String[] args) {
		
		data d1 = new data();
		d1.dia = 7;
		d1.mes = 11;
		d1.ano = 2021;
		
		System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
		
		var d2 = new data();
		d2.dia = 31;
		d2.mes = 12;
		d2.ano = 2020;
		
		System.out.printf("%d/%d/%d", d2.dia, d1.mes, d2.ano);
		
	}
		
}
	


