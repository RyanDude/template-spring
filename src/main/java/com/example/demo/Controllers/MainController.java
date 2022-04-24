package com.example.demo.Controllers;

import com.example.demo.Entity.*;
import com.example.demo.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@RestController
public class MainController {
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
    // DB TEST
    @RequestMapping("/test")
    public Usr getU(){
        Usr u = usrRepository.findByUsername("jguo15");
        System.err.println(u.getLastname());
        return u;
    }
    @RequestMapping("/add")
    @ResponseBody
    public String add(){
        Usr u = new Usr();
        Role r = new Role();
        u.setId(0);
        u.setFirstname("J");
        u.setLastname("Guo");
        u.setPassword("123456");
        r.setId(0);
        r.setRoles("ADMIN");
        r.setUsr(u);
        usrRepository.save(u);
        roleRepository.save(r);
        return "add successfully";
    }
    // check
    @RequestMapping("/usr/{id}")
    @ResponseBody
    public Usr show_usr(@PathVariable String id){
        Usr u = usrRepository.findById(Long.parseLong(id));
        if(u != null){
            return u;
        }
        return null;
    }
    @RequestMapping("/findagent/{name}")
    @ResponseBody
    public List<Agent> find_agent_by_name(@PathVariable String name){
        List<Agent> agents = agentRepository.findByName(name);
        if(!agents.isEmpty()){return agents;}
        return null;
    }
    @RequestMapping("/allagent")
    @ResponseBody
    public List<Agent> get_all_agent(){
        return agentRepository.getall();
    }
    @RequestMapping("/allhouse")
    @ResponseBody
    public List<House> get_all_house(){
        return houseRepository.getall();
    }
    @RequestMapping("/allcor")
    @ResponseBody
    public List<Corporate> get_all_cor(){
        return corporateRepository.getall();
    }
    @RequestMapping("/allcus")
    @ResponseBody
    public List<Customer> allcus(){
        return customerRepository.getall();
    }
    @RequestMapping("/allsell")
    @ResponseBody
    public List<sell> allsell(){
        return sellRepository.getall();
    }
    @RequestMapping("/allbuy")
    @ResponseBody
    public List<buy> allbuy(){
        return buyRepository.getall();
    }
    // save
    @RequestMapping("/savecus/{str}")
    @ResponseBody
    public String save_cus(@PathVariable String str){
        String[] s = str.split(",");
        Map<String, Integer> map = new HashMap<>();
        map.put("name",1);
        map.put("MaritalStatus",2);
        map.put("phone",3);
        map.put("email",4);
        map.put("agent",5);
        Customer c = new Customer();
        for(String x:s){
            String[] t = x.split(":");
            if(map.containsKey(t[0])){
                int val = map.get(t[0]);
                switch (val){
                    case 1:c.setName(t[1]);break;
                    case 2:c.setMaritalStatus(t[1]);break;
                    case 3:c.setPhone(t[1]);break;
                    case 4:c.setEmail(t[1]);break;
                    case 5:c.setAgent(agentRepository.findById(Long.parseLong(t[1])));break;
                }
            }else{return "Invalid input";}
        }
        customerRepository.save(c);
        return "insert successfully";
    }
    @RequestMapping("/savehouse/{str}")
    @ResponseBody
    public String save_house(@PathVariable String str){
        String[] s = str.split(",");
        Map<String, Integer> map = new HashMap<>();
        map.put("Address",1);
        map.put("county",2);
        map.put("type",3);
        map.put("ListPrice",4);
        map.put("status",5);
        map.put("offers",6);
        map.put("sqft",7);
        map.put("tax",8);
        map.put("NumOfBed",9);
        map.put("NumOfBath",10);
        map.put("community",11);
        House house = new House();
        for(String x:s){
            String[] t = x.split(":");
            if(map.containsKey(t[0])){
                int val = map.get(t[0]);
                switch (val){
                    case 1:house.setAddress(t[1]);break;
                    case 2:house.setCounty(t[1]);break;
                    case 3:house.setType(t[1]);break;
                    case 4:house.setListPrice(Double.parseDouble(t[1]));break;
                    case 5:house.setStatus(t[1]);break;
                    case 6:house.setOffers(Integer.parseInt(t[1]));break;
                    case 7:house.setSqft(Integer.parseInt(t[1]));break;
                    case 8:house.setTax(Double.parseDouble(t[1]));break;
                    case 9:house.setNumOfBed(Integer.parseInt(t[1]));break;
                    case 10:house.setNumOfBath(Integer.parseInt(t[1]));break;
                    case 11:house.setCommunity(communityRepository.findById(Long.parseLong(t[1])));break;
                }
            }else{return "Invalid input";}
        }
        houseRepository.save(house);
        return "insert successfully";
    }
    @RequestMapping("/saveagent/{str}")
    @ResponseBody
    public String save_agent(@PathVariable String str){
        String[] s = str.split(",");
        Map<String, Integer> map = new HashMap<>();
        map.put("name",1);
        map.put("gender",2);
        map.put("BirthDate",3);
        map.put("address",4);
        map.put("YrExp",5);
        map.put("phone",6);
        map.put("branchOffice",7);
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
                }
            }else{return "Invalid input";}
        }
        agentRepository.save(agent);
        return "insert successfully";
    }
    @RequestMapping("/saveschool/{str}")
    @ResponseBody
    public String save_school(@PathVariable String str){
        String[] s = str.split(",");
        Map<String, Integer> map = new HashMap<>();
        map.put("elementary",1);
        map.put("e_rating",2);
        map.put("middle_school",3);
        map.put("m_rating",4);
        map.put("high_school",5);
        map.put("h_rating",6);
        School school = new School();
        for(String x:s){
            String[] t = x.split(":");
            if(map.containsKey(t[0])){
                int val = map.get(t[0]);
                switch (val){
                    case 1:school.setElementary(t[1]);break;
                    case 2:school.setE_rating(Integer.parseInt(t[1]));break;
                    case 3:school.setMiddle_school(t[1]);break;
                    case 4:school.setM_rating(Integer.parseInt(t[1]));break;
                    case 5:school.setHigh_school(t[1]);break;
                    case 6:school.setH_rating(Integer.parseInt(t[1]));break;
                }
            }else{return "Invalid input";}
        }
        schoolRepository.save(school);
        return "insert successfully";
    }
    @RequestMapping("/savepartner/{str}")
    @ResponseBody
    public String save_partner(@PathVariable String str){
        String[] s = str.split(",");
        Map<String, Integer> map = new HashMap<>();
        map.put("Name",1);
        map.put("Phone",2);
        map.put("Expertise",3);
        map.put("YrExp",4);
        Partner partner = new Partner();
        for(String x:s){
            String[] t = x.split(":");
            if(map.containsKey(t[0])){
                int val = map.get(t[0]);
                switch (val){
                    case 1:partner.setName(t[1]);break;
                    case 2:partner.setPhone(t[1]);break;
                    case 3:partner.setExpertise(t[1]);break;
                    case 4:partner.setYrExp(t[1]);break;
                }
            }else{return "Invalid input";}
        }
        partnerRepository.save(partner);
        return "insert successfully";
    }
    @RequestMapping("/savecor/{str}")
    @ResponseBody
    public String save_cor(@PathVariable String str){
        String[] s = str.split(",");
        Map<String, Integer> map = new HashMap<>();
        map.put("agent",1);
        map.put("partner",2);
        Corporate corporate = new Corporate();
        for(String x:s){
            String[] t = x.split(":");
            if(map.containsKey(t[0])){
                int val = map.get(t[0]);
                switch (val){
                    case 1:corporate.setAgent(agentRepository.findById(Long.parseLong(t[1])));break;
                    case 2:corporate.setPartner(partnerRepository.findById(Long.parseLong(t[1])));break;
                }
            }else{return "Invalid input";}
        }
        corporateRepository.save(corporate);
        return "insert successfully";
    }
    @RequestMapping("/savecorscontract/{str}")
    @ResponseBody
    public String save_sale_contract(@PathVariable String str) throws ParseException {
        String[] s = str.split(",");
        Map<String, Integer> map = new HashMap<>();
        map.put("date",1);
        map.put("sold_price",2);
        map.put("payment_method",3);
        SaleContract saleContract = new SaleContract();

        for(String x:s){
            String[] t = x.split(":");
            if(map.containsKey(t[0])){
                int val = map.get(t[0]);
                switch (val){
                    case 1:saleContract.setDate(Date.valueOf(java.time.LocalDate.now()));break;
                    case 2:saleContract.setSold_price(Double.parseDouble(t[1]));break;
                    case 3:saleContract.setPayment_method(t[1]);break;
                }
            }else{return "Invalid input";}
        }
        saleContractRepository.save(saleContract);
        return "insert successfully";
    }
    @RequestMapping("/savesell/{str}")
    @ResponseBody
    public String save_sell(@PathVariable String str){
        String[] s = str.split(",");
        Map<String, Integer> map = new HashMap<>();
        map.put("house",1);
        map.put("saleContract",2);
        sell se = new sell();
        for(String x:s){
            String[] t = x.split(":");
            if(map.containsKey(t[0])){
                int val = map.get(t[0]);
                switch (val){
                    case 1:se.setHouse(houseRepository.findById(Long.parseLong(t[1])));break;
                    case 2:se.setSaleContract(saleContractRepository.findById(Long.parseLong(t[1])));break;
                }
            }else{return "Invalid input";}
        }
        sellRepository.save(se);
        return "insert successfully";
    }
}
