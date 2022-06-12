package app.model.response;

import app.model.Barber;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class BarberRequest implements Serializable {

    @Getter
    @Setter
    long id;

    public BarberRequest fromBarber(Barber barber) {
        this.id = barber.getId();
        return this;
    }
}
