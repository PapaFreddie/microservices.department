package com.emmanuelpapa.user.service;

import com.emmanuelpapa.user.VO.Department;
import com.emmanuelpapa.user.VO.ResponseTemplateVO;
import com.emmanuelpapa.user.entity.Userr;
import com.emmanuelpapa.user.repository.UserrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserrService {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UserrRepository userrRepository;
    public Userr saveUserr(Userr userr) {
        return userrRepository.save(userr);
    }

    public ResponseTemplateVO getUserById(Long userrdId) {
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        Userr userr = userrRepository.getUserById(userrdId);

        Department department = restTemplate.getForObject("http://localhost:8080/departments" + userr.getDepartmentId(), Department.class);

        responseTemplateVO.setUserr(userr);
        responseTemplateVO.setDepartment(department);

        return responseTemplateVO;
    }
}
