//package chess;

import java.awt.Point;

public class Cell
{
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
  








  public boolean[][] possibleMoves(Point selectedCell, Cell[][] grid)
  {
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
      new boolean[8] };
    
    if (id == 0x2659) {
      if ((y != 0) && (x][(y - 1)].id == ' ')) {
        moves[x][(y - 1)] = 1;
        if ((firstMove) && (x][(y - 2)].id == ' ')) moves[x][(y - 2)] = 1;
      }
      if ((x != 7) && (y != 0) && (x + 1)][(y - 1)].id != ' ') && (!x + 1)][(y - 1)].whitePiece)) moves[(x + 1)][(y - 1)] = 1;
      if ((x != 0) && (y != 0) && (x - 1)][(y - 1)].id != ' ') && (!x - 1)][(y - 1)].whitePiece)) moves[(x - 1)][(y - 1)] = 1;
    }
    else if (id == 0x265F) {
      if ((y != 7) && (x][(y + 1)].id == ' ')) {
        moves[x][(y + 1)] = 1;
        if ((firstMove) && (x][(y + 2)].id == ' ')) moves[x][(y + 2)] = 1;
      }
      if ((x != 7) && (y != 7) && (x + 1)][(y + 1)].id != ' ') && (x + 1)][(y + 1)].whitePiece)) moves[(x + 1)][(y + 1)] = 1;
      if ((x != 0) && (y != 7) && (x - 1)][(y + 1)].id != ' ') && (x - 1)][(y + 1)].whitePiece)) moves[(x - 1)][(y + 1)] = 1;
    }
    else if (id == 0x265C) {
      for (byte x = (byte)(x + 1); x < 8; x = (byte)(x + 1)) {
        if (moves[x][y].id == ' ') {
          moves[x][y] = 1;
        } else {
          if (!moves[x][y].whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
      }
      for (byte x = (byte)(x - 1); x >= 0; x = (byte)(x - 1)) {
        if (moves[x][y].id == ' ') {
          moves[x][y] = 1;
        } else {
          if (!moves[x][y].whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
      }
      for (byte y = (byte)(y + 1); y < 8; y = (byte)(y + 1)) {
        if (moves[x][y].id == ' ') {
          moves[x][y] = 1;
        } else {
          if (!moves[x][y].whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
      }
      for (byte y = (byte)(y - 1); y >= 0; y = (byte)(y - 1)) {
        if (moves[x][y].id == ' ') {
          moves[x][y] = 1;
        } else {
          if (!moves[x][y].whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
      }
    }
    else if (id == 0x2656) {
      for (byte x = (byte)(x + 1); x < 8; x = (byte)(x + 1)) {
        if (moves[x][y].id == ' ') {
          moves[x][y] = 1;
        } else {
          if (moves[x][y].whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
      }
      for (byte x = (byte)(x - 1); x >= 0; x = (byte)(x - 1)) {
        if (moves[x][y].id == ' ') {
          moves[x][y] = 1;
        } else {
          if (moves[x][y].whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
      }
      for (byte y = (byte)(y + 1); y < 8; y = (byte)(y + 1)) {
        if (moves[x][y].id == ' ') {
          moves[x][y] = 1;
        } else {
          if (moves[x][y].whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
      }
      for (byte y = (byte)(y - 1); y >= 0; y = (byte)(y - 1)) {
        if (moves[x][y].id == ' ') {
          moves[x][y] = 1;
        } else {
          if (moves[x][y].whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
      }
    }
    else if (id == 0x265E) {
      byte x = (byte)(x + 2);byte y = (byte)(y + 1);
      if ((x >= 0) && (y >= 0) && (x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x + 1);y = (byte)(y + 2);
      if ((x >= 0) && (y >= 0) && (x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x - 2);y = (byte)(y + 1);
      if ((x >= 0) && (y >= 0) && (x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x - 1);y = (byte)(y + 2);
      if ((x >= 0) && (y >= 0) && (x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x + 2);y = (byte)(y - 1);
      if ((x >= 0) && (y >= 0) && (x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x + 1);y = (byte)(y - 2);
      if ((x >= 0) && (y >= 0) && (x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x - 2);y = (byte)(y - 1);
      if ((x >= 0) && (y >= 0) && (x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x - 1);y = (byte)(y - 2);
      if ((x >= 0) && (y >= 0) && (x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (whitePiece) {
          moves[x][y] = 1;
        }
      }
    }
    else if (id == 0x2658) {
      byte x = (byte)(x + 2);byte y = (byte)(y + 1);
      if ((x >= 0) && (y >= 0) && (x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (!whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x + 1);y = (byte)(y + 2);
      if ((x >= 0) && (y >= 0) && (x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (!whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x - 2);y = (byte)(y + 1);
      if ((x >= 0) && (y >= 0) && (x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (!whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x - 1);y = (byte)(y + 2);
      if ((x >= 0) && (y >= 0) && (x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (!whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x + 2);y = (byte)(y - 1);
      if ((x >= 0) && (y >= 0) && (x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (!whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x + 1);y = (byte)(y - 2);
      if ((x >= 0) && (y >= 0) && (x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (!whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x - 2);y = (byte)(y - 1);
      if ((x >= 0) && (y >= 0) && (x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (!whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x - 1);y = (byte)(y - 2);
      if ((x >= 0) && (y >= 0) && (x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (!whitePiece) {
          moves[x][y] = 1;
        }
      }
    }
    else if (id == 0x265D) {
      byte x = (byte)(x + 1);byte y = (byte)(y + 1);
      while ((x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        } else {
          if (!whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
        x = (byte)(x + 1);
        y = (byte)(y + 1);
      }
      x = (byte)(x - 1);y = (byte)(y + 1);
      while ((x >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        } else {
          if (!whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
        x = (byte)(x - 1);
        y = (byte)(y + 1);
      }
      x = (byte)(x - 1);y = (byte)(y - 1);
      while ((x >= 0) && (y >= 0)) {
        if (id == ' ') {
          moves[x][y] = 1;
        } else {
          if (!whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
        x = (byte)(x - 1);
        y = (byte)(y - 1);
      }
      x = (byte)(x + 1);y = (byte)(y - 1);
      do {
        if (id == ' ') {
          moves[x][y] = 1;
        } else {
          if (!whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
        x = (byte)(x + 1);
        y = (byte)(y - 1);
        if (x >= 8) break; } while (y >= 0);










    }
    else if (id == 0x2657) {
      byte x = (byte)(x + 1);byte y = (byte)(y + 1);
      while ((x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        } else {
          if (whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
        x = (byte)(x + 1);
        y = (byte)(y + 1);
      }
      x = (byte)(x - 1);y = (byte)(y + 1);
      while ((x >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        } else {
          if (whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
        x = (byte)(x - 1);
        y = (byte)(y + 1);
      }
      x = (byte)(x - 1);y = (byte)(y - 1);
      while ((x >= 0) && (y >= 0)) {
        if (id == ' ') {
          moves[x][y] = 1;
        } else {
          if (whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
        x = (byte)(x - 1);
        y = (byte)(y - 1);
      }
      x = (byte)(x + 1);y = (byte)(y - 1);
      do {
        if (id == ' ') {
          moves[x][y] = 1;
        } else {
          if (whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
        x = (byte)(x + 1);
        y = (byte)(y - 1);
        if (x >= 8) break; } while (y >= 0);











    }
    else if (id == 0x265A) {
      byte x = (byte)(x - 1);byte y = (byte)(y - 1);
      if ((x >= 0) && (x < 8) && (y >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x - 1);y = (byte)y;
      if ((x >= 0) && (x < 8) && (y >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x + 1);y = (byte)y;
      if ((x >= 0) && (x < 8) && (y >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x + 1);y = (byte)(y + 1);
      if ((x >= 0) && (x < 8) && (y >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)x;y = (byte)y;
      if ((x >= 0) && (x < 8) && (y >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x + 1);y = (byte)(y - 1);
      if ((x >= 0) && (x < 8) && (y >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)x;y = (byte)(y + 1);
      if ((x >= 0) && (x < 8) && (y >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)x;y = (byte)(y - 1);
      if ((x >= 0) && (x < 8) && (y >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x - 1);y = (byte)(y + 1);
      if ((x >= 0) && (x < 8) && (y >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (whitePiece) {
          moves[x][y] = 1;
        }
        
      }
    }
    else if (id == 0x2654) {
      byte x = (byte)(x - 1);byte y = (byte)(y - 1);
      if ((x >= 0) && (x < 8) && (y >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (!whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x - 1);y = (byte)y;
      if ((x >= 0) && (x < 8) && (y >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (!whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x + 1);y = (byte)y;
      if ((x >= 0) && (x < 8) && (y >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (!whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x + 1);y = (byte)(y + 1);
      if ((x >= 0) && (x < 8) && (y >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (!whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)x;y = (byte)y;
      if ((x >= 0) && (x < 8) && (y >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (!whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x + 1);y = (byte)(y - 1);
      if ((x >= 0) && (x < 8) && (y >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (!whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)x;y = (byte)(y + 1);
      if ((x >= 0) && (x < 8) && (y >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (!whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)x;y = (byte)(y - 1);
      if ((x >= 0) && (x < 8) && (y >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (!whitePiece) {
          moves[x][y] = 1;
        }
      }
      
      x = (byte)(x - 1);y = (byte)(y + 1);
      if ((x >= 0) && (x < 8) && (y >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        }
        else if (!whitePiece) {
          moves[x][y] = 1;
        }
      }
    }
    else if (id == 0x265B) {
      for (byte x = (byte)(x + 1); x < 8; x = (byte)(x + 1)) {
        if (moves[x][y].id == ' ') {
          moves[x][y] = 1;
        } else {
          if (!moves[x][y].whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
      }
      for (byte x = (byte)(x - 1); x >= 0; x = (byte)(x - 1)) {
        if (moves[x][y].id == ' ') {
          moves[x][y] = 1;
        } else {
          if (!moves[x][y].whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
      }
      for (byte y = (byte)(y + 1); y < 8; y = (byte)(y + 1)) {
        if (moves[x][y].id == ' ') {
          moves[x][y] = 1;
        } else {
          if (!moves[x][y].whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
      }
      for (byte y = (byte)(y - 1); y >= 0; y = (byte)(y - 1)) {
        if (moves[x][y].id == ' ') {
          moves[x][y] = 1;
        } else {
          if (!moves[x][y].whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
      }
      
      byte x = (byte)(x + 1);byte y = (byte)(y + 1);
      while ((x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        } else {
          if (!whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
        x = (byte)(x + 1);
        y = (byte)(y + 1);
      }
      x = (byte)(x - 1);y = (byte)(y + 1);
      while ((x >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        } else {
          if (!whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
        x = (byte)(x - 1);
        y = (byte)(y + 1);
      }
      x = (byte)(x - 1);y = (byte)(y - 1);
      while ((x >= 0) && (y >= 0)) {
        if (id == ' ') {
          moves[x][y] = 1;
        } else {
          if (!whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
        x = (byte)(x - 1);
        y = (byte)(y - 1);
      }
      x = (byte)(x + 1);y = (byte)(y - 1);
      do {
        if (id == ' ') {
          moves[x][y] = 1;
        } else {
          if (!whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
        x = (byte)(x + 1);
        y = (byte)(y - 1);
        if (x >= 8) break; } while (y >= 0);










    }
    else if (id == 0x2655) {
      for (byte x = (byte)(x + 1); x < 8; x = (byte)(x + 1)) {
        if (moves[x][y].id == ' ') {
          moves[x][y] = 1;
        } else {
          if (moves[x][y].whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
      }
      for (byte x = (byte)(x - 1); x >= 0; x = (byte)(x - 1)) {
        if (moves[x][y].id == ' ') {
          moves[x][y] = 1;
        } else {
          if (moves[x][y].whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
      }
      for (byte y = (byte)(y + 1); y < 8; y = (byte)(y + 1)) {
        if (moves[x][y].id == ' ') {
          moves[x][y] = 1;
        } else {
          if (moves[x][y].whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
      }
      for (byte y = (byte)(y - 1); y >= 0; y = (byte)(y - 1)) {
        if (moves[x][y].id == ' ') {
          moves[x][y] = 1;
        } else {
          if (moves[x][y].whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
      }
      
      byte x = (byte)(x + 1);byte y = (byte)(y + 1);
      while ((x < 8) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        } else {
          if (whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
        x = (byte)(x + 1);
        y = (byte)(y + 1);
      }
      x = (byte)(x - 1);y = (byte)(y + 1);
      while ((x >= 0) && (y < 8)) {
        if (id == ' ') {
          moves[x][y] = 1;
        } else {
          if (whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
        x = (byte)(x - 1);
        y = (byte)(y + 1);
      }
      x = (byte)(x - 1);y = (byte)(y - 1);
      while ((x >= 0) && (y >= 0)) {
        if (id == ' ') {
          moves[x][y] = 1;
        } else {
          if (whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
        x = (byte)(x - 1);
        y = (byte)(y - 1);
      }
      x = (byte)(x + 1);y = (byte)(y - 1);
      while ((x < 8) && (y >= 0)) {
        if (id == ' ') {
          moves[x][y] = 1;
        } else {
          if (whitePiece) break;
          moves[x][y] = 1;
          
          break;
        }
        x = (byte)(x + 1);
        y = (byte)(y - 1);
      }
    }
    
    return moves;
  }
}
