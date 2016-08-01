package nastya.app;

import fourth.app.Service3;
import third.app.Service2;

public class MainApp {

	private static Service1 service1 = new Service1Impl();
	private static Service2 service2 = new Service2();
	private static Service3 service3 = new Service3();

	public static void main(String[] args) {
		System.out.println("App Started");

		System.out.println("Check Service 1:");
		System.out.println("Version of Service1 is " + service1.getVersion());

		System.out.println("Check Service 2:");
		service2.printServiceInfo();

		System.out.println("Check Service 3:");
		service3.printServiceInfo();

		// TODO
		// 1) build project
		// 2) investigate project structure (draw diagram)
		// 3) investigate maven dependency tree plugin (receive tree)
		// 4) run unit tests one by one
		// 5) adjust project structure to fix Test1
		// ...
	}

}

