def solution(spell, dic):
    spell.sort()
    answer = 2
    spell = "".join(spell)
    print(spell+'\n')
    for i in dic:
        if(spell=="".join(sorted(set(i)) ) ):
            answer = 1
            break
    return answer