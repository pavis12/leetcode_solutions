class Solution {
    public void setZeroes(int[][] m) {
        int r = m.length;
        int c = m[0].length;
        int col = 0;

        // Step 1: Mark rows and columns that need to be zeroed
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (m[i][j] == 0) {
                    m[i][0] = 0;
                    if (j != 0) {
                        m[0][j] = 0;
                    } else {
                        col = 1;
                    }
                }
            }
        }

        // Step 2: Set matrix elements to zero based on markers, skipping first row and column initially
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (m[i][0] == 0 || m[0][j] == 0) {
                    m[i][j] = 0;
                }
            }
        }

        // Step 3: Set the first row to zero if needed
        if (m[0][0] == 0) {
            for (int j = 1; j < c; j++) {
                m[0][j] = 0;
            }
        }

        // Step 4: Set the first column to zero if col marker was set
        if (col == 1) {
            for (int i = 0; i < r; i++) {
                m[i][0] = 0;
            }
        }
    }
}
