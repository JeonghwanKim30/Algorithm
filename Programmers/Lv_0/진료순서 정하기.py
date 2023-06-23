def solution(emergency):
    answer = []
    sorted_array = sorted(emergency,reverse=True)
    for i in range(len(emergency)):
        for j in range(len(emergency)):
            if(sorted_array[j] == emergency[i]):
                   answer.append(j+1)
    return answer