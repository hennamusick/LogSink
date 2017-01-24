package com.rsm.cloud;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MyChannels {
	
	@Output
	MessageChannel odds();
	
	@Output
	MessageChannel evens();

}
