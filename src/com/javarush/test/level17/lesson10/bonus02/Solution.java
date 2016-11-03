package com.javarush.test.level17.lesson10.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
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
        boolean test = false;

        if (!test) {
            String paramsString = commandParams(args);

//        String paramsString = readParams();

            mainWork(paramsString);
        } else {
            test();
        }
    }

    private static String commandParams(String[] args) {
        String argString = "";

        for (String arg : args) {
            argString += arg + " ";
        }

        return argString;
    }

    private static void test() {
        String paramsString = "";
        paramsString = "-c Миронов м 15/04/1990 Миронова ж 15/04/1999";
        mainWork(paramsString);

        paramsString = "-c Миронова ж 15/04/1988";
        mainWork(paramsString);

        paramsString = "-c Миронова ж 15/04/1988";
        mainWork(paramsString);

        //update
        paramsString = "-u 2 Никулин м 15/04/1966 3 Никулина ж 15/04/1968";
        mainWork(paramsString);

//        System.out.println(allPeople);

        //remove
        paramsString = "-d 4 5";
        mainWork(paramsString);

        //info
        paramsString = "-i 2 3";
        mainWork(paramsString);

        System.out.println(allPeople);
    }

    private static void mainWork(String paramsString) {
//        System.out.println(paramsString);

        CommandLoad commandLoad = parseParams(paramsString);

//        System.out.println(commandLoad);

        executeCommand(commandLoad);

//        System.out.println(allPeople);
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

    /**
     * @param paramsString
     * @return
     */
    private static CommandLoad parseParams(String paramsString) {
        String[] array = paramsString.split(" ");
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList(array));
        String commandString = inputList.get(0);
        inputList.remove(0);

        CommandLoad commandLoad = new CommandLoad();
        Command command = commandLoad.getCommandByParam(commandString);
        commandLoad.setCommand(command);

        ArrayList<HashMap<String, String>> commandLoadParams = new ArrayList<>();

        switch (command) {
            case CREATE:
                commandLoadParams = parseCreateParams(inputList);
                break;
            case UPDATE:
                commandLoadParams = parseUpdateParams(inputList);
                break;
            case REMOVE:
                commandLoadParams = parseRemoveParams(inputList);
                break;
            case INFO:
                commandLoadParams = parseInfoParams(inputList);
                break;
        }

        commandLoad.setParams(commandLoadParams);

        return commandLoad;
    }

    private enum Command
    {
        CREATE, REMOVE, UPDATE, INFO;
    }

    /**
     * class container for command name and params
     */
    private static class CommandLoad
    {
        private Command command;

        private ArrayList<HashMap<String, String>> params;

        Command getCommandByParam(String param) {
            Command command = null;
            switch (param) {
                case "-c":
                    command = Command.CREATE;
                    break;
                case "-u":
                    command = Command.UPDATE;
                    break;
                case "-d":
                    command = Command.REMOVE;
                    break;
                case "-i":
                    command = Command.INFO;
                    break;
            }

            return command;
        }

        Command getCommand() {
            return command;
        }

        CommandLoad setCommand(Command command) {
            this.command = command;
            return this;
        }

        public ArrayList<HashMap<String, String>> getParams() {
            return params;
        }

        CommandLoad setParams(ArrayList<HashMap<String, String>> params) {
            this.params = params;
            return this;
        }

        @Override
        public String toString() {
            return "CommandLoad{" +
                    "command='" + command + '\'' +
                    ", params=" + params +
                    '}';
        }
    }

    private static ArrayList<HashMap<String, String>> parseCreateParams(ArrayList<String> inputList) {
        ArrayList<HashMap<String, String>> paramsList = new ArrayList<>();

        for (int k = 0; k < inputList.size(); k += 3) {
            if (k % 3 == 0) {
                HashMap<String, String> params = new HashMap<>();
                params.put("name", inputList.get(k));
                params.put("sex", inputList.get(k + 1));
                params.put("bd", inputList.get(k + 2));

                paramsList.add(params);
            }
        }

        return paramsList;
    }

    private static ArrayList<HashMap<String, String>> parseUpdateParams(ArrayList<String> inputList) {
        ArrayList<HashMap<String, String>> paramsList = new ArrayList<>();

        for (int k = 0; k < inputList.size(); k += 4) {
            if (k % 4 == 0) {
                HashMap<String, String> params = new HashMap<>();
                params.put("id", inputList.get(k));
                params.put("name", inputList.get(k + 1));
                params.put("sex", inputList.get(k + 2));
                params.put("bd", inputList.get(k + 3));

                paramsList.add(params);
            }
        }

        return paramsList;
    }

    private static ArrayList<HashMap<String, String>> parseRemoveParams(ArrayList<String> inputList) {
        ArrayList<HashMap<String, String>> paramsList = new ArrayList<>();

        for (int k = 0; k < inputList.size(); k += 1) {
            HashMap<String, String> params = new HashMap<>();
            params.put("id", inputList.get(k));

            paramsList.add(params);
        }

        return paramsList;
    }

    private static ArrayList<HashMap<String, String>> parseInfoParams(ArrayList<String> inputList) {
        ArrayList<HashMap<String, String>> paramsList = new ArrayList<>();

        for (int k = 0; k < inputList.size(); k += 1) {
            HashMap<String, String> params = new HashMap<>();
            params.put("id", inputList.get(k));

            paramsList.add(params);
        }

        return paramsList;
    }

    /**
     *
     * @param commandLoad
     */
    private static void executeCommand(CommandLoad commandLoad) {
        switch (commandLoad.getCommand()) {
            case CREATE:
                for (HashMap<String, String> params :
                        commandLoad.getParams()) {
                    executeCreateCommand(params);
                }
                break;
            case UPDATE:
                for (HashMap<String, String> params :
                        commandLoad.getParams()) {
                    executeUpdateCommand(params);
                }
                break;
            case REMOVE:
                for (HashMap<String, String> params :
                        commandLoad.getParams()) {
                    executeRemoveCommand(params);
                }
                break;
            case INFO:
                for (HashMap<String, String> params :
                        commandLoad.getParams()) {
                    executeInfoCommand(params);
                }
                break;
        }
    }

    private static void executeCreateCommand(HashMap<String, String> params) {
        Date date;

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
    }

    private static void executeUpdateCommand(HashMap<String, String> params) {
        String id = "", name = "", sex = "";
        Date date;
        int numericId;
        Person person;

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
    }

    private static void executeRemoveCommand(HashMap<String, String> params) {
        String id = "";
        int numericId;
        Person person;

        id = params.get("id");

        numericId = Integer.parseInt(id);
//        allPeople.remove(numericId);

        person = allPeople.get(numericId);
        person.setBirthDay(null);
        person.setName(null);
        person.setSex(null);
    }

    private static void executeInfoCommand(HashMap<String, String> params) {
        String id = "", name = "", sex = "";
        Date date;
        int numericId;
        Person person;

        id = params.get("id");

        numericId = Integer.parseInt(id);
        person = allPeople.get(numericId);

        name = person.getName();
        sex = person.getSex() == Sex.MALE ? "м" : "ж";
        date = person.getBirthDay();

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        System.out.printf("%s %s %s \n", name, sex, formatter.format(date));
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
