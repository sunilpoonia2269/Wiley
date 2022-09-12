package com.sunil.afactory;

public class ComputerFactory {

	public static Computer createNewComputer(ComputerAbstractFactory caf) {
		return caf.createComputer();
	}
}
