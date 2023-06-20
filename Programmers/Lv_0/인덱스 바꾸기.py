def solution(my_string, num1, num2):
    temp = 0
    if (num1 > num2) :
        temp = num2
        num1 = num2
        num2 = temp
    answer = ''
    answer = my_string[:num1]+my_string[num2]+my_string[num1+1:num2]+my_string[num1]+my_string[num2+1:]
    return answer