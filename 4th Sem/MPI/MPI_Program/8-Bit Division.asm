# ORG 0900H
	   LDA 1000
	   MOV B,A
	   LDA 1001
	   MVI C,00

LOOP:	   INR C
	   SUB B
	   JNC LOOP
	   STA 1002
	   HLT
# ORG 1000
# DB 03H, 0FH