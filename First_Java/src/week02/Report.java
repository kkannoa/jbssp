package week02;

import java.util.*;

public class Report {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cName = sc.nextLine();
        String recipeTitle = sc.nextLine();
        String recipeContent="";
        int index = 0;
        switch (cName){
            case "Map" :
                Map<String, String> map = new HashMap<>();
                map.put("title" ,"[ " + cName + "으로 저장된 "+ recipeTitle + " ]");

                while(true){
                    index++;
                    recipeContent = sc.nextLine();
                    if(recipeContent.equals("끝")){
                        break;
                    }
                    map.put("content"+index, index + ". " + recipeContent);

                }

                System.out.println(map.get("title"));
                for (int i=1; i < map.size(); i++ ) {
                    System.out.println(map.get("content" + i));
                }

                break;
            case "List" :
                List<String> arrayList = new ArrayList<>();
                arrayList.add("[ " + cName + "로 저장된 "+ recipeTitle + " ]");

                while(true){
                    index++;
                    recipeContent = sc.nextLine();
                    if(recipeContent.equals("끝")){
                        break;
                    }
                    arrayList.add(index + ". " + recipeContent);

                }
                for (Object value : arrayList){
                    System.out.println(value);
                }
                break;
            case "Set" :
                LinkedHashSet<String> hashSet = new LinkedHashSet<>();
                hashSet.add("[ " + cName + "로 저장된 "+ recipeTitle + " ]");

                while(true){
                    index++;
                    recipeContent = sc.nextLine();
                    if(recipeContent.equals("끝")){
                        break;
                    }
                    hashSet.add(index + ". " + recipeContent);

                }
                for (Object value : hashSet){
                    System.out.println(value);
                }

                break;
            default:
                break;
        }
    }
}
