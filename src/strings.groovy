import java.util.concurrent.atomic.AtomicIntegerFieldUpdater

class strings {
    static void main(String[] args) {
        def name = "Derek";
        println('Iam ${name}\n');
        println("Iam ${name}\n");
        println("Iam $name\n");
        def multistring = '''nsdhfsjkdh
            fdsdfhsdkjf
            fsdklfskdfjdskl''';
        println(multistring);
        println("3 rd index of name-->"+ name[3]);
        println("location of r-->"+name.indexOf('r'));
        println("0-2 location-->" + name[0..2]);
        println("Every other character "+ name[0,2,4]);
        println(name.substring(1));
        println(name.substring(1,4));

        println("My anme " +name);
        println("My name".concat("new"));
        println("My name is "*2);
        println("equating strings "+ ('Derek'.equals('Derek')));
        println("equating strings "+ ('Derek'.equalsIgnoreCase('derek')));
        println("Length ="+name.length());


        def repeatStr = " what i said is true" * 2;
        println(repeatStr - "what");

        println(repeatStr.split(' '));
        println(repeatStr.toList());

        println(repeatStr.replace('i','He'));
        println(repeatStr.toUpperCase());
        println(repeatStr.toLowerCase());


        println("Ant <=> Banana " + ('Ant' <=> 'Banana'));
        println("Banana <=> Ant " + ('Banana' <=> 'Ant'));
        println("Ant <=> Ant " + ('Ant' <=> 'Ant'));
    }
}



