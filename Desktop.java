package org.system;

public class Desktop extends Computer{
	 
	public void desktopSize() {
		System.out.println("The sze of the Desktop is 40inches");
	}

	public static void main(String[] args) {
		
		Desktop desk=new Desktop();
		desk.computerModel();
		desk.desktopSize();

	}

}
