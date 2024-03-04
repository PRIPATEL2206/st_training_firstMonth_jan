package proxy;//Example for Proxy pattern

class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying File :" + fileName);    
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading file: " + fileName);
    }

}


