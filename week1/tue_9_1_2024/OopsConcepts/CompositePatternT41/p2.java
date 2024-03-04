package OopsConcepts.CompositePatternT41;

public class p2 {
    public static void main(String[] args) {
        FileSystem f1=new File("abc.txt");
        FileSystem f2=new File("xyz.txt");
        Directory d1=new Directory("dir1");
        Directory d2=new Directory("dir2");
        Directory d=new Directory("dir");
        d1.addFileSystem(f1);
        d2.addFileSystem(f2);
        d.addFileSystem(d1);
        d.addFileSystem(d2);
        
    }
}
