package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	/**
	 * @author Donovan deVise
	 * @param data
	 * @return
	 */
	static double getAverage(double[][] data)
	{
		// Setup Vars
		double total = 0;
		int count = 0;
		// Add each element to total and increment count each time
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				total += data[i][j];
				count++;
			}
		}
		// Return average
		return total/count;
	}
	/**
	 * @author Donovan deVise
	 * @param data
	 * @param col
	 * @return
	 */
	static double getColumnTotal(double[][] data, int col)
	{
		// Setup Vars
		double total = 0;
		// Add each element to total
		for (int i = 0; i < data.length; i++)
		{
			if (col < data[i].length)
			{
				total += data[i][col];
			}
		}
		// Return total
		return total;
	}
	/**
	 * @author Donovan deVise
	 * @param data
	 * @return
	 */
	static double getHighestInArray(double[][] data)
	{
		// Setup Vars
		double max = data[0][0];
		// Check each element for being bigger than max, set max to value if so
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				if (data[i][j] > max)
					max = data[i][j];
			}
		}
		// Return max
		return max;
	}
	/**
	 * @author Donovan deVise
	 * @param data
	 * @param col
	 * @return
	 */
	static double getHighestInColumn(double[][] data, int col)
	{
		// Setup Vars
		double max = data[0][col];
		// Check each element for being bigger than max, set max to value if so
		for (int i = 0; i < data.length; i++)
		{
			if (col < data[i].length)
			{
				if (data[i][col] > max)
					max = data[i][col];
			}
		}
		// Return max
		return max;
	}
	/**
	 * @author Donovan deVise
	 * @param data
	 * @param col
	 * @return
	 */
	static int getHighestInColumnIndex(double[][] data, int col)
	{
		// Setup Vars
		double max = data[0][col];
		int index = 0;
		// Check each element for being bigger than max, set max to value if so and set index
		for (int i = 0; i < data.length; i++)
		{
			if (col < data[i].length)
			{
				if (data[i][col] > max)
				{
					max = data[i][col];
					index = i;
				}
			}
		}
		// Return max
		return index;
	}
	/**
	 * @author Donovan deVise
	 * @param data
	 * @param row
	 * @return
	 */
	static double getHighestInRow(double[][] data, int row)
	{
		// Setup Vars
		double max = data[row][0];
		// Check each element for being bigger than max, set max to value if so
		for (int i = 0; i < data[row].length; i++)
		{
			if (data[row][i] > max)
				max = data[row][i];
		}
		// Return max
		return max;
	}
	/**
	 * @author Donovan deVise
	 * @param data
	 * @param row
	 * @return
	 */
	static double getHighestInRowIndex(double[][] data, int row)
	{
		// Setup Vars
		double max = data[row][0];
		int index = 0;
		// Check each element for being bigger than max, set max to value if so
		for (int i = 0; i < data[row].length; i++)
		{
			if (data[row][i] > max)
			{
				max = data[row][i];
				index = i;
			}
		}
		// Return max
		return index;
	}
	/**
	 * @author Donovan deVise
	 * @param data
	 * @return
	 */
	static double getLowestInArray(double[][] data)
	{
		// Setup Vars
		double min = data[0][0];
		// Check each element for being smaller than max, set max to value if so
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				if (data[i][j] < min)
					min = data[i][j];
			}
		}
		// Return min
		return min;
	}
	/**
	 * @author Donovan deVise
	 * @param data
	 * @param col
	 * @return
	 */
	static double getLowestInColumn(double[][] data, int col)
	{
		// Setup Vars
		double min = data[0][col];
		// Check each element for being smaller than max, set max to value if so
		for (int i = 0; i < data.length; i++)
		{
			if (col < data[i].length)
			{
				if (data[i][col] < min)
					min = data[i][col];
			}
		}
		// Return min
		return min;
	}
	/**
	 * @author Donovan deVise
	 * @param data
	 * @param col
	 * @return
	 */
	static int getLowestInColumnIndex(double[][] data, int col)
	{
		// Setup Vars
		double min = data[0][col];
		int index = 0;
		// Check each element for being smaller than max, set max to value if so and set index
		for (int i = 0; i < data.length; i++)
		{
			if (col < data[i].length)
			{
				if (data[i][col] < min)
				{
					min = data[i][col];
					index = i;
				}
			}
		}
		// Return min index
		return index;
	}
	/**
	 * @author Donovan deVise
	 * @param data
	 * @param row
	 * @return
	 */
	static double getLowestInRow(double[][] data, int row)
	{
		// Setup Vars
		double min = data[row][0];
		// Check each element for being smaller than max, set max to value if so
		for (int i = 0; i < data[row].length; i++)
		{
			if (data[row][i] < min)
				min = data[row][i];
		}
		// Return min
		return min;
	}
	/**
	 * @author Donovan deVise
	 * @param data
	 * @param row
	 * @return
	 */
	static double getLowestInRowIndex(double[][] data, int row)
	{
		// Setup Vars
		double min = data[row][0];
		int index = 0;
		// Check each element for being smaller than max, set max to value if so
		for (int i = 0; i < data[row].length; i++)
		{
			if (data[row][i] < min)
			{
				min = data[row][i];
				index = i;
			}
		}
		// Return min index
		return index;
	}
	/**
	 * @author Donovan deVise
	 * @param data
	 * @param row
	 * @return
	 */
	static double getRowTotal(double[][] data, int row)
	{
		// Setup Vars
		double total = 0;
		// Add each element in the column to total
		for (int i = 0; i < data[row].length; i++)
			total += data[row][i];
		// Return total
		return total;
	}
	/**
	 * @author Donovan deVise
	 * @param data
	 * @return
	 */
	static double getTotal(double[][] data)
	{
		// Setup Vars
		double total = 0;
		// Add each element in the column to total
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
				total += data[i][j];
		}
		// Return total
		return total;
	}
	/**
	 * @author Donovan deVise
	 * @param file
	 * @return
	 * @throws FileNotFoundException
	 */
	public static double[][] readFile(File file) throws FileNotFoundException
	{
		// Setup Vars
		String[][] temp = null;
		double[][] array = null;
		Scanner inFile = new Scanner(file);
		Scanner line;
		int row, col;
		
		// Check if file has text first
		if(inFile.hasNextLine()){
			// Create temporary array, set each value to null
			temp = new String[10][10];
			for(row=0; row < 10; row++)
				for(col=0; col < 10; col++)
					temp[row][col] = null;
			
			row = 0;
			while(inFile.hasNextLine()){
				line = new Scanner(inFile.nextLine());
				col = 0;
				while(line.hasNextDouble())
				{
					temp[row][col++] = Double.toString(line.nextDouble());
				}
				row++;
				line.close();
			}
			inFile.close();
			// Get Row Count
			row=0;
			while(temp[row][0] != null) 
				row++;
			// Create new array
			array = new double[row][];
			for(row=0; row<array.length; row++){
				col=0;
				while(temp[row][col] != null) 
					col++;
				array[row] = new double[col];
				for(int i = 0; i < array[row].length; i++)
					array[row][i] = Double.parseDouble(temp[row][i]);
			}
		}
		// Close scanner and return new array
		inFile.close();
		return array;
	}
	/**
	 * @author Donovan deVise
	 * @param data
	 * @param outputFile
	 */
	static void writeToFile(double[][] data, File outputFile)
	{
		try {
			FileWriter fWriter = new FileWriter(outputFile);
			String text = "";
			for (int i = 0; i < data.length; i++)
			{
				for (int j = 0; j < data[i].length; j++)
				{
					text += data[i][j] + " ";
				}
				text += '\n';
			}
			fWriter.write(text);
			fWriter.close();
		}catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}