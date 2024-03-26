class cat {
    private String name;
    private int age;
    private String gender;
    private String personality;

    cat(String name, int age, String gender, String personality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.personality = personality;
    }


    public void sleep(){
        System.out.println(name + ": Zzzz..");
    }
    public void eat(){
        System.out.println(name + ": nom nom nom yummy!");
    }
    public void meow(){
        System.out.println(name + ": meow!");
    }
    public void play(){
        System.out.println(name + ": let's play buddy!");
    }

    public String getName() {
        return name;
    }

    public String getGender() {

        return gender;
    }

    public int getAge() {

        return age;
    }

    public String getPersonality() {

        return personality;
    }
}
