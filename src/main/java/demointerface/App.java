package demointerface;

public class App {
    public static void main(String[] args) {
        conCho c = new conCho();
        c.an();
        c.tenDongVat="Messi";
        c.gender = "pede";
        System.out.println(c.tenDongVat + c.gender);
        c.crazy();
        c.ngu();
        c.run();
        c.sanMoi();
        c.diNhau();
        c.sinhsan();

        ConMeo m = new ConMeo();
        m.an();
        m.crazy();
        m.sanMoi();

    }
}
