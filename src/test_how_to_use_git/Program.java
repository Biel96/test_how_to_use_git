package test_how_to_use_git;

public class Program {

	public String name;
	public int number;

	public Program(String name, int cpf) {
		this.name = name;
		this.number = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCpf() {
		return number;
	}

	public void setCpf(int cpf) {
		this.number = cpf;
	}
	
	public String toString() {
		return "Program: "
				+ name
				+"\nNumero: "
				+number;
	}

	public static void main(String[] args) {

		/*
		 * Passos para linkar com o github:
		 * 
		 * 1. Crie um novo projeto no seu ambiente de desenvolvimento 2. Crie um novo
		 * reposit�rio no Github a. ATEN��O: se seu ambiente de desenvolvimento n�o gera
		 * o arquivo .gitignore automaticamente, escolha o seu tipo desejado de
		 * .gitignore na tela de cria��o de reposit�rio do Github 3. Abra um terminal na
		 * pasta do seu projeto 4. IMPORTANTE: certifique-se de estar identificado no
		 * Git do seu computador (nome e email) git config --list git config --global
		 * user.name "NOME" git config --global user.email "EMAIL"
		 * 
		 * git init -> inicia um novo reposit�rio local na pasta do seu projeto git
		 * remote add origin URL.git -> associa seu reposit�rio remoto com o apelido
		 * "origin" git pull origin master -> atualiza seu reposit�rio local em rela��o ao reposit�rio remoto 
		 * git status -> autoexplicativo 
		 * git add . -> adiciona todos os arquivos ao stage 
		 * git commit -m "Projeto criado" -> salva uma nova
		 * vers�o do projeto 
		 * git push -u origin master -> envia o reposit�rio local para o reposit�rio remoto
		 * 
		 */
		String name = "Hello!";
		int number = 123456789;
		
		Program x = new Program(name, number);
		
		System.out.println(x.toString());
		
		
		System.out.println("----------");
		
		x.setName("Hi!");
		x.setCpf(987654321);
		
		System.out.println(x.toString());
		
		
		/*
		 * A sequ�ncia de committs deve ser respeitada. 
		 * Suponha que o reposit�rio do seu computador estava em uma vers�o atrasada em rela��o ao Github, 
		 * da� voc� esquece de atualiz�-lo (git pull origin master) e faz algumas altera��es.
		 * O Git n�o vai aceitar o push neste caso.
		 */
		

	}

}
