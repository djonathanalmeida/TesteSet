package entidades;

import java.util.Objects;

public class Produto {

	private String descricao;
	private Double preco;

	public Produto(String descricao, Double preco) {

		this.descricao = descricao;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(preco, other.preco);
	}

	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", preco=" + preco + "]";
	}

}
