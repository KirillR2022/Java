//1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader
//2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
//3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, отчества, возрас и пол в отдельных списках.
//4.Отсортировать по возрасту используя дополнительный список индексов.


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;

public class lesson_4 {

    public static void main(String[] args) throws Exception {

        ArrayList<String> listf = new ArrayList<>();
        ArrayList<String> listn = new ArrayList<>();
        ArrayList<String> listsn = new ArrayList<>();
        ArrayList<Integer> listage = new ArrayList<>();
        ArrayList<String> listngend = new ArrayList<>();
        ArrayList<Integer> listid = new ArrayList<>();

        int id = 0;
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            String[] st = new String[5];
            st = str.split(" ");
            listf.add(st[0]);
            listn.add(st[1]);
            listsn.add(st[2]);
            listage.add(Integer.parseInt(st[3]));
            listngend.add(st[4]);
            listid.add(id);
            id ++;
        }
        br.close();

        System.out.println("\nИсходный список: ");
        printArr(listf, listn, listsn, listage, listngend, listid);

        var listid0 = new ArrayList<>(listid);          //  !!!! (продвинутый вариант) создаем копию listid, дабы его не трогать
        //ArrayList<Integer> listid0 = (ArrayList) listid.clone();  //  создаем копию listid, дабы его не трогать (1 - й вариант)
        ArrayList<Integer> listid1 = new ArrayList<>();   // список индексов отсортированного списка (в перспективе)

        int min = 1000;
        int ind = 0;
        while (!listid0.isEmpty()){
            min = 1000;
            for (int i: listid0){
                if (listage.get(i) < min){
                    min = listage.get(i);
                    ind = i;
                }
            }
            listid1.add(ind);
            listid0.remove((Integer) ind);
        }

        System.out.println("\nОтсортированный список: ");
        printArr(listf, listn, listsn, listage, listngend, listid1);
    }

    private static void printArr(ArrayList<String> listf, ArrayList<String> listn, ArrayList<String> listsn,
                                 ArrayList<Integer> listage, ArrayList<String> listngend, ArrayList<Integer> listid){
        for (int i: listid){
            System.out.printf("%s %c.%c.  %d  %c \n", listf.get(i), listn.get(i).charAt(0), listsn.get(i).charAt(0),
                    listage.get(i), listngend.get(i).charAt(0));
        }
    }
}
