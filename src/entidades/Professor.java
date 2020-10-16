package entidades;

public class Professor extends Pessoa {
	
	
	private String materiaLecionada;
    private boolean mestre; 
    
    
	public Professor(String nome, String materiaLecionada)  {
		super(nome);
		this.materiaLecionada = materiaLecionada;
 
 
		
		

	}


	public String getMateriaLecionada() {
		return materiaLecionada;
	}


	public void setMateriaLecionada(String materiaLecionada) {
		this.materiaLecionada = materiaLecionada;
	}


	public boolean isMestre() {
		return mestre;
	}


	public void setMestre(boolean mestre) {
		this.mestre = mestre;
	}
} 
