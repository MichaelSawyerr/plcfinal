public static void exp() {
	 System.out.println("Enter <expr>\n");
	
	 term();
	
	 while (nextToken == ADD_OP || nextToken == SUB_OP) {
		 lex();
		 term();
	 }
System.out.println("Exit <expr\n"):
}


public static void term() {
	 System.out.println("Enter <term>\n");
	
	 factor();
	
	 while (nextToken == MULT_OP || nextToken == DIV_OP) {
		 lex();
		 factor();
	 }
	  System.out.println("Exit <term>\n");
}

public static void factor(){
	 System.out.println("Enter <factor>\n"):
	
	 if (nextToken == IDENT || nextToken == INT_LIT)
		
		 lex();
		
	 else { if (nextToken == LEFT_PAREN) {
		 lex();
		 expr();
		 if (nextToken == RIGHT_PAREN)
		 	lex();
		 else
		 	error();
		 }
		
		 parenthesis */
		 else
		 error();
	 }
	 System.out.println("Exit <factor>\n");
}





