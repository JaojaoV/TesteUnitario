package Principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import Animais.Animal;
import Animais.Cachorro;
import Animais.Exotico;
import Animais.Gato;


public class Principal {
	private static List<Animal> animais = new ArrayList<>();
	
	 private static void listarAnimais() {
	        if (animais.isEmpty()) {
	            System.out.println("Nenhum animal cadastrado.");
	            return;
	        }
	        for (int i = 0; i < animais.size(); i++) {
	            Animal a = animais.get(i);
	            System.out.printf("%d - %s - NOme: %s, %d anos, Status: %s\n", i+1, a.getEspecie(), a.getNome(), 2025 - a.getAnoNasc(), a.getStatus());
	        }
	    }

	public static void main(String args[])
	{
		
		///Gato g = new Gato("Nicole",2007,"Gato","nao tem",Gato.TesteFelv.Positivo ,"Siamês" );
		Scanner scan = new Scanner(System.in);
		
		
		int escolha = 1;	
		while(escolha > 0) {
			 System.out.printf("\nListar Animais - 1\nRegistrar Animais - 2\nSair - 0\n");
			 escolha = Integer.parseInt(scan.nextLine());
			 if(escolha == 1) {
				 listarAnimais();
			 }
			 else if(escolha == 2) {
				 System.out.printf("Novo Cachorro - 1 \nNovo Gato - 2\nNOvo Animal Exótico - 3\n");
					int opt = Integer.parseInt(scan.nextLine());
					if (opt == 1) {
						System.out.printf("Nome:\n");
						String n = scan.nextLine();
						System.out.printf("Ano de Nascimento: \n");
						int a = Integer.parseInt(scan.nextLine());
						System.out.printf("Historico: \n");
						String h = scan.nextLine();
						
						Cachorro.NivelAdestramento ad = null;
						while(ad == null) {  
							System.out.printf("Adestramento: ('Basico', 'Intermediario', 'Avancado')\n");
							String resp = scan.nextLine();
							
							try {
								ad = Cachorro.NivelAdestramento.valueOf(resp);
							}
							catch(IllegalArgumentException e){
							System.err.printf("Invalido\n");
							}
						}
						System.out.printf("Raça: \n");
						String r = scan.nextLine();
						
					animais.add( new Cachorro(n,a,"Cachorro",h,r, ad));
						
					System.out.printf("Animal Cadastrado");
						
						///System.out.printf("Pet Registrado :) | %s , %d anos, Especie: %s, Raca: %s, Adestramento"
						///		+ ": %s, ADOCAO: %s\n", c.getNome(), 2025 - c.getAnoNasc(), c.getEspecie(), c.getRaca(), c.getNivelAdestramento(), c.getStatus());
			 
					}
					else if(opt == 2) {
						System.out.printf("Nome:");
						String n = scan.nextLine();
						System.out.printf("Ano de Nascimento: ");
						int a = Integer.parseInt(scan.nextLine());
						System.out.printf("Historico: ");
						String h = scan.nextLine();
						
						Gato.TesteFelv teste = null;
						while(teste == null) {  
							System.out.printf("Teste Felv: ( 'Positivo', 'Negativo') ");
							String t = scan.nextLine();
							
							try {
								teste = Gato.TesteFelv.valueOf(t);
							}
							catch(IllegalArgumentException e){
							System.err.printf("Invalido\n");
							}
						}
						System.out.printf("Raça: ");
						String r = scan.nextLine();
						
						animais.add(new Gato(n,a,"Gato",h,r, teste));
						System.out.printf("Animal Cadastrado");
						
						///System.out.printf("Pet Registrado :) | %s ,%d anos, Especie: %s, Raca: %s, Felv: %s, ADOCAO: %s\n", g.getNome(), 2025 - g.getAnoNasc(), g.getEspecie(), g.getRaca(), g.getTesteFelv(), g.getStatus());
			 }
			else if(opt == 3) {
				System.out.printf("Nome:");
				String n = scan.nextLine();
				System.out.printf("Ano de Nascimento: ");
				int a = Integer.parseInt(scan.nextLine());
				System.out.printf("Especie:");
				String es = scan.nextLine();
				System.out.printf("Historico: ");
				String h = scan.nextLine();
				
				Exotico.Perigoso perigoso = null;
				while(perigoso == null) {  
					System.out.printf("Perigoso( 'Sim', 'Nao' ):");
					String r = scan.nextLine();
					
					try {
						perigoso = Exotico.Perigoso.valueOf(r);
					}
					catch(IllegalArgumentException e){
					System.err.printf("Invalido\n");
					}
				}
				System.out.printf("Raça: ");
				String r = scan.nextLine();
				
				animais.add( new Exotico(n,a,es,h,r, perigoso));
				
				System.out.printf("Animal Cadastrado");
				
				///System.out.printf("Pet Registrado :) | %s ,%d anos, Especie: %s, Raca: %s, Perigoso: %s, ADOCAO: %s\n", e.getNome(), 2025 - e.getAnoNasc(), e.getEspecie(), e.getRaca(), e.getPerigoso(), e.getStatus());
	
			}
			 
		}
			 
		
		
		}
		
	}
	
	
}
