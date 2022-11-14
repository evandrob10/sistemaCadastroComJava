package Entites;

public class Participante {
	private String name;
	private Integer idade;
	private Double altura;
	private Double peso;
	
	public Participante (String name, Integer idade , Double altura, Double peso) {
		this.name = name;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public Integer idade () {
		return idade;
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public Double getAltura() {
		return altura;
	}
	
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public Double getPeso() {
		return peso;
	}
	
	public String calculoIMC() {
		Double imc = peso / Math.pow(altura, 2);
		if(imc < 18.5) {
			return "Abaixo do Peso";
		}else if(imc < 25) {
			return "Peso Normal";
		}else if(imc < 30) {
			return "Sobrepeso";
		}else if(imc < 35) {
			return "Obesidade Grau I";
		}else if(imc < 40) {
			return "Obesidade grau II";
		}else {
			return "Obesidade Grau III ou Mórbida";
		}
	}
	
	public String toString() {
		return String.format("Nome: %s | idade: %d | altura: %.2f | peso: %.2f | imc: %s", name ,idade,altura, peso,calculoIMC());
	} 
	
}
