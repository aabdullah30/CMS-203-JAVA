package application;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilitySTUDENT_Test {

	private double[][] dataSetSTUDENT = null;
	
	private File inputFile,outputFile;

	@Before
	public void setUp() throws Exception {
		outputFile = new File("TestIn.txt");
		inputFile = new File("TestOut.txt");
		dataSetSTUDENT = TwoDimRaggedArrayUtility.readFile(inputFile);
	}

	@After
	public void tearDown() throws Exception {
		dataSetSTUDENT = null;
		inputFile = outputFile = null;
	}

	/**
	 * Student Test getTotal method
	 * Return the total of all the elements in the two dimensional array
	 */
	@Test
	public void testGetTotal() {
		assertEquals(TwoDimRaggedArrayUtility.getTotal(dataSetSTUDENT), -3.3, 0.1);
	}

	/**
	 * Student Test getAverage method
	 * Return the average of all the elements in the two dimensional array
	 */
	@Test
	public void testGetAverage() {
		assertEquals(TwoDimRaggedArrayUtility.getAverage(dataSetSTUDENT), -0.3, 0.1);
	}

	/**
	 * Student Test getRowTotal method
	 * Return the total of all the elements of the row.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		assertEquals(TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 2), -5.2, 0.1);
	}


	/**
	 * Student Test getColumnTotal method
	 * Return the total of all the elements in the column. If a row in the two dimensional array
	 * doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * Column 0 refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotal() {
		assertEquals(TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 1), 2.7, 0.1);
	}


	@Test
	public void testGetHighestInArray() {
		assertEquals(TwoDimRaggedArrayUtility.getHighestInArray(dataSetSTUDENT), 8.2, 0.1);
	}
	
	
	@Test
	public void testWriteToFile() {
		double[][] array=null;
		TwoDimRaggedArrayUtility.writeToFile(dataSetSTUDENT, outputFile);
	}

}
