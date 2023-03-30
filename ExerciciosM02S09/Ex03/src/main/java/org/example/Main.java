package org.example;

import jakarta.persistence.*;


public class Main {
    public static void main(String[] args) {

        Objeto objeto = new Objeto();
        objeto.setNome("Objeto");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("exercicio_03");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();// aqui é necessário pra iniciar sequencia de comandos para o BD
        em.persist(objeto); // aqui está inserindo (INSERT) o produto (salva na base)
        em.getTransaction().commit(); // aqui commita no BD
        em.close(); // aqui encerra os comandos

    }
}