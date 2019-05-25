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
		 * repositório no Github a. ATENÇÃO: se seu ambiente de desenvolvimento não gera
		 * o arquivo .gitignore automaticamente, escolha o seu tipo desejado de
		 * .gitignore na tela de criação de repositório do Github 3. Abra um terminal na
		 * pasta do seu projeto 4. IMPORTANTE: certifique-se de estar identificado no
		 * Git do seu computador (nome e email) git config --list git config --global
		 * user.name "NOME" git config --global user.email "EMAIL"
		 * 
		 * git init -> inicia um novo repositório local na pasta do seu projeto git
		 * remote add origin URL.git -> associa seu repositório remoto com o apelido
		 * "origin" git pull origin master -> atualiza seu repositório local em relação ao repositório remoto 
		 * git status -> autoexplicativo 
		 * git add . -> adiciona todos os arquivos ao stage 
		 * git commit -m "Projeto criado" -> salva uma nova
		 * versão do projeto 
		 * git push -u origin master -> envia o repositório local para o repositório remoto
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
		 * A sequência de committs deve ser respeitada. 
		 * Suponha que o repositório do seu computador estava em uma versão atrasada em relação ao Github, 
		 * daí você esquece de atualizá-lo (git pull origin master) e faz algumas alterações.
		 * O Git não vai aceitar o push neste caso.
		 */
		

	}

}
