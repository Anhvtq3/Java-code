public class Circle {
    double r=8;
    double perimeter_circle(){
        double P = r*2*3.14;
        System.out.println("Chu vi hình tròn= " + P);
        return P;

    }
    double area_circle(){
        double S1= Math.pow(r,2) ;
        double S=S1*3.14;
        System.out.println("Diện tích hình tròn= " + S);
        return S;
    }
}
