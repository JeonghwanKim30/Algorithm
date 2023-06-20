def solution(array):
    answer = 0
    string = "".join(map(str,array))
    for i in range(len(string)):
        if(string[i]=='7'):
            answer +=1
    return answer