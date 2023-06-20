def solution(my_string):
    string = ''
    answer = 0
    for i in my_string:
        if(ord(i)>=48 and ord(i)<=57):
            string += i
        elif(len(string)!=0):
            answer += int(string)
            string = ''
    if(len(string)!=0):
        answer += int(string)
    return answer