package demointerface;

public class ConMeo extends DongVat implements HanhViCuaDongVaT {
    @Override
    public void an() {
        System.out.println("con meo an ca");
    }

    @Override
    public void ngu() {
        System.out.println("con meo ngu noc nha");
    }

    @Override
    public void crazy() {
        System.out.println("con meo hay cao bay");
    }

    @Override
    public void run() {
        System.out.println("con meo chay nhu dien");

    }
}
