package NoteBooks;
//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
//Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
//Критерии фильтрации можно хранить в Map.
//Например: “Введите цифру, соответствующую необходимому критерию:
//    1 - ОЗУ 2 - Объем ЖД 3 - Операционная система 4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class СhoosALaptop {
    public static Notebooks baseNote = new Notebooks("производитель", "модель",0,0,0,"цвет","ОС");
    public static void main(String[] args) {
        Set<Notebooks>laptops = allNotebooks();
        sortNotebooks(laptops);


    }

    public static Set<Notebooks> allNotebooks() {
        Notebooks laptop1 = new Notebooks("Apple", "MacBook Pro", 16, 8, 1000, "Серый", "MacOS");
        Notebooks laptop2 = new Notebooks("Apple", "MacBook Air", 8, 6, 1000, "Серый", "MacOS");
        Notebooks laptop3 = new Notebooks("MSI", "Creator", 32, 16, 2000, "Белый", "Windows");
        Notebooks laptop4 = new Notebooks("HP", "Pavilion 15", 16, 4, 500, "Белый", "Windows");
        Notebooks laptop5 = new Notebooks("Lenovo", "ThinkPad", 8, 8, 1000, "Черный", "Windows");
        Notebooks laptop6 = new Notebooks("Lenovo", "ThinkPad Pro", 8, 6, 1000, "Черный", "Windows");
        Notebooks laptop7 = new Notebooks("Acer", "Design", 16, 4, 2000, "Зеленый", "no OS");
        Notebooks laptop8 = new Notebooks("MSI", "Stealth think pro", 16, 6, 2000, "Черный", "no OS");
        Notebooks laptop9 = new Notebooks("Gigabyte", "Power7", 8, 4, 1000, "Темно-синий", "Windows");

        Set<Notebooks> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7, laptop8, laptop9));
        return laptops;
    }
    public static void availabilityLaptops(Set<Notebooks> notebok) {
        System.out.println("В продаже имеется: ");
        for (Notebooks laptop: notebok) {
            System.out.println(laptop);

        }

    }

    public static void messageSort() {
        System.out.println("Выберите критерий сортировки: ");
        System.out.println("1 - сортировка по бренду");
        System.out.println("2 - сортировка по объему оперативной памяти(Гб)");
        System.out.println("3 - сортировка по объему места на жестком диске(Гб)");
        System.out.println("4 - сортировка по объему видеопамяти(Гб)");
        System.out.println("5 - сортировка по цвету ноутбука");
        System.out.println("6 - просмотреть все ноутбуки в продаже");
        System.out.println("Для выхода введите \"0\"");

    }

    public static void sortNotebooks(Set<Notebooks> laptop) {
        messageSort();
        Scanner sc = new Scanner(System.in);
        String paramSort = sc.nextLine();
        boolean exitWhile = true;
        while (exitWhile){
            switch (paramSort){
                case "1":
                    System.out.print("Введите имя производителя для поиска (Apple, MSI, Lenovo, Acer, HP, Gigabyte): ");
                    String nameBrand = sc.nextLine();
                    baseNote.setManufacturer(nameBrand);
                    System.out.println(baseNote);
                    System.out.println("Введите команду(полное меню 7): ");
                    paramSort = sc.nextLine();
                    break;
                case "2":
                    System.out.print("Введите желаемый объем ОЗУ(8, 16, 32 Гб): ");
                    int maxRAM = Integer.parseInt(sc.nextLine());
                    baseNote.setMemoryozu(maxRAM);
                    System.out.println(baseNote);
                    System.out.println("Введите команду(полное меню 7): ");
                    paramSort = sc.nextLine();
                    break;
                case "3":
                    System.out.print("Введите желаемый объем жеского диска(500, 1000, 2000 Гб): ");
                    int maxROM = Integer.parseInt(sc.nextLine());;
                    baseNote.setMemoryssdhdd(maxROM);
                    System.out.println(baseNote);
                    System.out.println("Введите команду(полное меню 7): ");
                    paramSort = sc.nextLine();
                    break;
                case "4":
                    System.out.print("Введите желаемый объем видеопамяти(4, 6, 8, 16 ГБ): ");
                    int maxVideoRam = Integer.parseInt(sc.nextLine());;
                    baseNote.setVideomemory(maxVideoRam);
                    System.out.println("Введите команду(полное меню 7): ");
                    System.out.println(baseNote);
                    paramSort = sc.nextLine();
                    break;
                case "5":
                    System.out.print("Введите желаемый цвет ноутбука(Белый, Зеленый, Черный, Серый, Темно-синий): ");
                    String colorBook = sc.nextLine();
                    baseNote.setColor(colorBook);
                    System.out.println("Введите команду(полное меню 7): ");
                    System.out.println(baseNote);
                    paramSort = sc.nextLine();
                    break;
                case "6":
                    availabilityLaptops(laptop);
                    paramSort = sc.nextLine();
                    break;
                case "7":
                    messageSort();
                    paramSort = sc.nextLine();
                    break;
                case "0":
                    exitWhile = false;
                    break;
                default:
                    System.out.print("Вы ввели неверную команду, чтобы посмотреть инструкцию введите 7: ");
                    paramSort = sc.nextLine();
                    break;
            }


        }
        sc.close();
        System.out.println("Ваши параметры поиска: ");
        System.out.println(baseNote);
        filtrNoteWithParam(laptop);
    }

    public static void filtrNoteWithParam(Set<Notebooks> laptop) {
        Set<Notebooks> notebooks = new HashSet<>();
        for(Notebooks note : laptop)
            if (baseNote.getManufacturer().equals(note.getManufacturer()) || baseNote.getManufacturer().equals("производитель")) {
                if (baseNote.getMemoryozu() == note.getMemoryozu() || baseNote.getMemoryozu() == 0) {
                    if (baseNote.getMemoryssdhdd() == note.getMemoryssdhdd() || baseNote.getMemoryssdhdd() == 0) {
                        if (baseNote.getVideomemory() == note.getVideomemory() || baseNote.getVideomemory() == 0)
                            if (baseNote.getColor().equals(note.getColor()) || baseNote.getColor().equals("цвет")) {
                                notebooks.add(note);
                            }
                    }
                }
            }
        if (notebooks.isEmpty()){
            System.out.println("Подходящих ноутбуков нет");
        }
        else{
            System.out.println("Подходящие для вас ноутбуки: ");
            for(Notebooks not : notebooks){
                System.out.println(not);
            }

        }

    }
}