package com.BridgeLabz.BasicCorePrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestUserNAme {

	@Test
	void givenlp_afterchangingusername_itshouldreplaceusernamewithlp()throws Exception {
assertEquals("Hello Lp, How are you? ",UserName.replace("Lp"));
assertEquals("Hello hari, How are you? ",UserName.replace("hari"));
assertEquals("Hello puni, How are you? ",UserName.replace("puni"));
assertEquals("Hello 123, How are you? ",UserName.replace("123"));
assertEquals("Hello xyz, How are you? ",UserName.replace("xyz"));
	}

}
