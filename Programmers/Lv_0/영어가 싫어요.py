def solution(numbers):
    dic = {'one':1, 'two':2, 'three':3,'four':4, 'five':5, 'six':6, 'seven':7, 'eight':8, 'nine':9, 'zero':0}
    answer = ''
    string = ''
    for i in range(len(numbers)):
        string += numbers[i]
        if(string in dic):
            answer += str(dic[string])
            string =''
    return int(answer)