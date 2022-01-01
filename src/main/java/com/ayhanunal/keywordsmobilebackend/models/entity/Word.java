package com.ayhanunal.keywordsmobilebackend.models.entity;

import com.ayhanunal.keywordsmobilebackend.util.WordLevels;

import javax.persistence.*;

@Entity
@Table(name = "words")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String ing;
    private String tr;
    private int level;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIng() {
        return ing;
    }

    public void setIng(String ing) {
        this.ing = ing;
    }

    public String getTr() {
        return tr;
    }

    public void setTr(String tr) {
        this.tr = tr;
    }

    public WordLevels getLevel() {
        WordLevels wordLevels;
        switch (level){
            case 2: wordLevels = WordLevels.MEDIUM; break;
            case 3: wordLevels = WordLevels.HARD; break;
            default:
                wordLevels = WordLevels.EASY; break;
        }
        return wordLevels;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
