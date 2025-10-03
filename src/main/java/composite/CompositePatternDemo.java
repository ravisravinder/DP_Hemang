package composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        File file1 = new File("Resume.docx");
        File file2 = new File("Photo.png");
        File file3 = new File("Notes.txt");

        // Create folders
        Folder folder1 = new Folder("Documents");
        Folder folder2 = new Folder("Pictures");

        folder1.add(file1);
        folder1.add(file3);
        folder2.add(file2);

        Folder root = new Folder("My Computer");
        root.add(folder1);
        root.add(folder2);

        root.showDetails();
    }
}
