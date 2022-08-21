# ORG 7000H
	   LHLD 7601	// Get 1st no. in HL pair from memory 7601 H
	   XCHG	// Exchange cont. of DE HL
	   LHLD 7603	// Get 2st no. in HL pair from location 7603 H
	   MVI C,00	// Clear reg. C.
	   DAD D	// Get HL+DE & store result in HL
	   JNC DOWN	// If no carry move to loop/if carry then move to next step.
	   INR C	// Increment reg.C
	   MOV A,C	// Move carry from reg. C to reg. A
	   STA 7502	// Store carry at 7502 H

DOWN:	   SHLD 7500	// Store result in 7500 H.
	   RST 1	// Terminate
// Store input at the address
// Get two 16 bit no. in successive location
# ORG 7601H
# DB 13,31,12,10
