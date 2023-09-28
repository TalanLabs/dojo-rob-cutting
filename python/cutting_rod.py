from typing import List


# Function to find the best way to cut a rod of length `n`
# where the rod of length `i` has a cost `price[i-1]`
def rod_cut(price: List[int], n: int) -> int:

    if n == 0:
        return 0
    max_value = 0

    # one by one, partition the given rod of length `n` into two parts of length
    # (1, n-1), (2, n-2), (3, n-3), … ,(n-1, 1), (n, 0) and take maximum
    for i in range(1, n + 1):
        # rod of length `i` has a cost `price[i-1]`
        cost = price[i - 1] + rod_cut(price, n - i)
        if cost > max_value:
            max_value = cost
    return max_value


# Function to find the best way to cut a rod of length `n`
# where the rod of length `i` has a cost `price[i-1]`
def rod_cut2(price: List[int], n: int) -> int:
    # `table[i]` stores the maximum profit achieved from a rod of length `i`
    table = [0] * (n + 1)

    # consider a rod of length `i`
    for i in range(1, n + 1):
        # divide the rod of length `i` into two rods of length `j`
        # and `i-j` each and take maximum
        for j in range(1, i + 1):
            table[i] = max(table[i], price[j - 1] + table[i - j])

    # `table[n]` stores the maximum profit achieved from a rod of length `n`
    return table[n]
