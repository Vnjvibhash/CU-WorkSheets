# ORG 1000H
	   LXI H,1000
	   MOV A,M
	   INX H
	   MOV B,M
	   MVI C,00
	   ADD B
	   JNC 000D
	   INR C

000D:	   INX H
	   MOV M,C
	   HLT
# ORG 1000H
# DB 11H, 20H
