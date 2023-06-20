def solution(a, b):
    answer = 1
    bottom =b
    if(a>=b):
        temp = b
        while(a%b !=0 ):
            temp = a%b
            a = b
            b = temp
    else:
        temp = a
        while(b%a !=0 ):
            temp = b%a
            b = a
            a = temp
    
    bottom = int(bottom/temp)
    
    while(bottom>1):
        if(bottom%2 == 0):
            bottom = int(bottom/2)
        elif(bottom%5 == 0):
            bottom = int(bottom/5)
        else:
            answer = 2
            break
    return answer