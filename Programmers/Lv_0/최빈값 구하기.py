def solution(array):
    answer = 0
    dic = {}
    for i in array:
        if(i not in dic):
            dic[i] = 1
        else:
            dic[i] += 1
            
    dic = sorted(dic.items(), key= lambda item : item[1], reverse=True)
    print(dic)
    
    for i in range(len(dic)):
        if(i == 0):
            answer = dic[i][0]
        elif(dic[i][1] == dic[0][1]):
            answer = -1
            break
        elif(i > 2):
            break  
        
    return answer