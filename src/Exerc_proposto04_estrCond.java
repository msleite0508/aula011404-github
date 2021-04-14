import java.util.Locale;
import java.util.Scanner;

public class Exerc_proposto04_estrCond {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int duracao;
		
		
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		
		sc.close();
	
	}

}
