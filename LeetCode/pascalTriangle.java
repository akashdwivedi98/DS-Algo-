class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();   //List of list which will be resultant
		List<Integer> row, prev = null;  //List of row which will define our current row and list for previous row
		for (int i = 0; i < numRows; ++i) {
			row = new ArrayList<Integer>();  //empty array list, visiting new row
			for (int j = 0; j <= i; ++j)  //no of columns=no of rows
				if (j == 0 || j == i)  //first or last column both will have 1
					row.add(1); //adding 1 to the row
				else
					row.add(prev.get(j - 1) + prev.get(j)); //prev rows adding to form current row
			prev = row;  //initial this row to be previous
			res.add(row);  //adding current row to resultant
		}
		return res;
    }
}