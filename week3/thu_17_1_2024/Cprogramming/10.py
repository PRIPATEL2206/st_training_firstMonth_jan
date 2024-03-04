class StudentInformationSystem:
    def __init__(self):
        self.students = []

    def view_students(self):
        print("Student Information:")
        for index, student in enumerate(self.students, start=1):
            print(f"{index}. {student['name']} - {student['id']}")

    def view_student(self, student_id):
        student = next((s for s in self.students if s['id'] == student_id), None)
        if student:
            print(f"\nName: {student['name']}\nID: {student['id']}\n")
        else:
            print("Student not found.")

    def add_student(self, name, student_id):
        new_student = {"name": name, "id": student_id}
        self.students.append(new_student)
        print("New student added successfully.")

sis = StudentInformationSystem()

while True:
    print("\n1. View Students\n2. View Student\n3. Add Student\n4. Exit")
    choice = input("Enter your choice (1-4): ")

    if choice == '1':
        sis.view_students()
    elif choice == '2':
        student_id = int(input("Enter student ID: "))
        sis.view_student(student_id)
    elif choice == '3':
        name = input("Enter student name: ")
        student_id = int(input("Enter student ID: "))
        sis.add_student(name, student_id)
    elif choice == '4':
        print("Exiting the student information system. Goodbye!")
        break
    else:
        print("Invalid choice. Please enter a number between 1 and 4.")