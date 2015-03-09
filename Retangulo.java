class Retangulo{
	public int base;
	public int altura;
	public void calc(){
		int result;
		result = (2*base)+(2*altura);
		System.out.println("Perimetro = "+result);
		result = (base*altura);
		System.out.println("Area = "+result+"\n");
	}
}
