package application;

public class HolidayBonus {

	static double[] calculateHolidayBonus(double[][] data, double high, double low, double other)
	{
		
		int largest = 0;
		for (int i = 0; i < data.length; i++)
		{
			if (data[i].length > largest)
				largest = data[i].length;
		}
		double[] arr = new double[data.length];
		
		
		for (int i = 0; i < arr.length; i++)
			arr[i] = other * data[i].length;
		
		
		double min, max;
		int index;
		for (int col = 0; col < largest; col++)
		{
			
			min = Double.MAX_VALUE;
			index = 0;
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
			// Replace default-set value with low value
			arr[index] += low - other;
			// FIND MAXIMUM IN COLUMN
			max = Double.MIN_VALUE;
			index = 0;

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
			// Replace default-set value with high value
			arr[index] += high - other;
		}
		return arr;
	}

	
	static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other)
	{
		double[] arr = calculateHolidayBonus(data,high,low,other);
		
		double total = 0;
		for (int i = 0; i < arr.length; i++)
		{
			total += arr[i];
		}
		
		return total;
	}
}