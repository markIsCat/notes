package fun.sherman.mall.service.impl;


import fun.sherman.mall.bean.UserAddress;
import fun.sherman.mall.service.IUserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Service(version = "1.0.0")
@Component
public class UserServiceImpl implements IUserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress addr1 = new UserAddress(1, "安徽省宣城市宣州区梅溪路110号", "1", "sherman", "15061880000", true);
        UserAddress addr2 = new UserAddress(2, "陕西省西安市长安区长安路119号", "1", "gantlei", "15061889999", false);
        return Arrays.asList(addr1, addr2);
    }
}
