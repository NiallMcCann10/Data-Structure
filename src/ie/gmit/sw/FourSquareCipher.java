package ie.gmit.sw;

public class FourSquareCipher {
	char[][] matrix1 = {
			{'A', 'B', 'C', 'D', 'E'},
			{'F', 'G', 'H', 'I', 'K'},
			{'L', 'M', 'N', 'O', 'P'},
			{'Q', 'R', 'S', 'T', 'U'},
			{'V', 'W', 'X', 'Y', 'Z'},
		};
	
	char[][] matrix2 = {
			{'Z', 'G', 'P', 'T', 'F'},
			{'O', 'I', 'H', 'M', 'U'},
			{'W', 'D', 'R', 'C', 'N'},
			{'Y', 'K', 'E', 'Q', 'A'},
			{'X', 'V', 'S', 'B', 'L'},
		};
	
	char[][] matrix3 = {
			{'M', 'F', 'N', 'B', 'D'},
			{'C', 'R', 'H', 'S', 'A'},
			{'X', 'Y', 'O', 'G', 'V'},
			{'I', 'T', 'U', 'E', 'W'},
			{'L', 'Q', 'Z', 'K', 'P'},
		};
	
	//0(1)
	public String encrypt(char s, char t)
	{
		int i;
		int j;
		int cryptedRow = 0, cryptedRow2 = 0;
		int cryptedCol = 0, cryptedCol2 = 0;
		String encryption;
		
		for(i = 0; i < 5; i++)
		{
			for(j = 0; j < 5; j++)
			{
				if(matrix1[i][j] == s)
				{
					cryptedRow = i;
					cryptedCol2 = j;
					
					
				}
					
			}
		}
		for(i = 0; i < 5; i++)
		{
			for(j = 0; j < 5; j++)
			{
				if(matrix1[i][j] == t)
				{
					cryptedRow2 = i;
					cryptedCol = j;
					
					
				}
					
			}
		}
		encryption = matrix2[cryptedRow][cryptedCol] + "" + matrix3[cryptedRow2][cryptedCol2];
		System.out.print(encryption);
		
		return encryption;
		
	}
	//0(1)
	public String decrypt(char s, char t)
	{
		int i;
		int j;
		int decryptedRow = 0, decryptedRow2 = 0;
		int decryptedCol = 0, decryptedCol2 = 0;
		String decryption;
		
		for(i = 0; i < 5; i++)
		{
			for(j = 0; j < 5; j++)
			{
				if(matrix2[i][j] == s)
				{
					decryptedRow = i;
					decryptedCol2 = j;
					
					
				}
					
			}
		}
		for(i = 0; i < 5; i++)
		{
			for(j = 0; j < 5; j++)
			{
				if(matrix3[i][j] == t)
				{
					decryptedRow2 = i;
					decryptedCol = j;
					
					
				}
					
			}
		}
		decryption = matrix2[decryptedRow][decryptedCol] + "" + matrix3[decryptedRow2][decryptedCol2];
		System.out.print(decryption);
		
		return decryption;
	}

}
