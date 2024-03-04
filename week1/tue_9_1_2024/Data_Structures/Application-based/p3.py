class FlileSystem:
    pass

class File(FlileSystem):
    name=""
    def __init__(self,name) -> None:
        self.name=name
        super().__init__()

class Directory(FlileSystem):
    name=""
    files=[]
    def __init__(self,name) -> None:
        self.name=name
        super().__init__()
    def add(self,file:FlileSystem):
        self.files.append(file)
    def remove(self,file:FlileSystem):
        self.files.remove(file)

