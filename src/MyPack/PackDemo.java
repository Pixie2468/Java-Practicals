// This is the package file for Practical29

package MyPack;

public class PackDemo {
    public static void main() {
        file1 f1 = new file1();
        System.out.println(f1.str1);
        file2 f2 = new file2();
        System.out.println(f2.str2);
        file3 f3 = new file3();
        System.out.println(f3.str3);
    }
}

class file1 {
    public String str1 = "file1";
}

class file2 {
    public String str2 = "file2";
}

class file3 {
    public String str3 = "file3";
}
