# ORG 2000H
	   LHLD 3000
	   MOV A,L
	   CMA
	   MOV L,A
	   MOV A,H
	   CMA
	   MOV A,H
	   SHLD 3002
	   INX H
	   SHLD 3004
	   HLT
# ORG 3000H
# DB 42,35
