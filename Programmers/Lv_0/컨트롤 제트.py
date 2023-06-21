def solution(s):
    answer = 0
    array = s.split()
    array2 =[]
    
    for i in array:
        if(i == 'Z'):
            array2.pop()
        else:
            array2.append(i)
    
    answer = sum(map(int,array2))
    
    return answer