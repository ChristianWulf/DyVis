package examples;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class RequestHandler {

	public static void main(String[] args) throws IOException, InterruptedException {
		/**
		 * Scenario:<br>
		 * read in request in loop.<br>
		 * Bottleneck:<br>
		 * while processing it, new request come in and must wait.
		 */
		int size = 50;
		byte[] buf = new byte[size];
		InputStream is = new ByteArrayInputStream(buf);
		int data;
		while ((data = is.read()) != -1) {
			System.out.println(data);
			// simulate long processing
			Thread.sleep(3000);
		}
	}

}
