all: Chess.java Cell.java
	javac -g Cell.java
	javac -g  Chess.java
	java Chess

debug:	Chess.class
	jdb Chess