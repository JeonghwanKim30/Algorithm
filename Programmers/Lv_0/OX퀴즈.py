def solution(quiz):
    answer = []
    for i in quiz:
        lis = i.split()
        lis[0] = int(lis[0])
        lis[2] = int(lis[2])
        lis[4] = int(lis[4])
        if(lis[1] == '+'):
            lis[3] = lis[0]+lis[2]
        else:
            lis[3] = lis[0]-lis[2]
        if(lis[3] == lis[4]):
            answer.append('O')
        else:
            answer.append('X')
    return answer