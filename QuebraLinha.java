import java.util.Scanner;
import java.util.Vector;
public class QuebraLinha {
	public static void main(String[] args){
		Scanner entrada= new Scanner(System.in);
		String controle="s";
		while(controle.equalsIgnoreCase("s")){
			System.out.println("Digite sua Frase:");
			String frase=entrada.nextLine();
			System.out.println("Informe quantas colunas quer dividir:");
			int colunas=entrada.nextInt();
			Object[] fraseQuebrada = quebrar(frase,colunas);
			for(int i=0;i<fraseQuebrada.length;i++){
				System.out.println(fraseQuebrada[i]);
			}
			System.out.println("Deseja digitar outra Frase?");
			do{
				System.out.println("DIGITE S-SIM");
				System.out.println("DIGITE N-NÃO");
				controle=entrada.nextLine();
				if(!controle.equalsIgnoreCase("n")&&!controle.equalsIgnoreCase("s")){
					System.out.println("OPÇÃO INVÁLIDA");
				}
			}while(!controle.equalsIgnoreCase("s")&&!controle.equalsIgnoreCase("n"));
		}		
	}
	public static Object[] quebrar(String frase, int colunas) {
		String[] fraseQuebrada=frase.split(" ");
		int contaCaracteres=0;
		String montagem="";
		Vector vectorWorker = new Vector();
		for(int i=0;i<fraseQuebrada.length;i++){
			if(colunas<fraseQuebrada[i].length()){
				montagem=fraseQuebrada[i]+" Não pode ser quebrada no espaço especificado";
				vectorWorker.add(montagem);
				return vectorWorker.toArray();
			}
		}
		for(int i=0;i<fraseQuebrada.length;i++){
			
			if(montagem.length()+fraseQuebrada[i].length()>=colunas){
				contaCaracteres=0;
				vectorWorker.add(montagem);
				montagem="";
			}
			contaCaracteres=contaCaracteres+fraseQuebrada[i].length();	
			
			if(contaCaracteres<=colunas){
				if(montagem.equals("")){
					montagem=fraseQuebrada[i];
				}else{
					montagem=montagem+" "+fraseQuebrada[i];
					contaCaracteres++;
				}
			}	
		}
		vectorWorker.add(montagem);
		return vectorWorker.toArray();
	}
}