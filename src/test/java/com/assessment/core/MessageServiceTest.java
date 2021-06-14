package com.assessment.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MessageServiceTest {

	@DisplayName("message testing")
	@Test
	void messageTest() {
		assertEquals("welcome to jenkins",MessageService.get());
	}
}