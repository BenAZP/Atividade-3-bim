import java.time.LocalDate;

public class Identidade {
	private String Numero;
	private LocalDate DataEmissao;
	
	public Identidade() {
		this.Numero = "";
		this.DataEmissao = LocalDate.now();
	}
	 public Identidade(String numero, Integer dia, Integer mes, Integer ano) {
	     this.Numero = numero;
	     this.DataEmissao = LocalDate.of(dia, mes, ano);      
	      }
	      public String getNumero() {
	  return Numero;
	  }
	  public void setNumero (String numero) {
	  this.Numero = numero;
	  }
	  public LocalDate getDataEmissao() {
		  return DataEmissao;
		  }
		  public void setDataEmissao (LocalDate dataEmissao) {
		  this.DataEmissao = dataEmissao;
		  }

}
