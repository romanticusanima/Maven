package third.app;

import nastya.app.Service1;
import nastya.app.Service1Impl;

public class Service2 {

	private Service1 service1 = new Service1Impl();

	public void printServiceInfo() {
		System.out.println("Service2 uses Service1 of version: " + service1.getVersion());
	}
}
