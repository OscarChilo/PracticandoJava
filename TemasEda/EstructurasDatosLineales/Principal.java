package TemasEda.EstructurasDatosLineales;

public class Principal {
    public static void main(String[] args) {
        ListArray<Integer> lis = new ListArray<>(5);

        lis.add(15);
        lis.add(14);
        lis.add(18);

        for (Integer ele : lis) {
            System.out.println(ele);
        }
    }
}
