def solution(n):
    i=0
    answer = 1
    while(answer <= n):
        i+=1
        answer *= i
    i-=1
    return i