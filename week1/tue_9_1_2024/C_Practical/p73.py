# read
with open("C:/Users/baps/Desktop/st_training/jan/week1/tue_9_1_2024/C_Practical/testfile.txt","r") as f:
    print(f.read())

# write
with open("C:/Users/baps/Desktop/st_training/jan/week1/tue_9_1_2024/C_Practical/testfile.txt","w") as f:
    f.write("this is added after file")

#copy
with open("C:/Users/baps/Desktop/st_training/jan/week1/tue_9_1_2024/C_Practical/testfile.txt","r") as f1:
    with open("C:/Users/baps/Desktop/st_training/jan/week1/tue_9_1_2024/C_Practical/testfilecopy.txt","w") as f2:
        f2.write(f1.read())