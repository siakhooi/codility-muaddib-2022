
def solution(A):
    M = max(A) + 30
    dp = [0] * (M+1)
    day = [0] * M
    for a in A:
      day[a] = 1

    for i in range(M-1, -1, -1):
        if not day[i]:
            dp[i] = dp[i+1]
        else:
            dp[i]= min(2 + dp[i+1],
                       7 + dp[i+7], 
                       25 + dp[i+30])
    return dp[1]

print(solution([1, 2, 4, 5, 7, 29, 30]))
assert (11==solution([1, 2, 4, 5, 7, 29, 30]))