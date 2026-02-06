class Main{

    public static void main(String args[]){
        String[] names = {
                "J&ohn Doe!",
                "Al[ice Smith?",
                "Bo>b Brown#",
                "E//ve Taylor$",
                "Ben% Brown"
        };

        System.out.println("Before sorting:");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }


        for(int i = 0 ; i < names.length ; i++){
            names[i] = names[i].replaceAll("[^a-zA-Z ]", "");
        }

        int size = names.length;
        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size  - i -1 ; j++){
                if(names[j].compareToIgnoreCase(names[j+1])>0){
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("After sorting:");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
    }
}