import subprocess

inp=input("$ ")
while (True):
    if inp=="exit":
        break
    subprocess.run(inp,shell=True)
    inp=input("$ ")
