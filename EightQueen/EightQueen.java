package task2;

public class EightQueen {
	// 0,0
	//    7,7
	private int[] coordinate = new int[8];
	
	public boolean path(int row)
	{
		if (row == 8)
			return true;

		int x;
		boolean pos=false;
		
		for(x=0;x < 8 && !pos; x++)
		{
			boolean possible = true;
			for(int i=1;i<=row;i++) // check rows
			{
				if(coordinate[row-i] == x // vertical
				|| coordinate[row-i] == x-i // left diagonal
				|| coordinate[row-i] == x+i) // right diagonal
				{
					possible = false;
					break;
				}
				
			}
			if(possible)
			{			
				coordinate[row]=x;
				pos = path(row + 1);
				if (!pos)
					coordinate[row] = -1;
			}
		}
		
		
		return pos;
	}
	
	public void display()
	{
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
				System.out.print(coordinate[i] == j ? "б┌" : "бр");
			System.out.println();
		}
	}
}

