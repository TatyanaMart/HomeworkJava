package HomeworkJava2.Task3;

import org.json.JSONArray;
import org.json.JSONObject;

/*Задача 3. Дана json строка (можно сохранить в файл и читать из файла) 
(Коллеги, если сложно будет распарсить .json -> можно работать как со строкой обычной)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: 
Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода: Студент Иванов получил 5 по предмету Математика.
 */

public class Main {
    public static void main(String[] args) {
        String resultJson = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        StringBuilder sb = new StringBuilder();
        JSONArray jsonObjArr = new JSONArray(resultJson);
        for (int i = 0; i < jsonObjArr.length(); i++) {
            JSONObject jsonObj = (JSONObject) jsonObjArr.get(i);
            sb.append("Студент " + jsonObj.get("фамилия") + " получил " + jsonObj.get("оценка") + " по предмету "
                    + jsonObj.get("предмет") + "." + "\n");
        }
        System.out.println(sb);
    }
}
