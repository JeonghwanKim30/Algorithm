def solution(sides):
    answer = 1
    max = 0
    for i in sides:
        if(max < int(i)):
            max = i
    if(sum(sides) - max <= max):
        answer = 2
    return answer