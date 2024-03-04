import os

def generate_cpp_files(start, end):
    for i in range(start, end+1):
        filename = f"{i}.py"
        with open(filename, 'w') as file:
            # You can add content to the file if needed
            file.write(f"# file {filename}\n")
        print(f"Generated file: {filename}")

if __name__ == "__main__":
    start_number = 1
    end_number = 49
    generate_cpp_files(start_number, end_number)