package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem{

    private String name;
    private List<FileSystem> children = new ArrayList<>();

    public Folder(String name){
        this.name= name;
    }

    public void add(FileSystem component){
        children.add(component);
    }


    @Override
    public void showDetails() {
        System.out.println("Folder: "+name);
        for(FileSystem f: children){
            f.showDetails();
        }
    }
}
