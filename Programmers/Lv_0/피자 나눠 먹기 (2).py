def solution(n):
    answer = 0
    i = 1
    while(True):  
        if((6*i)%n==0):
            answer = i
            break
        i += 1
    return answer