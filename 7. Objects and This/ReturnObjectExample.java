public class ReturnObjectExample{
    int x, y;

    ReturnObjectExample(int x, int y){
        this.x = x;
        this.y = y;
    }

    ReturnObjectExample add(ReturnObjectExample obj){
        int sumX = this.x + obj.x;
        int sumY = this.y + obj.y;
        return new ReturnObjectExample(sumX, sumY);
    }

    void display() {
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void main(String[] args){
        ReturnObjectExample a = new ReturnObjectExample(5, 7);
        ReturnObjectExample b = new ReturnObjectExample(3, 4);
        ReturnObjectExample result = a.add(b);
        result.display();
    }
}
