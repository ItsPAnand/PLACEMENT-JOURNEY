package SkillRack;

public class firstLetterUppercaseString {
    public static void main(String[] args) {
        String S="i like      coffSee Hi hdd gfgkf G";            // output is "I Like Coffee"
        String parts[]=S.split(" ");
        for(int i=0;i<parts.length;i++){
            if(!parts[i].isEmpty()){
                StringBuilder str=new StringBuilder(parts[i]);
                str.replace(0, 1, String.valueOf(parts[i].charAt(0)).toUpperCase());
                parts[i]=str.toString();
            }
            
        }
        for(String i:parts)
            System.out.print(i+" ");
    }
}


// public class firstLetterUppercaseString {
//     public static void main(String[] args) {
//         String S = "i like      coffSee Hi hdd gfgkf G"; // output should be "I Like Coffee"
//         String parts[] = S.split(" ");
//         StringBuilder result = new StringBuilder();

//         for (int i = 0; i < parts.length; i++) {
//             if (!parts[i].isEmpty()) {
//                 StringBuilder str = new StringBuilder(parts[i]);
//                 str.replace(0, 1, String.valueOf(parts[i].charAt(0)).toUpperCase());
//                 parts[i] = str.toString();
//                 result.append(parts[i]).append(" ");
//             }
//         }

//         String finalResult = result.toString().trim();
//         System.out.println(finalResult);
//     }
// }
