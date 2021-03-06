package tests;

import main.Binder;
import main.Pessoa;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by HelioCaetano on 13-03-2014.
 */

public class BinderTests {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Pessoa p = new Pessoa(1, 20, "João");
        Map<String, Object> map = Binder.getFieldsValues(p);

        for(Map.Entry e : map.entrySet())
            System.out.println(e.getKey() + " = " + e.getValue());

        Pessoa p2 = null;
        System.out.println("-----------------------DEBUG------------------------------");

        Map<String, Object> fields = new HashMap<String, Object>();
        fields.put("salario", 3000);
        fields.put("id", 1);
        fields.put("morada", "Avenida dos perdidos");
        fields.put("nome", "Zé Manel");
        fields.put("salario", 3000);
        fields.put("idade", 33);

        p2 = Binder.bindToFields(Pessoa.class, fields);
        System.out.println(p2.getIdade());
        System.out.println(p2.nome);
        System.out.println(p2.getId());
    }
}