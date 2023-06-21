def solution(dots):
    answer = 0
    row = 0
    col = 0
    for i in range(len(dots)):
        if(dots[i][0] != dots[0][0]):
            row = dots[i][0] - dots[0][0]
        if(dots[i][1] != dots[0][1]):
            col = dots[i][1] - dots[0][1]
    answer = row*col
    if(row*col < 0):
        answer= -answer
    return answer