package client.core;

import client.model.doctor.AppointmentsModelDoctor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelFactoryTest
{

    @Test
    public void setup()
    {
        AppointmentsModelDoctor sut = (AppointmentsModelDoctor) ModelFactory.getModel(InterfaceEnum.DOCTOR_APPOINTMENT);
        assertNotEquals(null, sut);
    }

}