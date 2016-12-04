import java.util.*;
public class generate{
	public static String[][] board = new String[9][5];
	public static String[][] boardnums = new String[9][5];
	public static int len;
	public static int leny;
	public static void main(String[] args){
		initgenerate();
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,3,3,4,4,5,5,6,6,8,8,9,9,10,10,11,11,12));
		ArrayList<Character> yields = new ArrayList<>(Arrays.asList('F','F','F','F','S','S','S','W','W','W','W','S','S','S','S','B','B','B'));
		int[] numvalues = new int[4];
		char[] yieldvalues = new char[4];
		refreshlen(nums);
		refreshleny(yields);
		
		for(int i = 0; i < 5; i++){
			if(i == 0){
				for(int j = 0; j < 3; j++){
					int which = (int)(Math.random() * len);
					numvalues[j] = nums.get(which);
					nums.remove(which);
					refreshlen(nums);
					int which2 = (int)(Math.random() * len);
					yieldvalues[j] = yields.get(which2);
					yields.remove(which2);
					refreshleny(yields);
				}
				boardnums[2][0] = Integer.toString(numvalues[0]);
				boardnums[4][0] = Integer.toString(numvalues[1]);
				boardnums[6][0] = Integer.toString(numvalues[2]);
				board[2][0] = Character.toString(yieldvalues[0]);
				board[4][0] = Character.toString(yieldvalues[1]);
				board[6][0] = Character.toString(yieldvalues[2]);
			}
			if(i == 1){
				for(int j = 0; j < 4; j++){
					int which = (int)(Math.random() * len);
					numvalues[j] = nums.get(which);
					nums.remove(which);
					refreshlen(nums);
					int which2 = (int)(Math.random() * len);
					yieldvalues[j] = yields.get(which2);
					yields.remove(which2);
					refreshleny(yields);
				}
				boardnums[1][1] = Integer.toString(numvalues[0]);
				boardnums[3][1] = Integer.toString(numvalues[1]);
				boardnums[5][1] = Integer.toString(numvalues[2]);
				boardnums[7][1] = Integer.toString(numvalues[3]);
				board[1][1] = Character.toString(yieldvalues[0]);
				board[3][1] = Character.toString(yieldvalues[1]);
				board[5][1] = Character.toString(yieldvalues[2]);
				board[7][1] = Character.toString(yieldvalues[3]);
			}
			if(i == 2){
				for(int j = 0; j < 4; j++){
					int which = (int)(Math.random() * len);
					numvalues[j] = nums.get(which);
					nums.remove(which);
					refreshlen(nums);
					int which2 = (int)(Math.random() * len);
					yieldvalues[j] = yields.get(which2);
					yields.remove(which2);
					refreshleny(yields);
				}
				boardnums[0][2] = Integer.toString(numvalues[0]);
				boardnums[2][2] = Integer.toString(numvalues[1]);
				boardnums[6][2] = Integer.toString(numvalues[2]);
				boardnums[8][2] = Integer.toString(numvalues[3]);
				board[0][2] = Character.toString(yieldvalues[0]);
				board[2][2] = Character.toString(yieldvalues[1]);
				board[6][2] = Character.toString(yieldvalues[2]);
				board[8][2] = Character.toString(yieldvalues[3]);
			}
			if(i == 3){
				for(int j = 0; j < 4; j++){
					int which = (int)(Math.random() * len);
					numvalues[j] = nums.get(which);
					nums.remove(which);
					refreshlen(nums);
					int which2 = (int)(Math.random() * len);
					yieldvalues[j] = yields.get(which2);
					yields.remove(which2);
					refreshleny(yields);
				}
				boardnums[1][3] = Integer.toString(numvalues[0]);
				boardnums[3][3] = Integer.toString(numvalues[1]);
				boardnums[5][3] = Integer.toString(numvalues[2]);
				boardnums[7][3] = Integer.toString(numvalues[3]);
				board[1][3] = Character.toString(yieldvalues[0]);
				board[3][3] = Character.toString(yieldvalues[1]);
				board[5][3] = Character.toString(yieldvalues[2]);
				board[7][3] = Character.toString(yieldvalues[3]);
			}
			if(i == 4){
				for(int j = 0; j < 3; j++){
					int which = (int)(Math.random() * len);
					numvalues[j] = nums.get(which);
					nums.remove(which);
					refreshlen(nums);
					int which2 = (int)(Math.random() * len);
					yieldvalues[j] = yields.get(which2);
					yields.remove(which2);
					refreshleny(yields);
				}
				boardnums[2][4] = Integer.toString(numvalues[0]);
				boardnums[4][4] = Integer.toString(numvalues[1]);
				boardnums[6][4] = Integer.toString(numvalues[2]);
				board[2][4] = Character.toString(yieldvalues[0]);
				board[4][4] = Character.toString(yieldvalues[1]);
				board[6][4] = Character.toString(yieldvalues[2]);
			}
		}
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 9; j++){
				if(boardnums[j][i] == null){
					boardnums[j][i] = "-";
				}
			}
		}
		printboard();
		System.out.println();
		printboardvals();
	}
	
	public static void refreshleny(ArrayList<Character> inp){
		leny = inp.size();
	}
	public static void refreshlen(ArrayList<Integer> inp){
		len = inp.size();
	}
	
	public static void printboard(){
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 9; j++){
				System.out.print(board[j][i] + " ");
			}
			System.out.println();
		}
	}
	
	public static void printboardvals(){
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 9; j++){
				System.out.print(boardnums[j][i] + " ");
			}
			System.out.println();
		}
	}
	
	public static void initgenerate(){
		board[0][0] = "-"; board[1][0] = "-"; board[2][0] = "N";
		board[3][0] = "-"; board[4][0] = "N"; board[5][0] = "-";
		board[6][0] = "N"; board[7][0] = "-"; board[8][0] = "-"; 

		board[0][1] = "-"; board[1][1] = "N"; board[2][1] = "-";
		board[3][1] = "N"; board[4][1] = "-"; board[5][1] = "N";
		board[6][1] = "-"; board[7][1] = "N"; board[8][1] = "-";

		board[0][2] = "N"; board[1][2] = "-"; board[2][2] = "N";
		board[3][2] = "-"; board[4][2] = "D"; board[5][2] = "-";
		board[6][2] = "N"; board[7][2] = "-"; board[8][2] = "N";

		board[0][3] = "-"; board[1][3] = "N"; board[2][3] = "-";
		board[3][3] = "N"; board[4][3] = "-"; board[5][3] = "N";
		board[6][3] = "-"; board[7][3] = "N"; board[8][3] = "-";

		board[0][4] = "-"; board[1][4] = "-"; board[2][4] = "N";
		board[3][4] = "-"; board[4][4] = "N"; board[5][4] = "-";
		board[6][4] = "N"; board[7][4] = "-"; board[8][4] = "-"; 
	}
}