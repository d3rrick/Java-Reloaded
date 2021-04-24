
import java.util.ArrayList;
import java.util.List;

public class EdgeList {
    static List<Character> vertices = new ArrayList<>(){{
        add('A');
        add('B');
        add('C');
        add('D');
        add('E');
    }};

    static List<List<Character>> edges = new ArrayList<>(){{
        ArrayList<Character> temp = new ArrayList<>();
        temp.add('A');
        temp.add('B');
        {{add(temp);}}

        ArrayList<Character> temp2 = new ArrayList<>();
        temp2.add('A');
        temp2.add('D');
        {{add(temp2);}}

        ArrayList<Character> temp3 = new ArrayList<>();
        temp3.add('B');
        temp3.add('C');
        {{add(temp3);}}

        ArrayList<Character> temp4 = new ArrayList<>();
        temp4.add('C');
        temp4.add('D');
        {{add(temp4);}}

        ArrayList<Character> temp5 = new ArrayList<>();
        temp5.add('C');
        temp5.add('E');
        temp5.add('A');
        {{add(temp5);}}

        ArrayList<Character> temp6 = new ArrayList<>();
        temp6.add('D');
        temp6.add('E');
        {{add(temp6);}}

        ArrayList<Character> temp7 = new ArrayList<>();
        temp7.add('C');
        temp7.add('K');
        temp7.add('M');
        {{add(temp7);}}
    }};

    public static void main(String[] args) {
        System.out.println(getAdjacentEdges('E'));
        System.out.println(isConnected('A','K'));
    }

    static List<Character> getAdjacentEdges(char node){
        List<Character> result = new ArrayList<>();
        for (List<Character> edge : edges){
            if (edge.contains(node)){
                int i = edge.indexOf(node);
                result.addAll(edge.subList(0,i));
                result.addAll(edge.subList(i+1,edge.size()));
            }
        }
        return result;
    }

    static boolean isConnected(char nodeOne, char nodeTwo){
        for (List<Character> edge: edges){
            if (edge.contains(nodeOne) && edge.contains(nodeTwo)){
                return true;
            }
        }
        return false;
    }
}
