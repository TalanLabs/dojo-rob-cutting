/*eslint-disable no-unused-vars*/

/*
Function to find the best way to cut a rod of length `n`
  where the rod of length `i` has a cost `price[i-1]`
*/
const cutting = (prices, n) => {
  if (n === 0) {
    return 0
  } 

  let maxValue = 0 
  
  for (let i = 0; i < n; i++) {
    
    let cost = prices[i] + cutting(prices, n - (i + 1))
    if (cost > maxValue) {
      maxValue = cost
    }
  }
  return maxValue
}
/* 
 * Function to find the best way to cut a rod of length `n`
 * where the rod of length `i` has a cost `price[i-1]`
 */

const cutting2 = (prices, n) => {

    // `table[i]` stores the maximum profit achieved from a rod of length `i`
    const table = new Array(n + 1).fill(0)
    for (let i = 1; i <  n +1 ; i++) {
      // divide the rod of length `i` into two rods of length `j`
      // and `i-j` each and take maximum
      for (let j = 1; j < i + 1; j++) {
        table[i] = Math.max(table[i], prices[j - 1] + table[i - j])
      }
    }
    return table[n]
}

module.exports = { cutting, cutting2 } 
