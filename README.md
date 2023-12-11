# Time_Complexity
Design and analysis of Algorithm_FIBONNACI and Matrix

#The Time complexity of the Fibonacci series
The Time complexity of the Fibonacci series is O(2n)
Since T(n-2) ≤ T(n-1) will always hold, our solution O(2n) is an upper bound for the time complexity of F(n)

# The time complexity of Matrix addition
By that definition, matrix addition is an O(N^2) since you must visit each of the NxN elements exactly once. 
By that same definition, matrix multiplication (using square NxN matrices) is O(N^3) because you need to visit N elements in each of the source matrices to compute each of the NxN elements in the product matrix.

# Time complexity of Matrix Multiplication
The "naive" matrix multiplication for A×B involves multiplying and adding N terms for each of MP entries in AB. So the complexity is O(NMP). And then multiplying this M×P matrix by C requires multiplying
and adding P terms for each of MN entries. So the total complexity is O(M2N2P2).
