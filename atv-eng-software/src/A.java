public class A {
    private float a1;
    private float a2;

    public float getA1() {
        return a1;
    }

    public void setA1(float a1) {
        this.a1 = a1;
    }

    public float getA2() {
        return a2;
    }

    public void setA2(float a2) {
        this.a2 = a2;
    }

    public void MA1() {
        System.out.println("MA1");
    }

    public void MA2() {
        System.out.println("MA2");
    }

    public void MA3() {
        System.out.println("MA3");
    }

    public int getSoma(int n1, int n2) {
        int resultado = n1+n2;
        return resultado;
    }
}
