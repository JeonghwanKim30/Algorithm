def solution(my_string):
    answer = 0
    for i in range(len(my_string)):
        if(ord(my_string[i])>=48 and ord(my_string[i])<=57):
            answer += int(my_string[i])
    return answer