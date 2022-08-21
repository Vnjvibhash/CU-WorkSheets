# ORG 0900H                      // assign the origin of the program
	   LDA 1000  // load data from address 1000 to Accumulator
	   MOV B,A     //move data from Accumulator to Register B
	   LDA 1001   // load data from address 1001 to Accumulator
	   ANA B          //perform and Operation between A and B and store it into A
	   STA 1002   //Store Results from accumulator to address 1002
	   HLT              //End the Process of execution
# ORG 1000                          // assign the origin of the program
# DB D7H,F0H                       // assign the data using which we want to perform the Operation


//OR


# ORG 0900H                            //assign the origin
	   LXI H, 1000   //load the data to memory from address 1000
	   MOV A,M       //move the data from memory to accumulator
	   ANI F0H         //perform AND operation of F0H and Accumulator then store in accumulator
	   STA 1002       // store the Accumulator value to the 1002 address
	   HLT                   // End the Process of execution or terminate the program
# ORG 1000                             //assign the origin of program
# DB D7H                                 //assign the data to the database
