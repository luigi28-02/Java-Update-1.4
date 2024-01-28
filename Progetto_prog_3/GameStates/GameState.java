    package Progetto_prog_3.GameStates;

    public enum GameState {

        PLAYING, MENU, OPTION, QUIT,SELECT_CHARACTER;

        public static GameState state = MENU;
    //Enumerazione in base al player scelto
    public enum Player_Choose
    {
        ARGO,NOCTURNUS;
        public static Player_Choose player_choose=NOCTURNUS;

    }
    }
