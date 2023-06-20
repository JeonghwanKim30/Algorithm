def solution(str1, str2):
    answer = 2
    for i in range(len(str1)-len(str2)+1):       
        for j in range(len(str2)):
            if(str1[i+j] != str2[j]):
                break
            if(j==len(str2)-1):
                answer = 1
        if(answer ==1):
            break
    return answer