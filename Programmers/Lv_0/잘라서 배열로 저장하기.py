def solution(my_str, n):
    answer = []
    a = 0
    b=0
    while(a+b < len(my_str)):
        b+=1
        if(b==n):
            answer.append(my_str[a:a+b])
            a+=b
            b=0
            
    if(b!=0):
        answer.append(my_str[a:a+b])
        
    return answer