package a7;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class MagicSquares {
	public static boolean testMagic(String fileName) throws IOException {
		FileReader text = new FileReader(fileName);
		BufferedReader row = new BufferedReader(text);

		int sum = 0, firstSum = -1, rowNum = 0;
		String line = row.readLine();
		String[] num = line.split("\t");
		int[][] square = new int[num.length][num.length];
		do {
			if (line.equals(""))
				continue;
			
			sum = 0;
			num = line.split("\t");
			int colNum = 0;
			
			for (String number : num) {
				sum += Integer.parseInt(number);
				square[rowNum][colNum] = Integer.parseInt(number);
				colNum += 1;
			}
			rowNum += 1;
			
			if (firstSum == -1) 
				firstSum = sum;
			else if (firstSum != sum) {
				row.close();
				return false;
			}
		} while ((line = row.readLine()) != null);
		
		int counter1 = 0, counter2 = square.length - 1, diagonalSum1 = 0, diagonalSum2 = 0;
		for (int i = 0; i < square.length; i++) {
			sum = 0;
			for (int j = 0; j < square.length; j++) {
				sum += square[j][i];
			}
			
			if (sum != firstSum) {
				row.close();
				return false;
			}
			
			diagonalSum1 += square[i][counter1];
			diagonalSum2 += square[i][counter2];
			counter1++;
			counter2--;		
		}
		
		if (diagonalSum1 != firstSum || diagonalSum2 != firstSum) {
			row.close();
			return false;
		}
		
		row.close();
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		String[] fileList = {"Luna.txt", "Mercury.txt"};
		for (String file: fileList) {
			System.out.println(file + " is a magic square? " + testMagic(file));
		}	
	}
}
