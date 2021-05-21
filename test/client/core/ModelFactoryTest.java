package client.core;

import client.model.doctor.AppointmentsModelDoctor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ModelFactoryTest
{

    @Test
    public void setup()
    {
        AppointmentsModelDoctor sut = (AppointmentsModelDoctor) ModelFactory.getModelFactory().getModel(InterfaceEnum.DOCTOR_APPOINTMENT);
        assertNotEquals(null, sut);
    }

}