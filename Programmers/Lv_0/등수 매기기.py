def solution(score):
    answer = []
    sets = []
    for i in score:
        sets.append(i[0]+i[1])
    sets.sort(reverse=True)
    for i in range(len(score)):
        for j in range(len(sets)):
            if(score[i][0]+score[i][1] == sets[j]):
                answer.append(j+1)
                break
    return answer