package org.example;
public class AppExcursiones {
    public static void main(String[] args) {
        Excursion terra_mitica = new Excursion("Terra Mitica", "Benidorm", 30);
        terra_mitica.insertarProfesor();

        terra_mitica.inscribirAsistente();
        terra_mitica.inscribirAsistente();
        terra_mitica.inscribirAsistente();
        terra_mitica.inscribirAsistente();
        terra_mitica.verAsistentes();

        terra_mitica.eliminarAsistentes(16);
    }
}