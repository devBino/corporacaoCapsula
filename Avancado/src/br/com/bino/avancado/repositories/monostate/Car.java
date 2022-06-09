package br.com.bino.avancado.repositories.monostate;

public class Car {
	
	protected String factoryName;
	protected String nameCar;
	protected Integer qtdPorts;
	
	public Car(String pFactoryName, String pNameCar, Integer pQtdPorts) {
		factoryName = pFactoryName;
		nameCar = pNameCar;
		qtdPorts = pQtdPorts;
	}

	public String getFactoryName() {
		return factoryName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}
	
	public String getNameCar() {
		return nameCar;
	}

	public void setNameCar(String nameCar) {
		this.nameCar = nameCar;
	}

	public Integer getQtdPorts() {
		return qtdPorts;
	}

	public void setQtdPorts(Integer qtdPorts) {
		this.qtdPorts = qtdPorts;
	}

	@Override
	public String toString() {
		
		return new StringBuilder()
				.append("Car [ ")
				.append("factoryName = ")
				.append(factoryName)
				.append(", ")
				.append("nameCar = ")
				.append(nameCar)
				.append(", ")
				.append("qtdPorts = ")
				.append(String.valueOf(qtdPorts))
				.append(" ]").toString();
		
	}

}
