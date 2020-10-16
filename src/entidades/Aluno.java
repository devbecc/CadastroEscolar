package entidades;

public class Aluno extends Pessoa {	 
		
		private String turma;
		private int notas[]=new int[2];
		
		public Aluno(String nome, String turma, int[] notas) {
			super(nome);
			this.turma = turma;
			this.notas = notas;
		}
		
		
		
 
		}
		
	