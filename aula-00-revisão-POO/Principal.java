public class Principal {

    public static void main(String args[]) {
        Pessoa objPessoa = new Pessoa();
        System.out.println(objPessoa.toString());

        Pessoa objPessoa2 = new Pessoa("Rafael", 34);
        System.out.println(objPessoa2.toString());

        Pessoa objPessoa3 = new Pessoa("Vinicius", 19, 1234567);
        System.out.println(objPessoa3.toString());


    }

}