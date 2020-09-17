package com.wno704.designpattern.behavioral.template;

import com.wno704.designpattern.behavioral.template.game.Game;
import com.wno704.designpattern.behavioral.template.game.impl.Cricket;
import com.wno704.designpattern.behavioral.template.game.impl.Football;

public class TemplatePatternDemo {

    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}
