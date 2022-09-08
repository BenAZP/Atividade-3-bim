
public class Mobile {
	private String Modelo;
	private String Marca;
	private CartaoSIM cartaoSIM;

	public Mobile() {
	this.Modelo = "";
	this.Marca = "";
	this.cartaoSIM = new CartaoSIM();
	}
	public Mobile(String Modelo, String marca, String Operadora, String Tamanho, Integer numero) {
	this.Modelo = Modelo;
	this.Marca = marca;
	this.cartaoSIM = new CartaoSIM(Operadora, Tamanho, numero);
	}
	public String getModelo() {
	return Modelo;
	}
	public void setModelo (String Modelo) {
	this.Modelo = Modelo;
	}

	public String getMarca() {
	return Marca;
	}
	public void setMarca (String marca) {
	this.Marca = marca;
	}

	public CartaoSIM getCartaoSIM() {
	 return cartaoSIM;
	}  
	public void setCartaoSIM(CartaoSIM cartaoSIM) {
	this.cartaoSIM = cartaoSIM;

	}

}
