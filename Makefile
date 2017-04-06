all: Chess.java Cell.java
	javac Cell.java
	javac Chess.java
	java Chess

debug:	Chess.class
	jdb Chess