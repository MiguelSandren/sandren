HEIGHT = 1.60
WEIGHT = 50

BMIResult = WEIGHT / HEIGHT ** 2
print("BMIResult:" ,BMIResult)
if BMIResult < 18.5 :
    print("UnderWeight")
elif 18.5 <= BMIResult < 25.0:
    print("Normal")
elif 25.0 <= BMIResult < 30.0:
    print("Overweight")
elif BMIResult >= 30.0:
    print("Obese")