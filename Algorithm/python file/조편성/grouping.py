import sys
import random

sys.stdin = open("input1.txt", "r")

input = sys.stdin.readline

rookie = []
new_recruit = []

for _ in range(127): # 루키랑 신입사원 구분
    temp = list(map(str, input().split(",")))
    if temp[6]=="2021년 하반기 kt ds 대졸 신입사원 채용":
        new_recruit.append(temp)
    else:
        rookie.append(temp)

# 본부별 최대인원 설정
BU_grouping = {}

for member in new_recruit:
    try:
        BU_grouping[member[3]] += 1
    except:
        BU_grouping[member[3]] = 1


for BU in BU_grouping:
    if BU_grouping[BU] % 7 == 0:
        BU_grouping[BU] = BU_grouping[BU] // 7
    else:
        BU_grouping[BU] = BU_grouping[BU] // 7 + 1

print(BU_grouping)

result_group = [[],[],[],[],[],[],[]]
result_BU = [{},{},{},{},{},{},{}]
exception_group = [["김상재","최민기"],["이주아", "김승기"],["김보경","이건국"],["박규성"],["이승준", "홍문기"],["최석원","김동영"],["전유진", "윤대현"]]
exception_1 = ["김상재", "이주아", "김보경", "박규성", "이승준", "최석원", "전유진"]
exception_2 = ["최민기", "홍문기", "윤대현", "김승기", "이건국", "김동영"]
for member in new_recruit:
    if member[1] in exception_1 or member[1] in exception_2:
        for i in range(7):
            if member[1] in exception_group[i]:
                result_group[i].append(member)
                try:
                    result_BU[i][member[3]] += 1
                except:
                    result_BU[i][member[3]] = 1

        continue

    else:
        temp = []
        for i in range(7):
            try:
                if result_BU[i][member[3]] < BU_grouping[member[3]]:
                    temp.append(i)

            except:
                temp.append(i)

        temp2 = []
        for t in temp:
            if len(result_group[t]) < 14:
                temp2.append(t)
        if len(temp2) == 0:
            temp3 = []
            for i in range(7):
                if len(result_group[i]) < 14:
                    temp3.append(i)
            idx = random.choice(temp3)
            result_group[idx].append(member)
            try:
                result_BU[idx][member[3]] += 1
            except:
                result_BU[idx][member[3]] = 1
        else:
            idx = random.choice(temp2)
            result_group[idx].append(member)
            try:
                result_BU[idx][member[3]] += 1
            except:
                result_BU[idx][member[3]] = 1

idx = random.choice([0,1,2,3,4,5,6])
result_group[idx].append(new_recruit[-1])

for group in result_group:
    for member in group:
        print(member[1], member[3])
    print(f"=========={len(group)}===========")

print(len(new_recruit))
print(len(rookie))
    # if member[3] not in BU:
    #     BU.append(member[3])
    #     BU_grouping[member[3]] = []
    # BU_grouping[member[3]].append(member)
