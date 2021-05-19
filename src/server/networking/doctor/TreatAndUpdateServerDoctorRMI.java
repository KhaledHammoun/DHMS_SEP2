package server.networking.doctor;

import client.core.ClientFactory;
import client.core.InterfaceEnum;
import client.model.doctor.TreatAndUpdateModelDoctor;
import client.model.doctor.TreatAndUpdateModelDoctorImpl;
import shared.Disease;
import shared.Doctor;
import shared.Patient;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class TreatAndUpdateServerDoctorRMI implements TreatAndUpdateServerDoctor
{
    private TreatAndUpdateModelDoctor modelDoctor;

    public TreatAndUpdateServerDoctorRMI(Registry registry) throws AlreadyBoundException, RemoteException
    {
        modelDoctor = new TreatAndUpdateModelDoctorImpl(ClientFactory.getClient(InterfaceEnum.DOCTOR_TREAT_UPDATE));
        UnicastRemoteObject.exportObject(this, 0);
        startServer(registry);
    }

    private void startServer(Registry registry) throws AlreadyBoundException, RemoteException
    {
        registry.bind("TreatAndUpdateServerDoctor", this);
        System.out.println("TreatAndUpdateServerDoctor is running!");
    }

    @Override
    public void addDiagnosisToPatient(Patient patient, Disease disease)
    {
        modelDoctor.addDiagnosisToPatient(patient,disease);
    }

    @Override
    public void treatPatient(Patient patient, Disease disease, Doctor doctor)
    {
        modelDoctor.treatPatient(patient, disease, doctor);
    }

    @Override
    public ArrayList<Disease> getAllDiseasesOfPatient(Patient patient)
    {
        return modelDoctor.getAllDiseaseOfPatient(patient);
    }
}
