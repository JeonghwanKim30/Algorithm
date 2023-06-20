def solution(s):
    answer = ''
    array=[]
    dic = {}
    for i in range(len(s)):
        if(s[i] not in dic):
            dic[s[i]]=1
        else:
            dic[s[i]]+=1
    for key,value in dic.items():
        if (value==1):
            array.append(key)
        array.sort()
        answer = "".join(array)
    return answer