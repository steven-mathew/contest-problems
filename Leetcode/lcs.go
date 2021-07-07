func Max(x int, y int) int {
	if x > y {
		return x
	}
	return y
}

func longestCommonSubsequence(a string, b string) int {
	dp := make([][]int, len(b)+1)

	for i := range dp {
		dp[i] = make([]int, len(a)+1)
	}

	for i := 0; i <= len(b); i++ {
		for j := 0; j <= len(b); j++ {
			if i == 0 || j == 0 {
				dp[i][j] = 0
			} else if b[i-1] == a[j-1] {
				dp[i][j] = dp[i-1][j-1] + 1
			} else {
				dp[i][j] = Max(dp[i-1][j], dp[i][j-1])
			}
		}
	}
}
