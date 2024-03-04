matrix=[[0,1,1],[3,7,4],[9,1,2]]

normal=0
trace=0

for i in range(0,3):
    for j in range(0,3):
        normal+=matrix[i][j]*matrix[i][j]
        if i==j:
            trace+=matrix[i][j]
print(normal**0.5)
print(trace)            