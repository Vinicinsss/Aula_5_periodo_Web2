public class Principal {

    public static void main(String args[]) {
        
        Aluno aluno1 = new Aluno("Vinicius", 19, 1234567101, 1002);
        System.out.println(aluno1.toString());

        Professor professor1 = new Professor("ana", 19, 1234567101, 1002);
        System.out.println(professor1.toString());


    }

}