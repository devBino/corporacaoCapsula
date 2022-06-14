package br.com.bino.avancado.repositories.prototype;

import java.util.Map;
import java.util.HashMap;

public class ComputerTools implements Cloneable {

	private Map<String, Double> tools;

	public ComputerTools() {
		tools = new HashMap<String, Double>();
		tools.put("mouse", 34.99);
	}
	
	public ComputerTools(HashMap<String, Double> pTools) {
		tools = pTools;
	}
	
	public Map<String, Double> getTools() {
		return tools;
	}

	public void setTools(Map<String, Double> tools) {
		this.tools = tools;
	}

	@Override
	public ComputerTools clone() throws CloneNotSupportedException {
		ComputerTools computerToolsClone = (ComputerTools) super.clone(); 
		return computerToolsClone;
	}
	
	@Override
	public String toString() {

		StringBuilder strData = new StringBuilder();
		
		strData.append("ComputerTools [");
		
		tools.keySet().forEach(k -> {
			strData
				.append("(Name = ")
				.append(k)
				.append(", ")
				.append("price = ")
				.append(String.valueOf(tools.get(k)))
				.append(") ");
		});
		
		strData.append("]");
		
		return strData.toString();
		
	}
	
}
