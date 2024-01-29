import java.util.Arrays;

class HeapSort {
    public static void buildTree(int[] tree, int i, int n) {
        // Введите свое решение ниже
        //левый ребёнок
        int l = i * 2 + 1;

        //правый ребёнок
        int r = i * 2 + 2;

        //Инициализируем наибольший элемент как корень
        int largest = i;

        //Проверка чтоб дети не стали больше чем родители
        //Если левый дочерний элемент больше корня
        if(l < n && tree[l] > tree[largest])
            largest = l;

        //Если правый дочерний элемент больше,
        // чем самый большой элемент на данный момент
        if(r < n && tree[r] > tree[largest])
            largest = r;

        //Если, ребёнок оказался больше родителя, то делаем обмен,
        //ребёнка с родителем. Если самый большой элемент не корень
        if (i != largest) {
            int temp = tree[i];
            tree[i] = tree[largest];
            tree[largest] = temp;

            //Проверяем ещё раз чтоб дети были меньше чем родители,
            //если, вдруг у детей есть свои дети
            //Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            buildTree(tree, largest, n);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
// Введите свое решение ниже
        //длина массива
        int n1 = sortLength;

        //создаём дерево, построение кучи (перегруппируем массив)
        for(int i  = n1 / 2 - 1; i >= 0; i--)
            buildTree(sortArray, i , n1);

        //Делаем сортировку массива, уже отсортированного дерева,
        //Один за другим извлекаем элементы из кучи
        for (int i = n1 - 1; i >= 0; i--) {

            // Перемещаем текущий корень в конец
            int temp = sortArray[i];
            sortArray[i] = sortArray[0];
            sortArray[0] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            buildTree(sortArray, 0, i);
        }
    }
}

// Не удаляйте и не меняйте метод Main!
public class TestAvtotesta {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}