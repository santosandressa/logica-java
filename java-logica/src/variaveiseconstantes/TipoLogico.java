package variaveiseconstantes;

public class TipoLogico {

	public static void main(String[] args) {
		Boolean verdadeiro = true;
		System.out.println("Vari�vel verdadeira: " + verdadeiro);
		
		Boolean falso = false;
		System.out.println("Vari�vel falsa: " + falso);
		
		System.out.println("-----------------------------------------");
		
		Integer idade = 19;
		Boolean podeTirarCarteira = idade >= 18;
	
		System.out.println("Pode tirar carteira? " + podeTirarCarteira);
	}
}