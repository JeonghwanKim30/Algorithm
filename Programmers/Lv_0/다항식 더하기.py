def solution(polynomial):
    arr = polynomial.split()
    num = 0
    digit = 0
    answerlist = []
    answer = ''

    for i in arr:
        if (i[-1] == 'x'):
            if(len(i)==1):
                digit+=1
            if(len(i) > 1):
                word = ""
                for j in range(len(i)-1):
                    word += i[j]
                digit += int(word)
        else:
            if(i == '+'):
                continue
            word = ""
            for j in range(len(i)):
                word += i[j]
            num += int(word)
                

    if (digit == 1):
        answerlist.append('x')
    if (digit > 1):
        answerlist.append(str(digit) + 'x')
    if (digit > 0 and num > 0):
        answerlist.append('+')
    if (num != 0):
        answerlist.append(str(num))
    answer = " ".join(answerlist)

    return answer