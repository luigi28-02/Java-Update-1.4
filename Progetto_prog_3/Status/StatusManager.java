package Progetto_prog_3.Status;
import Progetto_prog_3.entities.Entity;
import Progetto_prog_3.entities.Players.Player;
import Progetto_prog_3.entities.Players.Players;

public class StatusManager {

    public void applySlow(Entity entity, int duration, float slowValue){

        //Si conserva lo stato attuale della velocità di movimento della entità
        float startingWalkSpeed = entity.getWalkSpeed();
        //Viene creato un nuovo thread che gestisce il debuff
        Thread slowThread = new Thread(() -> {
            //Semplicemente viene settata una debuff speed al valore passato come parametro
            entity.setWalkSpeed(slowValue);
            //Si effettua uno sleep del thread della durata del debuff scelta
            try {
                Thread.sleep(duration * 1000);
            } catch (Exception e) {
                System.out.println("Qualcosa è andato storto nella funzione di slow");
                e.printStackTrace();
            }
            //Quando la sleep è finita viene ripsistinata la velocità di movimento
            entity.setWalkSpeed(startingWalkSpeed);
        });

        //Una volta creato il thread questo viene eseguito lanciando le istruzioni
        slowThread.start();

    }

    //Il player può saltare piu in alto
    public void applyjump(Player player, int duration, float jumpValue)
    {
        float startingGravityset = player.getGravityset();
        //Si conserva lo stato attuale della velocità di movimento della entità

        //Viene creato un nuovo thread che gestisce il debuff
        Thread applyThread = new Thread(() -> {
            //Semplicemente viene settata una debuff speed al valore passato come parametro
            player.setGravityset(-0.06f);
            //Si effettua uno sleep del thread della durata del debuff scelta
            try {
                Thread.sleep(duration * 1000);
            } catch (Exception e) {
                System.out.println("Qualcosa è andato storto nella funzione di slow");
                e.printStackTrace();
            }
            //Quando la sleep è finita viene ripsistinata la velocità di movimento
            player.setGravityset(startingGravityset);

        });

        //Una volta creato il thread questo viene eseguito lanciando le istruzioni
        applyThread.start();

    }

    //Questa funzione setta l'invulnerabilità per un determinato periodo ad una entità
    public void giveInvulnerability(Entity entity, float duration){

        //Si crea un nuovo thread che effettua una sleep sulla invulnerabilità della entità
        //dopo averla setata a true, per poi riportarla a false
        Thread invulnerability= new Thread(() -> {

            entity.setInvulnerability(true);

            try {
                Thread.sleep((int)(duration * 1000));
            } catch (Exception e) {
                System.out.println("Qualcosa è andato storto nello status invulnerability");
                e.printStackTrace();
            }

            //Finita la sleep la caratteristica viene resettata a falsa
            entity.setInvulnerability(false);

        });

        invulnerability.start();
        
    }

}
