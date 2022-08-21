# ORG 2000H
//Loading value in accumulator from location 3000H
	   LDA 3000
//Moving the value to register C
	   MOV C,A
//Loading the value in Register B from location 3001H
	   LDA 3001
	   MOV B,A
//Swapping the contents of register B and C
	   MOV D,B
	   MOV B,C
	   MOV C,D
	   LDA 3002
//Store the value in register C after swapping at 3002H
	   MOV A,C
	   STA 3002
	   HLT
# ORG 3000H
# DB 42, 34
