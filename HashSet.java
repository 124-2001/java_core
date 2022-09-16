import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int n;
        n = Integer.parseInt(scanner.nextLine());*/
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Red");
        hashSet1.add("Pink");
        hashSet1.add("White");
        hashSet1.add("Yellow");
        hashSet1.add("Black");
        hashSet1.add("Green");
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("Red");
        hashSet2.add("Pink");
        hashSet2.add("Green");
        System.out.print("Cac phan tu lap trong hash set là : ");
        for (String s : hashSet1) {
            for (String s1 : hashSet2) {
                if(s==s1){
                    System.out.print(s+" ");
                }
            }
        }
        System.out.println();
        System.out.println("Xoa phan tu hashset2 ");
        hashSet2.clear();
        System.out.println(hashSet2);
        hashSet2.add("Red");
        hashSet2.add("Pink");
        hashSet2.add("Green");
        System.out.println();

        System.out.println("Size hashset1 "+ hashSet1.size());

        System.out.println("Nhan ban hashset");
        HashSet<String> hashSet3 = (HashSet<String>) hashSet1.clone();
        System.out.println("hashset3 : "+hashSet3);
        System.out.println();
        String[] arrString = new String[hashSet1.size()];
        int count =0;
        for (String s : hashSet1) {
            arrString[count]=s;
            count++;
        }
        System.out.print("Mang vua tao la : ");
        for (String s : arrString) {
            System.out.print(s+" ");
        }
        System.out.println();
        TreeSet<String> tsArr = new TreeSet<>(hashSet1);
        System.out.println("mang TreeSet moi tao la : ");
        System.out.println(tsArr);
        System.out.println();
        System.out.println("ArrayList vua tao ra la : ");
        ArrayList<String> arrayList1 = new ArrayList<>(hashSet1);
        System.out.println(arrayList1);
        System.out.println();
        if(hashSet1.containsAll(hashSet2)||hashSet2.containsAll(hashSet1)){
            System.out.println("Cac mang co chua phan tu giong nhau");
        }
        else {
            System.out.println("Hai mang khac nhau");
        }
        System.out.println();
        System.out.print("Cac phan tu giong nhau  la: ");
        hashSet1.retainAll(hashSet2);
        System.out.println(hashSet1);

    }
}
