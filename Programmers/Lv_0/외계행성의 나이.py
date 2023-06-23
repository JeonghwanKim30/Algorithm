def solution(age):
    
    answer =''
    for i in str(age):
        answer += chr(ord(i) + 49)
    return answer