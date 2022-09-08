
public class CartaoSIM {
	 private String Operadora;
	 private String Tamanho;
	 private Integer numero;
	 
	 public CartaoSIM() {
	 this.Operadora = "";
	 this.Tamanho = "";
	 this.numero = 0;
	 }
	 public CartaoSIM(String Operadora, String Tamanho, Integer Numero) {
	 this.Operadora = Operadora;
	 this.Tamanho = Tamanho;
	 this.numero = Numero;
	 }
	 public String getOperadora() {
	 return Operadora;
	 }
	 public void setOperadora(String Operadora ){
	 this.Operadora = Operadora;  
	 }
	 
	 public String getTamanho() {
	 return Tamanho;
	 }
	 public void setTamanho(String Tamanho ){
	 this.Tamanho = Tamanho;
	 }
	 
	 public Integer getNumero() {
	 return numero;
	 }
	 public void setNumero(Integer Numero) {
	 this.numero = Numero;
	 }

}
