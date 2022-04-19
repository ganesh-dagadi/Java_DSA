class StringsLearn{
    public static void main(String[] args){
        String str = new String("HI");
        str = str.concat(" concat");
        System.out.println(str);

        StringBuffer str2 = new StringBuffer("HI");
        str2.append("Concat");
        System.out.println(str2);
    }
}