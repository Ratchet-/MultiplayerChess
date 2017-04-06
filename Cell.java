//package chess;

import java.awt.Point;

public class Cell {

	public char id;
	public final boolean whitePiece;
	public boolean firstMove = true;

	public Cell(char p) {
		boolean whiteStatus = true;
		id = p;
		if(id==0x265A || id==0x265B || id==0x265C || id==0x265D || id==0x265E || id==0x265F) {
			whiteStatus = false;
		}
		whitePiece = whiteStatus;
	}









	public boolean[][] possibleMoves(Point selectedCell, Cell[][] grid) {
		int x = selectedCell.x;
		int y = selectedCell.y;

		boolean[][] moves = {
			new boolean[8], 
			new boolean[8], 
			new boolean[8], 
			new boolean[8], 
			new boolean[8], 
			new boolean[8], 
			new boolean[8], 
			new boolean[8] 
		};

		switch(id) {
			case 0x265F:
			case 0x2659:
				if(grid[selectedCell.x][selectedCell.y+(whitePiece?1:-1)].id == ' ') {
					moves[selectedCell.x][selectedCell.y+(whitePiece?1:-1)] = true;
					if(firstMove) {
						if(grid[selectedCell.x][selectedCell.y+(whitePiece?2:-2)].id == ' ') {
							moves[selectedCell.x][selectedCell.y+(whitePiece?2:-2)] = true;
						}
					}
				}
				break;
		}
		
		return moves;
	}
}
