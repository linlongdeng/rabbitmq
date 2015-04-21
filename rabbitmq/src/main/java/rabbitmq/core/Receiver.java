package rabbitmq.core;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Receiver {


	/**
	 * 接收消息的方法
	 * @param message
	 */
	public Map<String, Object> receiveMessage(Map<String, Object> message) {
		Set<Entry<String, Object>> set = message.entrySet();
		System.out.println("收到消息:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		for(Entry<String, Object> entry : set){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		return message;
		
	}

}
