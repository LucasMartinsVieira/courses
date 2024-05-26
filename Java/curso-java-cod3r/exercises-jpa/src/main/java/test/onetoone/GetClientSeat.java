package test.onetoone;

import infra.DAO;
import model.onetoone.Client;
import model.onetoone.Seat;

public class GetClientSeat {
    public static void main(String[] args) {
        DAO<Client> clientDAO = new DAO<>(Client.class);

        Client client = clientDAO.getById(1L);
        System.out.println(client.getSeat().getName());

        clientDAO.close();

        DAO<Seat> seatDAO = new DAO<>(Seat.class);

        Seat seat = seatDAO.getById(4L);
        System.out.println(seat.getClient().getName());

        seatDAO.close();
    }
}
