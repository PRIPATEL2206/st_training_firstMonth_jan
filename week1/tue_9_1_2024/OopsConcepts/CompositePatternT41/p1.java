package OopsConcepts.CompositePatternT41;

import java.util.ArrayList;
import java.util.List;

interface FileSystem{

}

class File implements FileSystem{
    String name;
    File(String n){
        name=n;
    }
}
class Directory implements FileSystem{
    String name;
    
    List<FileSystem> fss=new ArrayList<>();
    Directory(String n){
        name=n;
    }
    void addFileSystem(FileSystem fs){
        fss.add(fs);
    }
    void removeFileSystem(FileSystem fs){
        fss.remove(fs);
    }
}

public class p1 {
    
}
