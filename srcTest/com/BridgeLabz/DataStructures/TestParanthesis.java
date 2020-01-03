package com.BridgeLabz.DataStructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestParanthesis {

	@Test
	void givenexp_aftercheckingforparanthesis_itshouldbetrue()throws Exception {
		  char exp[] = {'{','(',')','}','[',']'}; 
		  char exp1[] = {'(',')','}','[',']'}; 
		  char exp2[] = {'{','}','[',']'}; 
		  char exp3[] = {'{','(','}','[',']'}; 
		  char exp4[] = {'{','(',')','[',']','}'}; 
		  char exp5[] = {'[','{','(',')','}',']'}; 
		 
		assertEquals(true,Paeanthesis.areParenthesisBalanced(exp));
		assertEquals(false,Paeanthesis.areParenthesisBalanced(exp1));
		assertEquals(true,Paeanthesis.areParenthesisBalanced(exp2));
		assertEquals(false,Paeanthesis.areParenthesisBalanced(exp3));
		assertEquals(true,Paeanthesis.areParenthesisBalanced(exp4));
		assertEquals(true,Paeanthesis.areParenthesisBalanced(exp5));
		
	}

}
