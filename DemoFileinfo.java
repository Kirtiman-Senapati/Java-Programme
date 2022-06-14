import java.io.File;

class DemoFileinfo {
    public static void main(String[] args) {
        File u = new File("D://Pratice//createfile.txt");
        if (u.exists()) {
            System.out.println("file Name:" + u.getName());
            System.out.println("the absolute path:" + u.getAbsolutePath());
            System.out.println("is file writeable ? :" + u.canWrite());
            System.out.println("is file readable ? :" + u.canRead());
            System.out.println("the size of file :" + u.length());
            // System.out.println("file removed: "+u.delete());
        } else {
            System.out.println("File does not exist");
        }
    }
}
