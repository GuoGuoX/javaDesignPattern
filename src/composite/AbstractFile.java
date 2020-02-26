package composite;
/**
 * 组合模式（树形结构，遍历）
 */

import jdk.nashorn.api.tree.NewTree;

import java.util.ArrayList;

public interface AbstractFile {
    void killVirus();
}

class ImageFile implements AbstractFile{
    private String name;

    public ImageFile(String name){
        this.name=name;
    }
    @Override
    public void killVirus() {
        System.out.println("查杀名为"+name+"：图像文件！！！");
    }
}
class TextFile implements AbstractFile{

    private String name;

    public TextFile(String name){
        this.name=name;
    }

    @Override
    public void killVirus() {
        System.out.println("查杀名为"+name+"：文本文件！！！");
    }
}
//文件夹，提供文件夹遍历功能，用于遍历查杀文件夹中的文件
class Folder implements AbstractFile{
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    //文件存放容器
    ArrayList<AbstractFile> list = new ArrayList<AbstractFile>();

    //添加文件
    public void addFile(AbstractFile abstractFile){
        list.add(abstractFile);
    }
    public void remove(AbstractFile abstractFile){
        list.remove(abstractFile);
    }


    @Override
    public void killVirus() {
        System.out.println(name+"文件夹开始查杀");
        for (AbstractFile abstractFile:list) {
            abstractFile.killVirus();
        }
    }
}

class Main{
    public static void main(String[] args) {
        TextFile textFile1 = new TextFile("小说霸道总裁");

        ImageFile imageFile1 = new ImageFile("水星高清图片");
        TextFile textFile2 = new TextFile("小说聊斋");
        TextFile textFile3 = new TextFile("小说水浒");
        ImageFile imageFile2 = new ImageFile("金星高清图片");
        ImageFile imageFile3 = new ImageFile("银河高清图片");

        Folder folder = new Folder("文本和图片文件夹");
        folder.addFile(textFile1);
        folder.addFile(imageFile2);
        folder.addFile(textFile2);
        folder.addFile(imageFile1);
        folder.addFile(imageFile3);
        folder.addFile(textFile3);

        folder.killVirus();

/*
        textFile1.killVirus();
        imageFile2.killVirus();
        textFile2.killVirus();
        imageFile1.killVirus();*/

    }
}
