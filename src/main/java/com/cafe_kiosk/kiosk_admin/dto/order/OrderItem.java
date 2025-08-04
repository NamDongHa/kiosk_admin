package com.cafe_kiosk.kiosk_admin.dto.order;

import com.cafe_kiosk.kiosk_admin.dto.MenuDTO;
import com.cafe_kiosk.kiosk_admin.dto.MenuOption;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    private Integer orderItemId;
    private Orders order;
    private MenuDTO menuDTO;
    private MenuOption option;
    private Integer quantity = 1;
    private Integer price;
}
