package Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import Inventory.ItemInventory;
import Repository.ItemRepository;
import DTO.ItemDTO;
import Entity.Item;

@Controller
public class ItemController {
    private ItemRepository itemRepository;
    private ItemInventory itemInventory;

    @GetMapping
    public String showItemPage(Model model, HttpSession session) {
        return "";
    }

    @PostMapping
    public String addItem(ItemDTO itemDTO, Model model, HttpSession session) {
        return "";
    }

    @GetMapping
    public String getItems(Model model, HttpSession session, String category) {
        return "";
    }

    @GetMapping
    public String getItemDetail(Model model, HttpSession session, Long itemId) {
        return "";
    }

    @GetMapping
    public String searchItems(Model model, HttpServletRequest request, HttpSession session) {
        return "";
    }

    @PostMapping
    public String deleteItem(HttpServletRequest request, Model model, HttpSession session, Long itemId) {
        return "";
    }
}
