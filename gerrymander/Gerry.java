#include<stdio.h>
#define R 0
#define B 1
int smallBoard[5][5] =
			{{B,B,R,R,R},
			 {R,B,B,R,B},
			 {B,R,R,R,R},
			 {R,R,B,B,R},
			 {R,R,R,R,B}};

int Colorado[10][14] =
			{{R,R,R,R,B,R,B,B,R,R,R,R,R,R},
			 {R,R,R,B,B,R,B,B,R,R,R,R,R,R},
			 {R,R,R,R,B,R,R,B,B,B,R,R,R,R},
			 {R,R,R,R,B,R,R,B,B,B,R,R,R,R},
			 {R,R,R,R,B,B,B,B,B,B,R,R,R,R},
			 {R,R,R,B,B,B,R,R,R,R,R,R,R,R},
			 {R,R,R,B,B,R,R,R,R,R,R,R,R,R},
			 {R,R,R,B,B,B,R,R,B,B,R,R,R,R},
			 {R,R,R,B,B,B,R,R,B,B,R,R,R,R},
			 {B,B,B,R,B,B,B,R,B,B,R,R,R,R},
			 {R,R,B,R,R,R,B,B,B,B,B,B,R,R},
			 {R,B,B,R,R,B,B,B,B,B,B,B,R,R}};


void solveSmall()
{
	int marked[5][5];
	int i, j;
	for(i = 0; i < 5; i++)
	{
		for(j = 0; j < 5; j++)
			marked[i][j] = 0;
	}

}

void solveBig()
{

}

main()
{
	solveSmall();
	solveBig();
}
