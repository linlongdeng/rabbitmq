package rabbitmq.tracer;

import com.rabbitmq.tools.Tracer;

public class RunTracer {

	private static String listenPort = "5673";
	private static String connectHost = "localhost";
	private static String connectPort = "5672";

	public static void main(String[] args) {
		String[] argsArray = new String[] { listenPort, connectHost,
				connectPort };
		Tracer.main(argsArray);
	}
}
