package com.example.demo.Controllers;

import com.example.demo.Entity.Agent;
import com.example.demo.Entity.sell;
import com.example.demo.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UpdateController {
    @Autowired
    private UsrRepository usrRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private AgentRepository agentRepository;
    @Autowired
    private HouseRepository houseRepository;
    @Autowired
    private CorporateRepository corporateRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private SellRepository sellRepository;
    @Autowired
    private buyRepository buyRepository;
    @Autowired
    private CommunityRepository communityRepository;
    @Autowired
    private PartnerRepository partnerRepository;
    @Autowired
    private PurchaseContractRepository purchaseContractRepository;
    @Autowired
    private SaleContractRepository saleContractRepository;
    @Autowired
    private SchoolRepository schoolRepository;
    @Autowired
    private OfficeRepository officeRepository;
    @RequestMapping("/updateagent/{query}")
    @ResponseBody
    public String updateAgent(@PathVariable String query){
        String[] s = query.split(",");
        Map<String, Integer> map = new HashMap<>();
        map.put("name",1);
        map.put("gender",2);
        map.put("BirthDate",3);
        map.put("address",4);
        map.put("YrExp",5);
        map.put("phone",6);
        map.put("branchOffice",7);
        map.put("id",8);
        Agent agent = new Agent();
        for(String x:s){
            String[] t = x.split(":");
            if(map.containsKey(t[0])){
                int val = map.get(t[0]);
                switch (val){
                    case 1:agent.setName(t[1]);break;
                    case 2:agent.setGender(t[1]);break;
                    case 3:agent.setBirthDate(t[1]);break;
                    case 4:agent.setAddress(t[1]);break;
                    case 5:agent.setYrExp(Integer.parseInt(t[1]));break;
                    case 6:agent.setPhone(t[1]);break;
                    case 7:agent.setBranchOffice(officeRepository.findById(Long.parseLong(t[1])));break;
                    case 8:agent.setId(agentRepository.findById(Long.parseLong(t[1])).getId());break;
                }
            }else{return "Invalid input";}
        }
        agentRepository.save(agent);
        return "insert successfully";
    }
}
