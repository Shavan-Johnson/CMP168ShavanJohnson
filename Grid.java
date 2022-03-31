//https://youtu.be/Q9uNI5JP8bM This is the code demonstration.
//https://youtu.be/1dD2R4xhomY This is the game demonstration.
//For some reason OBS couldn't capture the game window and the recording off my phone wouldn't properly upload so I had to split the videos up.
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Grid //extends JFrame 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean win = false;
	private JButton[][] playerGrid;
	private static int tiles = 0;
	
	private boolean[][] bombGrid;
	private int[][] countGrid;
	private int numRows;
	private int numColumns;
	private int numBombs;
	
//	public static void main(String[]args) {
//		Grid test = new Grid();
//		Grid x = new Grid(6, 6);
//		Grid f = new Grid(10, 10, 1); 
//		f.showGrid();
//	}
	public Grid() {
		numRows = 10;
		numColumns = 10;
		numBombs = 25;
		bombGrid = new boolean[numRows][numColumns];
		countGrid = new int[numRows][numColumns];
		createBombGrid();
		createCountGrid();
	}
	public Grid(int rows, int columns) {
		this.numRows = rows;
		this.numColumns = columns;
		numBombs = 25;
		bombGrid = new boolean[numRows][numColumns];
		countGrid = new int[numRows][numColumns];
		createBombGrid();
		createCountGrid();
	}
	public Grid(int rows, int columns, int numBombs) {
		this.numRows = rows;
		this.numColumns = columns;
		this.numBombs = numBombs;
		bombGrid = new boolean[numRows][numColumns];
		countGrid = new int[numRows][numColumns];
		createBombGrid();
		createCountGrid();
	}
	public int getNumRows() {
		return numRows;
	}
	public int getNumColumns() {
		return numColumns;
	}
	public int getNumBombs() {
		return numBombs;
	}
	public boolean[][] getBombGrid() {
		int i;
		boolean[][] copy = new boolean[bombGrid.length][];
		for(i = 0; i < bombGrid.length; i ++) {
			copy[i] = new boolean[bombGrid[i].length];
			for(int j = 0; j < bombGrid[i].length; j ++) {
				copy[i][j] = bombGrid[i][j];
			}
		}
		return copy;
	}
	public int[][] getCountGrid() {
		int i;
		int[][] copy = new int[countGrid.length][];
		for(i = 0; i < countGrid.length; i ++) {
			copy[i] = new int[countGrid[i].length];
			for(int j = 0; j < countGrid[i].length; j ++) {
				copy[i][j] = countGrid[i][j];
			}
		}
		return copy;
	}
	public boolean isBombAtLocation(int row, int column) {
		if(bombGrid[row][column] == true) {
			return true;
		}
		else {
			return false;
		}
	}
	public int getCountAtLocation(int row, int column) {
		int count = 0;
		if((column >= 1 && column < numColumns - 1) && (row >= 1 && row < numRows - 1)) {
			for (int i = row - 1; i <= row + 1; i++) {
				for (int j = column - 1; j <= column + 1; j++) {
					if (isBombAtLocation(i, j) == true) {
						count++;
					}
				}
			}
		} else if (column < numColumns - 1 && column >= 1 && row == numRows - 1) {
			for (int i = row - 1; i <= row; i++) {
				for (int j = column - 1; j <= column + 1; j++) {
					if (isBombAtLocation(i, j) == true) {
						count++;
					}
				}
			}
		} else if (column < numColumns - 1 && column >= 1 && row == 0) {
			for (int i = row; i <= row + 1; i++) {
				for (int j = column - 1; j <= column + 1; j++) {
					if (isBombAtLocation(i, j) == true) {
						count++;
					}
				}
			}
		} else if (column == 0 && row > 0 && row < numRows - 1) {
			for (int i = row - 1; i <= row + 1; i++) {
				for (int j = column; j <= column + 1; j++) {
					if (isBombAtLocation(i, j) == true) {
						count++;
					}
				}
			}
		} else if (column == numColumns - 1 && row > 0 && row < numRows - 1) {
			for (int i = row - 1; i <= row + 1; i++) {
				for (int j = column - 1; j <= column; j++) {
					if (isBombAtLocation(i, j) == true) {
						count++;
					}
				}
			}
		} else if (column == numColumns - 1 && row == 0) {
			for (int i = row; i <= row + 1; i++) {
				for (int j = column - 1; j <= column; j++) {
					if (isBombAtLocation(i, j) == true) {
						count++;
					}
				}
			}
		} else if (column == 0 && row == 0) {
			for (int i = row; i <= row + 1; i++) {
				for (int j = column; j <= column + 1; j++) {
					if (isBombAtLocation(i, j) == true) {
						count++;
					}
				}
			}
		} else if (column == 0 && row == numRows - 1) {
			for (int i = row - 1; i <= row; i++) {
				for (int j = column; j <= column + 1; j++) {
					if (isBombAtLocation(i, j) == true) {
						count++;
					}
				}
			}
		} else if (column == numColumns - 1 && row == numRows - 1) {
			for (int i = row - 1; i <= row; i++) {
				for (int j = column - 1; j <= column; j++) {
					if (isBombAtLocation(i, j) == true) {
						count++;
					}
				}
			}

		}
		return count;
	}
    private void createBombGrid() {
    	for(int i = 0; i < numRows; i ++) {
    		for(int j = 0; j < numColumns; j ++) {
    			bombGrid[i][j] = false;
    		}
    	}
    	for(int i = 0; i < numBombs; i ++) {
    		Random rand = new Random();
    		int r = rand.nextInt(numRows);
    		int c = rand.nextInt(numColumns);
    		
    		while(bombGrid[r][c] == true) {
    		    r = rand.nextInt(numRows);
    		    c = rand.nextInt(numColumns);
    		}
    		bombGrid[r][c] = true;  
    		}
    }
    private void createCountGrid() {
    	for(int i = 0; i < numRows; i ++) {
    		for(int j = 0; j < numColumns; j ++) {
    			countGrid[i][j] = getCountAtLocation(i, j);
    		}
    	}
    }
//    public void showGrid() {
//    	playerGrid = new JButton[numRows][numColumns];
//    	
//    	this.setSize(500, 500);
//    	this.setTitle("Minesweeper");
//    	this.setResizable(true);
//    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    	this.setLocationRelativeTo(null);
//    	JPanel mainPanel = new JPanel();
//    	mainPanel.setLayout(new GridLayout(numRows, numColumns, 2, 2));
//    	
//    	for(int i = 0; i < numRows; i ++) {
//    		for(int j = 0; j < numColumns; j ++) {
//    			playerGrid[i][j] = new JButton();
//    			mainPanel.add(playerGrid[i][j]);
//    		}
//    	}
//    	
//    	for(int i = 0; i < numRows; i ++) {
//    		for(int j = 0; j < numColumns; j ++) {
//    			if(isBombAtLocation(i, j) == true) {
//    				bombEvent b = new bombEvent();
//    				playerGrid[i][j].addActionListener(b);
//    			}
////    			else if(isBombAtLocation(i, j) == false && getCountAtLocation(i, j) == 0) {
////    				zeroEvent z = new zeroEvent();
////    	            playerGrid[i][j].addActionListener(z);
////    			}
//    			else if(isBombAtLocation(i, j) == false) { // && getCountAtLocation(i, j) > 0) { 
//    				safeEvent s = new safeEvent();
//    				playerGrid[i][j].addActionListener(s);
//    			}
//    		}
//    	}
//    	this.add(mainPanel);
//    	this.setVisible(true);
//    }
//   public class safeEvent implements ActionListener {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			String s = "";
//			JButton source = (JButton) e.getSource();
//			for(int i = 0; i < numRows; i++) {
//				for(int j = 0; j < numColumns; j++) {
//					if(playerGrid[i][j] == source) {
//						s = Integer.toString(getCountAtLocation(i, j));
//					}
//				}
//			}
//			source.setText(s);
//			tiles++;
//			checkIfWon();
//		}
//    }
//    public class bombEvent implements ActionListener {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			win = false;
//			endGame();
//		}
//    }
//    
//    public class zeroEvent implements ActionListener {
//    	@Override
//    	public void actionPerformed(ActionEvent e) {
//    		int j = 0;
//			for(int i = 0; i < j + 2; i++) {
//				for(j = 0; j < i + 2; j++) {
//					if(isBombAtLocation(i, j) == true) {
//						return;
//					}
//					else {
//						String v = Integer.toString(getCountAtLocation(i, j));
//	    				playerGrid[i][j].setBackground(Color.white);
//	    				playerGrid[i][j].setText(v);
//	    				playerGrid[i][j].setForeground(Color.BLUE);
//	    				tiles++;
//					}
//				}
//			}
//			checkIfWon();
//    	}
//    }
//    public void checkIfWon()  {
//    	if((numRows * numColumns) - tiles == numBombs) {
//    		win = true;
//    		endGame();
//    	}
//    }
//    public void endGame() {
//    	for(int i = 0; i < numRows; i ++) {
//    		for(int j = 0; j < numColumns; j ++) {
//    			if(isBombAtLocation(i, j) == true) {
//    				playerGrid[i][j].setText("B");
//    				playerGrid[i][j].setBackground(Color.black);
//    				playerGrid[i][j].setForeground(Color.RED);
//    			}
//    			else {
//    				String v = Integer.toString(getCountAtLocation(i, j));
//    				playerGrid[i][j].setBackground(Color.white);
//    				playerGrid[i][j].setText(v);
//    				playerGrid[i][j].setForeground(Color.BLUE);
//    			}
//    		}
//    	}
//    	if(win == true) {
//    		JOptionPane.showMessageDialog(null, "You win!");
//    	}
//    	else {
//    		JOptionPane.showMessageDialog(null, "You lose!");
//    	}
//    	int option = JOptionPane.showConfirmDialog(null, "Do you want to go again?", "Game Over", JOptionPane.YES_NO_OPTION);
//    	if(option == JOptionPane.NO_OPTION) {
//    		this.dispose();
//    	}
//    	else if (option == JOptionPane.YES_OPTION) {
//    		this.dispose();
//    		restartGame();
//    	}
//    }
//    public void restartGame() {
//		Grid newGrid = new Grid();
//		newGrid.showGrid();
//	}
}