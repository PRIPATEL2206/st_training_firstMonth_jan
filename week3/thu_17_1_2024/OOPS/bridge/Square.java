package bridge;

class Square extends Shape{

    public Square(Color color){
        super(color);
    }

    @Override
    public String draw() {
        return "Square is drawn. " + color.fill();
    }
}
