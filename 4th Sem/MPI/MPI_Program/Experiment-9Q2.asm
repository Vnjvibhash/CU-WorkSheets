# ORG 0900H
	   LXI H,1000
	   MOV A,M
	   INX H
	   MOV B,M
	   CMP B
	   JNC LABEL
	   MOV A,B

LABEL:	   STA 1002
	   HLT
# ORG 1000
# DB FAH,5FH