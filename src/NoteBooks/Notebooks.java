package NoteBooks;

import java.util.Objects;

public class Notebooks {
    private String name;
    private int memoryozu;
    private int memoryssdhdd;
    private String manufacturer;
    private String color;
    private int videomemory;
    private String os;

    public Notebooks(String manufacturer, String name, int memoryozu, int videomemory, int memoryssdhdd, String color, String os) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.memoryozu = memoryozu;
        this.videomemory = videomemory;
        this.memoryssdhdd = memoryssdhdd;
        this.color = color;
        this.os = os;

    }
    public String getManufacturer(){
        return manufacturer;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getMemoryozu(){
        return memoryozu;
    }
    public void setMemoryozu(int memoryozu){
        this.memoryozu = memoryozu;
    }
    public int getVideomemory(){
        return videomemory;
    }
    public void setVideomemory(int videomemory){
        this.videomemory = videomemory;
    }
    public int getMemoryssdhdd(){
        return memoryssdhdd;
    }
    public void setMemoryssdhdd(int memoryssdhdd){
        this.memoryssdhdd = memoryssdhdd;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebooks{" +
                "name='" + name + '\'' +
                ", memoryozu=" + memoryozu +
                ", memoryssdhdd=" + memoryssdhdd +
                ", manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", videomemory=" + videomemory +
                ", os='" + os + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebooks notebooks = (Notebooks) o;
        return memoryozu == notebooks.memoryozu && memoryssdhdd == notebooks.memoryssdhdd && videomemory == notebooks.videomemory && Objects.equals(name, notebooks.name) && Objects.equals(manufacturer, notebooks.manufacturer) && Objects.equals(color, notebooks.color) && Objects.equals(os, notebooks.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, memoryozu, memoryssdhdd, manufacturer, color, videomemory, os);
    }
}