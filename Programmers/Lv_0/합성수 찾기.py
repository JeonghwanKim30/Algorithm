def solution(n):
    answer = 0
    div = 0
    
    for i in range (1,n+1):
        for j in range(1,i+1):
            if(i%j == 0):
                div+=1
            if (div>=3):
                answer +=1
                break
        div = 0
    return answer