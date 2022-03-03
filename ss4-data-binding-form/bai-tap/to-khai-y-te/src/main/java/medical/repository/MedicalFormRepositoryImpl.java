package medical.repository;

import medical.model.MedicalForm;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicalFormRepositoryImpl implements IMedicalFormRepository {
    private static final List<MedicalForm> medicalFormList = new ArrayList<>();
    static {
        medicalFormList.add(new MedicalForm("Nguyễn Thị Thu","1993","Nữ","Việt Nam","239456789","Ô tô","C79-567876","4","2022-09-25",
                "2022-09-26","không có","Đà Nẵng","Liên Chiểu","Hòa Minh","68 Nguyễn Viết Xuân,Hòa Minh,Liên Chiểu,Đà Nẵng","0987654567","thunguyen@gmail.com",
                "không","không"));
    }

    @Override
    public List<MedicalForm> findAll() {
        return medicalFormList;
    }


    @Override
    public void create(MedicalForm medicalForm) {
        medicalFormList.add(medicalForm);

    }
}
