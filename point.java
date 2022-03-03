public class point {
    
    int a;
    int b;
    private String name;

    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public point() {
        a=0;
        b=0;
    }
    // null constructor
    // parametrized constructor
    public point(int fNo, int sNo) {
        this.a = fNo;
        this.b = sNo;
    }

    // copy constructor
    public point(point object) {
        a = object.a;
        b = object.b;
    }

    public static point addition(point p1, point p2) {
        point temp = new point();
        temp.a = p1.a + p2.a;
        temp.b = p1.b + p2.b;
        return temp;
    }

    public static point multiplication(point p1, point p2) {
        point temp = new point();
        temp.a = p1.a * p2.a;
        temp.b = p1.b * p2.b;
        return temp;
    }

    public static point subtraction(point p1, point p2) {
        point temp = new point();
        temp.a = p1.a - p2.a;
        temp.b= p1.b - p2.b;
        return temp;
    }

    private void show() {
        
        System.out.println("values of a&b:" + a+","+b);
        

    }

    public static void main(String[] args) {
        System.out.println("name of calculator is ");
        point calname = new point();
        calname.setName("casio");
        System.out.println(calname.getName());
        point p1 = new point();
        p1.show();
        point p2 = new point(15, 18);
        p2.show();
        point p3 = new point(p2);
        p3.show();
        point temp = addition(p2, p3);
        System.out.println("sum of first  number of both objects ="+temp.a+"\n"+"sum of second number of both objects ="+temp.b);
        temp = multiplication(p2, p3);
        System.out.println("product of first  number of both objects ="+temp.a+"\n"+"product of second number of both objects ="+temp.b);
        temp = subtraction(p2, p3);
        System.out.println("diffrence of first  number of both objects ="+temp.a+"\n"+"diffrence of second  number of both objects ="+temp.b);

    }

}
