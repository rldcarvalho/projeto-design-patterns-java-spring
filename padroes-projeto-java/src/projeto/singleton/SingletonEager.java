package projeto.singleton;

/*
* Singleton "Apressado"
* @autor rldcarvalho
*/

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instancia;
    }
}
