def solution(n):
    answer = 0
    while(n>=1):
        answer = answer + n%10
        n = int(n/10)
    return answer