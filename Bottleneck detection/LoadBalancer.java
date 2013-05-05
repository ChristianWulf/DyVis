package examples;

import kieker.tpmon.annotation.TpmonExecutionMonitoringProbe;

public class LoadBalancer {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * Scenario:<br>
		 * process many tasks at once<br>
		 * Bottleneck:<br>
		 * starting thread for each tasks use more time than starting one for chunk of tasks
		 */
		doSomething();
		Thread.sleep(1000);
		System.exit(0);
	}
	
	@TpmonExecutionMonitoringProbe
	private static void doSomething() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done.");
	}
}
