class circle { // Removed 'public'
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Cylinders extends circle { // Removed 'public'
    public double height;

    public double volume() {
        return area() * height;
    }
}

class Inheritance1 { // Kept this as 'public' since filename should match
    public static void main(String[] args) {
        Cylinders c1 = new Cylinders();
        c1.height = 10;
        c1.radius = 7;
        System.out.println("Volume: " + c1.volume());
        System.out.println("Area: " + c1.area());
    }
}
