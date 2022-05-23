import random

Customer_Service_BU = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n"]

result = []

while Customer_Service_BU:
    temp = random.sample(Customer_Service_BU,2)
    result.append(temp)
    for t in temp:
        Customer_Service_BU.remove(t)

print(result)

