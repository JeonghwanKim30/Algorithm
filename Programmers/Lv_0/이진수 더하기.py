def solution(bin1, bin2):
    ten1 = 0
    ten2 = 0
    answer =0
    bin1 = int(bin1)
    bin2 = int(bin2)
    count = 0
    while(bin1 >= 1):
        ten1 += (bin1%10)*2**count
        count +=1
        bin1 //=10
    count =0
    while(bin2 >= 1):
        ten2 += (bin2%10)*2**count
        count +=1
        bin2 //=10  
    answer = ten1 + ten2
    return bin(answer)[2:]