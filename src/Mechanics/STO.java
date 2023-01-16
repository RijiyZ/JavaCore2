package Mechanics;

import Transports.Bus;
import Transports.Transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class STO {
    private final Queue<Transport> transportQueue = new ArrayDeque<>();

    public void addTransport(Transport transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусы не нуждаются в техобслуживании");
        } else {
            transportQueue.add(transport);
        }
    }

    // провести техосмотр
    public void runTO() {
        Transport transport = transportQueue.poll();
        if (transport != null) {
            transport.getMechanics().get(0).runTO();
        }
    }
}
