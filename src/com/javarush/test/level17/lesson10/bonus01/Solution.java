package com.javarush.test.level17.lesson10.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution
{
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        String paramsString = readParams();

        HashMap<String, String> params = parseParams(paramsString);

        System.out.println(params);

        executeCommand(params);

        System.out.println(allPeople);
    }

    private static String readParams() {
        //read file names
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String paramsString = "";

        try {
            paramsString = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return paramsString;
    }

    private static HashMap<String, String> parseParams(String paramsString) {
        String[] array = paramsString.split(" ");

//        if (NumberUtils.isNumber(array[0])) {
//        }

        HashMap<String, String> params = new HashMap<String, String>();

        switch (array[0]) {
            case "-c":
                params.put("command", array[0]);
                params.put("name", array[1]);
                params.put("sex", array[2]);
                params.put("bd", array[3]);
                break;
            case "-u":
                params.put("command", array[0]);
                params.put("id", array[1]);
                params.put("name", array[2]);
                params.put("sex", array[3]);
                params.put("bd", array[4]);
                break;
            case "-d":
                params.put("command", array[0]);
                params.put("id", array[1]);
                break;
            case "-i":
                params.put("command", array[0]);
                params.put("id", array[1]);
                break;
        }

        return params;
    }

    private static void executeCommand(HashMap<String, String> params) {
        String id = "", name = "", sex = "";
        Date date;
        int numericId;
        Person person;

        switch (params.get("command")) {
            case "-c":
                if (params.get("sex").equals("м")) {
                    date = prepareDate(params.get("bd"), "dd/MM/yyyy");

                    allPeople.add(Person.createMale(
                            params.get("name"),
                            date
                    ));
                } else if (params.get("sex").equals("ж")) {
                    date = prepareDate(params.get("bd"), "dd/MM/yyyy");

                    allPeople.add(Person.createFemale(
                            params.get("name"),
                            date
                    ));
                }

                System.out.println(allPeople.size() - 1);

                break;
            case "-u":
                id = params.get("id");

                numericId = Integer.parseInt(id);
                person = allPeople.get(numericId);

                name = params.get("name");
                sex = params.get("sex");
                date = prepareDate(params.get("bd"), "dd/MM/yyyy");
                person.setSex(sex.equals("м") ? Sex.MALE : Sex.FEMALE);
                person.setName(name);
                person.setBirthDay(date);

                allPeople.set(numericId, person);

                break;
            case "-d":
                id = params.get("id");
                allPeople.remove(id);
                break;
            case "-i":
                id = params.get("id");

                numericId = Integer.parseInt(id);
                person = allPeople.get(numericId);

                name = person.getName();
                sex = person.getSex() == Sex.MALE ? "м" : "ж";
                date = person.getBirthDay();

                SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                System.out.printf("%s %s %s \n", name, sex, formatter.format(date));
                break;
        }
    }

    private static Date prepareDate(String dateInString, String format) {
        if (format == null) {
            format = "dd/MM/yyyy";
        }

        SimpleDateFormat formatter = new SimpleDateFormat(format, Locale.ENGLISH);
        Date date = null;
        try {
            date = formatter.parse(dateInString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }
}
