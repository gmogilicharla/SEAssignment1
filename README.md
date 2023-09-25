# SEAssignment1

**Description:**
 * In this program, we wrote the piece of code to implement the Fermat's Last Theorem
 * Limitations:
 * 		k (upper limit) > = 10
 * 		n (power) > 2 and n < 3
 * 		10<=x<=k, 10<=y<=k  
   
 *1st step: Take user inputs for k and n
 *2nd step: compute the equation x^n + y^n
 *3rd step: take nth root of the result of above equation we will get z
 *4th step: take difference of x^n + y^n with z and z+1 ((x^n + y^n) - z), ((z+1) - (x^n + y^n)), smaller difference among these 2 will be called near miss
 *5th step: Finding the relative miss by applying a formula mentioned in Instructions
 *6th step: Compare the relative miss with smallest possible miss and here we will get Smallest possible miss.
 
 *We used long data type to fix the problem of overflowing of results.
