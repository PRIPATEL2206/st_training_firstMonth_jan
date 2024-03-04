package proxy;//Example for Proxy pattern

public class Main {
    
    public static void main(String[] args) {
        Image image = new ProxyImage("Harshvardhan.jpeg");
        
        //First Time it will load image from disk first and then display
        image.display();

        //This time it will not load image from disk. It will directly display the file.
        image.display();
    }

}


