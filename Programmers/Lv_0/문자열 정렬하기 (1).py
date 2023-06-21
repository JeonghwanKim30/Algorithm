def solution(my_string):
    answer = []
    for i in range(len(my_string)):
        if(ord(my_string[i])>=48 and ord(my_string[i])<=57):
            answer.append(int(my_string[i]))
    answer.sort()
    return answer
