# ORG 2000H
	   LXI H,3000
	   MOV A,M
	   INX H
	   MOV B,M
	   SBB B
	   INX H
	   MOV M,A
	   HLT
# ORG 3000H
# DB 42, 34
