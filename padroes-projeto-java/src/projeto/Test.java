package projeto;

import projeto.facade.Facade;
import projeto.singleton.SingletonEager;
import projeto.singleton.SingletonLazy;
import projeto.singleton.SingletonLazyHolder;
import projeto.strategy.*;

public class Test {
    public static void main(String[] args) {

        //Testes relacionados ao design pattern Singleton:

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //Testes relacionados ao design pattern Strategy:

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();

        //Testes relacionados ao design pattern Strategy:

        Facade facade = new Facade();
        facade.migrarCliente("Rafael", "36300000");

    }
}
