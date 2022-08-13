/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sparse_matrix;

/**
 *
 * @author duyta
 */
public class IntSparseMatrix extends SparseMatrix<Integer> {

    public IntSparseMatrix(int r, int c) {
        super(r, c);
    }

    //Add two matrices, return the result matrix
    public IntSparseMatrix add(IntSparseMatrix m) {
        if (this.maxRow != maxRow || this.maxCol != m.maxCol) {
            return null;
        }
        IntSparseMatrix result = new IntSparseMatrix(this.maxRow, this.maxCol);
        int i, j;
        for (i = 0; i < this.maxRow; i++) {
            for (j = 0; j < this.maxCol; j++) {
                Integer obj1 = this.get(i, j);
                Integer obj2 = m.get(i, j);
                int data1 = obj1 != null ? obj1.intValue() : 0;
                int data2 = obj2 != null ? obj2.intValue() : 0;
                int data3 = data1 + data2;
                if (data3 != 0) {
                    result.add(i, j, data3);
                }
            }
        }
        return result;
    }

    //Multiply two matrices, return the reulst matrix
    public IntSparseMatrix multiply(IntSparseMatrix m) {
        if (this.maxCol != m.maxRow) {
            return null;
        }
        IntSparseMatrix result = new IntSparseMatrix(this.maxCol, m.maxCol);
        int i, j, k;
        // C[j,k] = 0 + A[i,0]* B[0,k] + A[i,l]* B[l,k] + ... + A[i,n]* B[n,k]
        for (i = 0; i < result.maxRow; i++) {
            for (k = 0; k < result.maxCol; k++) {
                int sum = 0;
                for (j = 0; j < m.maxRow; j++) {
                    Integer obj1 = this.get(i, j);
                    Integer obj2 = m.get(j, k);
                    int data1 = obj1 != null ? obj1.intValue() : 0;
                    int data2 = obj2 != null ? obj2.intValue() : 0;
                    sum += data1 * data2;
                    if (sum != 0) {
                        result.add(i, k, sum);
                    }
                }

            }
        }
        return result;
    }
}
