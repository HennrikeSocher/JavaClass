
public class Calculos {
	static int value, base, result;
	static float response;
	public static void main(String[] args) {
		int option;
		do {
			Menu();
			option = Console.readInt("Informe a opção desejada: ");
			switch(option){
			case 1:
				value = Console.readInt("\nInforme o valor:");
				value = Methods.calculateFatorial(value);
				System.out.println("O resultado é " + value);
				break;
			case 2:
				int exp;
				base = Console.readInt("\nInforme a Base: ");
				exp = Console.readInt("\nInforme o Exponencial: ");
				result = Methods.calculateExponencial(base, exp);
				System.out.println("O resultado de " + base + " elevado a " + exp + " é: " + result);
				break; 
			case 3:	
				int percent;
				value = Console.readInt("\nInforme o valor: ");
				percent = Console.readInt("\nInforme a porcentagem: ");
				response = Methods.calculatePercent(value, percent);
				System.out.println("O resultado da porcentagem de " + value + " % "  + percent + " é de " + response);
				break;
			case 4:
				int height;
				base = Console.readInt("\nInforme o valor: ");
				height = Console.readInt("\nInforme o valor: ");
				response = Methods.calculateTri(base, height);
				System.out.println("O resultado do calculo da area do triangulo é: " + response);
				break;
			case 5:
				System.out.println("Saindo...");
				break;
			default: 
				System.out.println("Opção invalida");
				break;
			}
	}while (option !=5);
	}
	private static void Menu() {
		System.out.println("\n\n MENU PRINCIPAL ");
		System.out.println("1 - Fatorial");
		System.out.println("2 - Exponenciação");
		System.out.println("3 - Porcentagem");
		System.out.println("4 - Area do triangulo");
		System.out.println("5 - Finalizar");
	}
}
