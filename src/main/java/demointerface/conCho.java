package demointerface;

public class conCho extends DongVat implements HanhViCuaDongVaT,NhungHanhViKhacCuaDongVat{
    @Override
    public void an() {
        System.out.println(" con cho thit bo");
    }

    @Override
    public void ngu() {
        System.out.println("Con cho ngu duoi dat");
    }

    @Override
    public void crazy() {
        System.out.println("con cho hay can bay");

    }

    @Override
    public void run() {
        System.out.println("con cho hay chay ra duong");
    }

    @Override
    public void diNhau() {
        System.out.println("Nhau thit cho");
    }

    @Override
    public void sinhsan() {
        System.out.println("duy tri noi giong");
    }
}
