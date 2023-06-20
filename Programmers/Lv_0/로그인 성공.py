def solution(id_pw, db):
    answer = 'fail'
    if(id_pw in db):
        answer = 'login'
    else:
        for i in range(len(db)):
            if(id_pw[0]==db[i][0] and id_pw[1] != db[i][1]):
                answer = 'wrong pw'
                break
    return answer