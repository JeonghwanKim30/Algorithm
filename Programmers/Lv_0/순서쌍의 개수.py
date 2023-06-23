def solution(n):
    answer = 0
    for i in range(n+1):
        if(i==0):
            continue
        if(n//i == n/i):
            answer += 1
    return answer