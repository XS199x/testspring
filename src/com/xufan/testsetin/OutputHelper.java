package com.xufan.testsetin;

public class OutputHelper {
	IOutputGenerator outputGenerator;

	public IOutputGenerator getOutputGenerator() {
		return outputGenerator;
	}

	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
	
	public void generateOutput(){
		outputGenerator.generateOutput();
	}
}
