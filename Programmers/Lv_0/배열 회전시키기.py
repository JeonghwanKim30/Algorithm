def solution(numbers, direction):
    a=0
    if (direction=='right'):
        a = numbers.pop()
        numbers.insert(0,a)
    else:
        a = numbers[0]
        del(numbers[0])
        numbers.append(a)
    
    return numbers