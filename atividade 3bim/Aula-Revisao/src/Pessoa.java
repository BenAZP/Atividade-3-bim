import java.time.LocalDate;

public class Pessoa {
	private String Nome;
	private LocalDate DataNascimento;
	private Identidade RG;
	 
	public Pessoa() {
		this.Nome = "";
		this.DataNascimento = LocalDate.now();
		this.RG = new Identidade();
 	}
	public Pessoa(String Nome, Integer dia, Integer mes, Integer ano, String Numero) {
		this.Nome = Nome;
		this.DataNascimento = LocalDate.of(dia, mes, ano);
		this.RG = new Identidade(Numero, dia, mes, ano);
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public LocalDate getDataNacimento() {
		return DataNascimento;
	}
	public void setDataNascimento(LocalDate DataNascimento) {
		this.DataNascimento = DataNascimento;
	}
	public Identidade getRG() {
		return RG;	
	}
    public void setRG(Identidade RG) {
    	this.RG = RG;
    }
	
}
