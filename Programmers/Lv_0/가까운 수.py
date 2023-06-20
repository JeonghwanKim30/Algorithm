def solution(array, n):
    answer = 100
    div = 100
    for i in array:
        if(div > abs(n-i)):
            answer = i
            div = abs(n-i)
        elif(div == abs(n-i) and answer > i):
            answer = i
    return answer