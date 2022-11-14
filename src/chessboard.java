import GLOOP.*;
class chessboard{
    GLKamera cam;
    GLLicht light;

    GLQuader[] board;

    chessboard(){
        cam = new GLEntwicklerkamera();
        cam.setzePosition(0,500,300);
        light = new GLLicht();

        board = new GLQuader[64];
        int a = 0;
        for (int j=-4; j<4; j++){
            for (int i=-4; i<4; i++){
                board[a] = new GLQuader(i*50,0,j*50,50,20,50);
                if ((i+j) % 2 == 0) board[a].setzeFarbe(0,0,0);
                a++;
            }
        }
    }
}
