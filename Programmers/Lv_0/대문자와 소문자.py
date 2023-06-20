def solution(my_string):
    answer = ''
    for i in range(len(my_string)):
        if (ord(my_string[i])<=90):
            answer += chr(ord(my_string[i])+32)
        else:
            answer += chr(ord(my_string[i])-32)
    return answer