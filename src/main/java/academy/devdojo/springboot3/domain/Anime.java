package academy.devdojo.springboot3.domain;

public class Anime {
    private String name;

    // Inicializador do valor das variaveis
    public Anime(String name){
        this.name = name;
    }

    public Anime(){
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}

