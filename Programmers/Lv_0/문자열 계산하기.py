def solution(my_string):
    answer = 0
    count = 0
    array = []
    string = my_string.replace(" ","")
    product = 1
    for i in range(len(string)-1,-1,-1):
        if(string[i] == '+'):
            answer += count
            product = 1
            count = 0 
        elif(string[i] == '-'):
            answer -= count
            product = 1
            count = 0 
        else:
            count += int(string[i])*product
    
    answer += count
    return answer