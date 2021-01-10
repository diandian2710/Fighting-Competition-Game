import com.sgbf.core.state.CStateManager;
import com.sgbf.core.state.CTestListener;
import com.sgbf.gladiators.CBarbarian;
import com.sgbf.gladiators.CGladiatorState;
import com.sgbf.gladiators.CSamnite;
import com.sgbf.tournament.CTournament;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test {
    @org.junit.Test
    public void questionOne() throws IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException, NoSuchMethodException {
        Constructor<?> constructor = CTournament.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        CTournament tournament = (CTournament) constructor.newInstance(5);
//        for (Method method : CTournament.class.getDeclaredMethods()) {
//            method.setAccessible(true);
//            if (method.getName().equals("displayTournamentStandings")){
//                method.invoke(tournament);
//            }
//        }
//        Class<?> clazz = Class.forName("com.sgbf.tournament.CTournament");
//        Constructor<?> cla = clazz.getDeclaredConstructor(int.class);
//        CTournament ct = (CTournament) cla.newInstance(2);
//

    }

    @org.junit.Test
    public void questionFive() {
        CTestListener test = new CTestListener();
        CBarbarian barbarian = new CBarbarian("barbarian");
        CSamnite samnite = new CSamnite("samnite");
        CStateManager.instance().setState(new CGladiatorState("Blank", 0));
    }

    @org.junit.Test
    public void test() {
        int i = 100;
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            int result = (int) Math.floor(Math.random() * 20) + 1;
            list.add(result);
        }
        System.out.println(list.stream().max((a,b)->a.compareTo(b)));
    }
    @org.junit.Test
    public void test1(){
        System.out.println(Math.floor(Math.random() * 1) + 1);
    }

}
