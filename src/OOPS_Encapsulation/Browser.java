package OOPS_Encapsulation;

public class Browser {
	

		public void launchBrowser() {
			System.out.println("trying to launch the Browser");
			checkBrVersion();
			checkOS();
			checkRAM();
			checkMachineStorage();
			System.out.println(" Browser is launched....");
		}

		private void checkBrVersion() {
			System.out.println("checkBrVersion");
		}

		private void checkOS() {
			System.out.println("checkOS");
		}

		private void checkRAM() {
			System.out.println("checkRAM");
		}

		private void checkMachineStorage() {
			System.out.println("checkMachineStorage");

		}

	}


