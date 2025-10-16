package org.study;

public class MusicBoxExam {

    public static void main(String[] args) {
        MusicBox box = new MusicBox();

        MusicPlayer kim = new MusicPlayer(1, box);
        MusicPlayer jeong = new MusicPlayer(2, box);
        MusicPlayer lee = new MusicPlayer(3, box);

        kim.start();
        jeong.start();
        lee.start();
    }
}
